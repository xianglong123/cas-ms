package com.cas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/7 2:29 下午
 * @desc 秒杀场景模拟启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "com.cas.dao")
public class MsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsApplication.class, args);
    }

}
