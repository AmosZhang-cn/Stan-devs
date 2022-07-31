package com.ltmmb.stan;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@MapperScan(basePackages="cn.kj1001.park.base.dao") //指定dao层所在的位置
//@ComponentScan("")
@SpringBootApplication
public class UserAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(UserAppliaction.class,args);
        System.out.println("我是develop。。。。。。。。。。");
        System.out.println("我是develop-Stanzhang。。。。。。。。。。");


    }
}
