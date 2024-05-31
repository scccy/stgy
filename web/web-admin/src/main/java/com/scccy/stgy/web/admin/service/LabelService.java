package com.scccy.stgy.web.admin.service;

import com.scccy.stgy.model.domain.LabelInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LabelService {
    boolean saveOrUpdate(LabelInfo labelInfo);

    List<LabelInfo> list(Integer type);

    boolean deleteById(Long id);
}
