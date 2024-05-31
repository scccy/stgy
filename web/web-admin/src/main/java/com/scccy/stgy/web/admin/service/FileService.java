package com.scccy.stgy.web.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


public interface FileService {
    String upload(MultipartFile file);
}
