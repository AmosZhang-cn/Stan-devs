package com.ltmmb.stan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.ltmmb.stan.dao") //指定dao层所在的位置
@SpringBootApplication
public class UserAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(UserAppliaction.class,args);
        System.out.println("我是develop。。。。。。。。。。");
        System.out.println("我是develop-Stanzhang。。。。。。。。。。");
        System.out.println("我是sit分支");
    }
}
