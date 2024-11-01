package com.kunkun.aiapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.kunkun.aiapp.mapper")
@SpringBootApplication
public class AiappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiappApplication.class, args);
    }

}
