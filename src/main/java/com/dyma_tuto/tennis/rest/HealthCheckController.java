package com.dyma_tuto.tennis.rest;

import com.dyma_tuto.tennis.HealthCheck;
import com.dyma_tuto.tennis.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {

    @Autowired
    private HealthCheckService healthCheckService;

    @GetMapping("/status")
    public HealthCheck healthCheck() {
        return healthCheckService.healthCheck();
    }
}
