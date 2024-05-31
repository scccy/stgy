package com.scccy.stgy.common.config;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.SetBucketPolicyArgs;
import io.minio.errors.InsufficientDataException;
import io.minio.errors.InternalException;
import io.minio.errors.InvalidResponseException;
import io.minio.errors.XmlParserException;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.ErrorResponseException;

import java.io.IOException;
import java.rmi.ServerException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


@Data
@Component
@ConfigurationProperties(prefix = "miniosettings")
public class MinioConfig {

    public String url;
    public String port;
    public String userName;
    public String password;
    public String bucketName;

    public static String URL;
    public static String PORT;
    public static String USERNAME;
    public static String PASSWORD;
    public static String BUCKET_NAME;

    @PostConstruct //jdk注解  标注的方法再当前对象创建后执行
    public void init(){
        URL = this.url;
        PORT = this.port;
        USERNAME = this.userName;
        PASSWORD = this.password;
        BUCKET_NAME = this.bucketName;
    }

    @Bean
    public MinioClient minioClient() throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException, io.minio.errors.ServerException, io.minio.errors.ErrorResponseException, InvalidKeyException, InternalException {
        //1、创建minio客户端对象：和minio服务端建立连接
        MinioClient minioClient = MinioClient.builder()
                //java api操作minio的端口号默认为9000    web端后台系统通过9001端口访问
                .endpoint(URL+":"+PORT) //连接minio的服务端地址
                .credentials(USERNAME, PASSWORD) //账号密码
                .build();
        //2、判断minio中是否存在  stgy

        boolean exists = minioClient.bucketExists(BucketExistsArgs.builder()
                .bucket(BUCKET_NAME)
                .build());
        if (!exists) {
            //桶不存在 创建桶
            minioClient.makeBucket(MakeBucketArgs.builder()
                    .bucket(BUCKET_NAME)
                    .build());
            //桶默认权限私有：可以设置为公共读  私有写(必须使用有权限的账号密码操作)
            String policy = """
                    {
                        "Statement" : [ {
                            "Action" : "s3:GetObject",
                            "Effect" : "Allow",
                            "Principal" : "*",
                            "Resource" : "arn:aws:s3:::%s/*"
                        } ],
                        "Version" : "2012-10-17"
                    }""";
            policy = policy.formatted(MinioConfig.BUCKET_NAME);
            minioClient.setBucketPolicy(SetBucketPolicyArgs.builder()
                    .bucket(BUCKET_NAME)
                    .config(policy)
                    .build());
        }

        return minioClient;
    }

    ;
}