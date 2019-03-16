package com.ryankolbe.Question_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {
    @Bean(name = "Refuel")
    public Refuel getService() {
        return new InterfaceImplementation();
    }
}
