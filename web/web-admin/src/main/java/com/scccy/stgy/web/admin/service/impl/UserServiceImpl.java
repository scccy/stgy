package com.scccy.stgy.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scccy.stgy.model.domain.BaseModel;
import com.scccy.stgy.model.domain.SystemPost;
import com.scccy.stgy.model.domain.SystemUser;
import com.scccy.stgy.model.dto.UserPageDto;
import com.scccy.stgy.model.vo.UserPageVo;
import com.scccy.stgy.web.admin.service.SystemPostService;
import com.scccy.stgy.web.admin.service.SystemUserService;
import com.scccy.stgy.web.admin.service.UserService;
import jakarta.annotation.Resource;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    SystemUserService systemUserService;
    @Resource
    SystemPostService systemPostService;
    @Override
    public void updateStatusById(Integer id, String status) {

    }

    @Override
    public void saveOrUpdate(SystemUser systemUser) {
        if (systemUser.getId() == null || StringUtils.hasLength(systemUser.getPassword())) {
            //  密码加密为了保证数据库中的密码安全  后台的管理人员无法根据数据库密码盗取用户信息
            // MD5加密  ： 加密和解密的密钥相同    相同的明文MD5加密后的结果始终一样  不可逆
            //        对文件、数据进行MD5加密可以得到一个固定长度的字符串(64/32)
            // MD5加盐加密 ： 为每次加密生成一个随机字符串  和明文字符串一起按照一定规则加密
            // 非对称加密 ： 加密和解密的密钥不同  后面支付会使用到 (gitee 配置ssh免密登录也使用到了)  RSA
            String password = systemUser.getPassword();
            String salt = UUID.randomUUID().toString().substring(0, 6);
            String encodedPwd = DigestUtils.md5Hex(DigestUtils.md5Hex(password) + salt);
            //使用加密的密码保存
            systemUser.setSalt(salt);
            systemUser.setPassword(encodedPwd);
            if(systemUser.getId()==null){
                //头像
                systemUser.setAvatarUrl("https://img1.baidu.com/it/u=2993429756,1626503545&fm=253&app=120&size=w931&n=0&f=JPEG&fmt=auto?sec=1717347600&t=b4c2d731aa2636db5495f509bfa8f98e");
                //1表示正常  账户状态
                systemUser.setStatus((byte) 1);
            }
            //2、保存用户数据到数据库
            systemUserService.saveOrUpdate(systemUser);

        }
    }

    @Override
    public boolean isUserNameAvailable(String username) {
        long count = systemUserService.count(Wrappers.lambdaQuery(SystemUser.class).eq(SystemUser::getUsername, username));
        return count == 0;
    }

    @Override
    public Page<UserPageVo> page(Page<SystemUser> systemUserPage, UserPageDto userPageDto) {
        LambdaQueryWrapper<SystemUser> queryWrapper = Wrappers.lambdaQuery(SystemUser.class);
        String name = userPageDto.getName();
        String phone = userPageDto.getPhone();
        if(StringUtils.hasLength(name))queryWrapper.like(SystemUser::getName,name);
        if(StringUtils.hasLength(phone))queryWrapper.like(SystemUser::getPhone,phone);

        Page<SystemUser> page = systemUserService.page(systemUserPage, queryWrapper);
        List<UserPageVo> collect = page.getRecords().stream().map(
                systemUser -> {
                    UserPageVo userPageVo = new UserPageVo();
                    BeanUtils.copyProperties(systemUser,userPageVo);
                    userPageVo.setPassword("");
                    userPageVo.setSalt("");
                    userPageVo.setPostName(systemPostService.getOne(Wrappers.lambdaQuery(SystemPost.class).eq(BaseModel::getId, systemUser.getPostId())).getName());
                    return userPageVo;

                }
        ).collect(Collectors.toList());
        Page<UserPageVo> userPageVoPage = new Page<>();

        BeanUtils.copyProperties(page,userPageVoPage);
        userPageVoPage.setRecords(collect);
        return userPageVoPage;
    }



    @Override
    public UserPageVo getById(long id) {
        SystemUser one = systemUserService.getOne(Wrappers.lambdaQuery(SystemUser.class).eq(BaseModel::getId, id));
        SystemPost systemPost = systemPostService.getOne(Wrappers.lambdaQuery(SystemPost.class).eq(BaseModel::getId,one.getPostId()));
        UserPageVo userPageVo = new UserPageVo();
        BeanUtils.copyProperties(one,userPageVo);
        userPageVo.setPostName(systemPost.getName());
        userPageVo.setPassword("");
        userPageVo.setSalt("");
        return userPageVo;
    }
    @Override
    public void deleteById(long id) {
       systemUserService.remove(Wrappers.lambdaQuery(SystemUser.class).eq(BaseModel::getId,id));
    }
}
