package com.example.strategy.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.strategy.service.CacheService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@AllArgsConstructor
public class Test {

    private final CacheService cacheService;
    
    @GetMapping("/test")
    public String test() {
        return cacheService.get();
    }
    
}
