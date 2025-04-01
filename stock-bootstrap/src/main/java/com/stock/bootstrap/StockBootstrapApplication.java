package com.stock.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.stock"})
public class StockBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockBootstrapApplication.class, args);
    }

}
