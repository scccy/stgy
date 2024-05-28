package com.scccy.stgy.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.scccy.stgy.mapper")
@SpringBootApplication
public class WebAdminApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(WebAdminApplication.class, args);
    }
}
