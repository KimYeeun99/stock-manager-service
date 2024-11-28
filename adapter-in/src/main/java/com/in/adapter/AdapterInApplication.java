package com.in.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(
        basePackages = {
                "com.in.adapter",
                "com.stock.application",
                "com.stock.domain",
                "com.out.adapter"
        }
)
public class AdapterInApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdapterInApplication.class, args);
    }

}
