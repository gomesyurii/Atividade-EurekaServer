package com.example.clientC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerC { 

    @GetMapping("/random")
    public int getRandom() {
        return (int) (Math.random() * 10);
    }
}
