package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.RoomAttrValue;

import java.util.List;

import com.scccy.stgy.model.vo.AttrValueVo;
import org.apache.ibatis.annotations.Param;

public interface RoomAttrValueMapper extends BaseMapper<RoomAttrValue> {
    int updateBatch(List<RoomAttrValue> list);

    int batchInsert(@Param("list") List<RoomAttrValue> list);

    int insertOrUpdate(RoomAttrValue record);

    int insertOrUpdateSelective(RoomAttrValue record);

    List<AttrValueVo> getAttrValueVos(Integer id);
}