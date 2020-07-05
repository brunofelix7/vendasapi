package com.brunofelixdev.vendasapi.config;

import com.brunofelixdev.vendasapi.annotation.profile.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class DevConfiguration {

    //  Executa assim que a aplicacao inicializa
    @Bean(name = "execute")
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("EXECUTANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

}
