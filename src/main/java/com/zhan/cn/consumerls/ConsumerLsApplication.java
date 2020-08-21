package com.zhan.cn.consumerls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerLsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerLsApplication.class, args);
        System.out.println("**********Consumer-ls*********");
        System.out.println("**********服务启动成功！*********");
    }

}
