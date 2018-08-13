package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(this.configuration.getMaximum(), this.configuration.getMinimum());
    }

    @HystrixCommand(fallbackMethod = "fallbackRetrieveConfiguration")
    @GetMapping("/fault-tolerance-example")
    public LimitConfiguration retrieveConfiguration() {
        throw new RuntimeException("Errrror!");
    }

    public LimitConfiguration fallbackRetrieveConfiguration() {
        return new LimitConfiguration(9999, 9);
    }

}
