package com.example.strategy.infra.repos.first;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;
import com.example.strategy.infra.repos.StrategyService;

//@Repository
//@ConditionalOnProperty(name = "strategy", havingValue = "first")
public class FirstValueStrategy implements StrategyService {

    @Override
    public String getValue() {
        
        return "First value";
    }
    
}
