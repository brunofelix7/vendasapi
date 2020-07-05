package com.brunofelixdev.vendasapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean(name = "appName")
    public String appName() {
        return "Sistema de Vendas";
    }

}
