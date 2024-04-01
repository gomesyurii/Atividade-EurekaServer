package com.example.clientB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class controllerB {

    @Autowired
    private DiscoveryClient discoveryClient;

     @GetMapping("/random") 
    public int getRandom() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLIENT-C");
        if (instances.isEmpty()) {
            return -2; 
        }

        ResponseEntity<Integer> response = new RestTemplate().getForEntity("http://localhost:8764/random", Integer.class);
        int resultFromC = response.getBody();

        int randomInB = (int) (Math.random() * 10);

        return randomInB + resultFromC;
    }
}
