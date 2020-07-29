package com.cykj.online_market_common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineMarketCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMarketCommonApplication.class, args);
    }

}
