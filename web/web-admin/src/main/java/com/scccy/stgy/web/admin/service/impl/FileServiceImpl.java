package com.scccy.stgy.web.admin.service.impl;

import com.scccy.stgy.common.config.MinioConfig;
import com.scccy.stgy.web.admin.service.FileService;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import jakarta.annotation.Resource;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {
    @Resource
    MinioClient minioClient;

    @Override
    public String upload(MultipartFile file) {
        if (file.isEmpty()) {
            //上传文件内容为空
            throw new RuntimeException("上传文件不能为空");
        }
        try {
            //获取上传的文件名称
            String originalFilename = file.getOriginalFilename();
            //获取上传的文件输入流
            InputStream inputStream = file.getInputStream();
            //使用minio的api上传文件
            //可以用来加载本地文件上传
//            minioClient.uploadObject(UploadObjectArgs.builder()
//                    ..build())
            //生成保存文件的路径以及唯一文件名
            String objectName = new DateTime().toString("yyyy-MM/dd/") + System.currentTimeMillis() + "_"
                    + UUID.randomUUID().toString().substring(0, 8)
                    + originalFilename.substring(originalFilename.lastIndexOf("."));
            minioClient.putObject(PutObjectArgs.builder()
                    //当前代码所在的对象 是容器管理的对象，该对象初始化时 MinioConfig也会被容器初始化
                    .bucket(MinioConfig.BUCKET_NAME) //保存文件的桶
                    .object(objectName) //桶内保存文件的 路径+文件名称
                    .stream(inputStream, inputStream.available(), -1) //文件流
                    .build());
            //返回文件路径

            return MinioConfig.URL +":"+MinioConfig.PORT+ "/" + MinioConfig.BUCKET_NAME + "/" + objectName;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
