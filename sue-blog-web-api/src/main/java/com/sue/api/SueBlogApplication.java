package com.sue.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author sue
 * @date 2020/10/8 19:14
 */

@SpringBootApplication
@MapperScan(basePackages = "com.sue.mapper")
@ComponentScan(basePackages = {"com.sue"})
public class SueBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(SueBlogApplication.class,args);
    }
}
