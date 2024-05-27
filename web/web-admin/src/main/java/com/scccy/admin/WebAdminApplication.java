package com.scccy.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebAdminApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(WebAdminApplication.class, args);
    }
}
