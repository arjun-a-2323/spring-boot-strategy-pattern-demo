package com.example.strategy.service.impl;

import org.springframework.stereotype.Service;

import com.example.strategy.infra.repos.StrategyService;
import com.example.strategy.service.CacheService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CacheServiceImpl implements CacheService {


    private final StrategyService strategyService;

    @Override
    public String get() {
       return strategyService.getValue();
    }
    
}
