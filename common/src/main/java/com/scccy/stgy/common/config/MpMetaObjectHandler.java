package com.scccy.stgy.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class MpMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        //新增更新时 都需要填充
        if(metaObject.hasSetter("createTime")){
            metaObject.setValue("createTime" , new Date());
        }
        if(metaObject.hasSetter("updateTime")){
            metaObject.setValue("updateTime" , new Date());
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if(metaObject.hasSetter("updateTime")){
            metaObject.setValue("updateTime" , new Date());
        }
    }
}
