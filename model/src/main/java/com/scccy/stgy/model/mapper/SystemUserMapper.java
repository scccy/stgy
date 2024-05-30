package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.SystemUser;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SystemUserMapper extends BaseMapper<SystemUser> {
    int updateBatch(List<SystemUser> list);

    int batchInsert(@Param("list") List<SystemUser> list);

    int insertOrUpdate(SystemUser record);

    int insertOrUpdateSelective(SystemUser record);
}