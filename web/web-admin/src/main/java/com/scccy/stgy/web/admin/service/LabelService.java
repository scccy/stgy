package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.LabelInfo;
import org.springframework.stereotype.Service;


public interface LabelService {
    boolean saveOrUpdate(LabelInfo labelInfo);
}
