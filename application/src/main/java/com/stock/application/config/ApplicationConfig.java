package com.stock.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.stock.application",
        "com.out.adapter"
})
public class ApplicationConfig {

}