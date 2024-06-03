package com.scccy.stgy.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scccy.stgy.model.domain.RoomAttrValue;
import com.scccy.stgy.model.vo.RoomAttrValueVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomAttrValueMapper extends BaseMapper<RoomAttrValue> {
    int updateBatch(List<RoomAttrValue> list);

    int batchInsert(@Param("list") List<RoomAttrValue> list);

    int insertOrUpdate(RoomAttrValue record);

    int insertOrUpdateSelective(RoomAttrValue record);

    List<RoomAttrValueVo> getAttrValueVos(Long id);
}