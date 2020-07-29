package com.cykj.online_market_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class OnlineMarketUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMarketUserApplication.class, args);
    }

}
