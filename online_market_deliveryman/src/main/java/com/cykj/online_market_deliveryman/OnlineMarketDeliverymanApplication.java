package com.cykj.online_market_deliveryman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OnlineMarketDeliverymanApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMarketDeliverymanApplication.class, args);
    }

}
