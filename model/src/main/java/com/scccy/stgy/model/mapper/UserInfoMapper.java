package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.UserInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper extends BaseMapper<UserInfo> {
    int updateBatch(List<UserInfo> list);

    int batchInsert(@Param("list") List<UserInfo> list);

    int insertOrUpdate(UserInfo record);

    int insertOrUpdateSelective(UserInfo record);
}