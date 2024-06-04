package com.scccy.stgy.model.vo;

import com.scccy.stgy.model.domain.SystemUser;
import lombok.Data;

@Data
public class UserPageVo extends SystemUser {
    private String postName;
}
