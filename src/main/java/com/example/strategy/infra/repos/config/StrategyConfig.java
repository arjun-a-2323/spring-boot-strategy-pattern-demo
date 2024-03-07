package com.example.strategy.infra.repos.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.strategy.infra.repos.StrategyService;
import com.example.strategy.infra.repos.first.FirstValueStrategy;
import com.example.strategy.infra.repos.second.SecondValueStrategy;

@Configuration
public class StrategyConfig {
   
    
    @Bean
    @ConditionalOnProperty(name = "strategy", havingValue = "first")
    public StrategyService firstValueStrategy(){
        return new FirstValueStrategy();
    }

    @Bean
    @ConditionalOnProperty(name = "strategy", havingValue = "second")
    public StrategyService secondValueStrategy(){
        return new SecondValueStrategy();
    }

}
