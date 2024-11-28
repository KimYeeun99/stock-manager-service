package com.out.adapter.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.out.adapter.persistence.repository")
@EntityScan(basePackages = "com.out.adapter.persistence.entity")
@ComponentScan(basePackages = {
        "com.out.adapter.persistence.adapter"
})
public class PersistenceConfig {
//    @Value("${spring.datasource.driver-class-name}")
//    private static String driver;
//    @Value("${spring.datasource.url}")
//    private static String url;
//    @Value("${spring.datasource.username}")
//    private static String username;
//    @Value("${spring.datasource.password}")
//    private static String password;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driver);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
}
