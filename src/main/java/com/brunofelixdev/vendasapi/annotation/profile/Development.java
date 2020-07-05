package com.brunofelixdev.vendasapi.annotation.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)// Elegivel apenas para uma classe
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile(value = "dev") // So executa em ambiente de desenvolvimento
public @interface Development {
}
