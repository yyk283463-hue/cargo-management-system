package com.example.cargo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 货物管理系统启动类
 */
@SpringBootApplication
@MapperScan("com.example.cargo.mapper")
public class CargoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CargoApplication.class, args);
        System.out.println("====================================");
        System.out.println("  货物管理系统启动成功！");
        System.out.println("  访问地址: http://localhost:8080");
        System.out.println("====================================");
    }
}
