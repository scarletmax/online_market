package com.cykj.online_market_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OnlineMarketShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMarketShopApplication.class, args);
    }

}
