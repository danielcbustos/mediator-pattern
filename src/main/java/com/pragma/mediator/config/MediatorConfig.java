package com.pragma.mediator.config;

import com.pragma.mediator.handler.Handler;
import com.pragma.mediator.mediator.Mediator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MediatorConfig {

    @Bean
    public Mediator mediator(List<Handler> handlers) {
        return new Mediator(handlers);
    }
}