package me.ggulmool.jpatest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public String myBean() {
        return "myBean";
    }
}
