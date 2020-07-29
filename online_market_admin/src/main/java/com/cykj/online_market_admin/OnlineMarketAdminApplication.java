package com.cykj.online_market_admin;

import com.cykj.online_market_bean.pojo.Admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OnlineMarketAdminApplication {
    //t
    public static void main(String[] args) {
        SpringApplication.run(OnlineMarketAdminApplication.class, args);
    }

}
