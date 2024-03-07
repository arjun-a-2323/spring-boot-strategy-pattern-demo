package com.example.strategy.infra.repos.second;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;
import com.example.strategy.infra.repos.StrategyService;

//@Repository
//@ConditionalOnProperty(name = "strategy", havingValue = "second")
public class SecondValueStrategy implements StrategyService {

    @Override
    public String getValue() {
        
        return "Second value";
    }
    
}
