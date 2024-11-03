package com.dyma_tuto.tennis.service;

import com.dyma_tuto.tennis.ApplicationStatus;
import com.dyma_tuto.tennis.HealthCheck;
import com.dyma_tuto.tennis.repository.HealthCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    private HealthCheckRepository healthCheckRepository;

    public HealthCheck healthCheck() {

        Long activeSessions = healthCheckRepository.countApplicationConnections();

        return activeSessions > 0 ?
                new HealthCheck(ApplicationStatus.OK, "JDBC pool size = " + activeSessions) :
                new HealthCheck(ApplicationStatus.KO, "Not connected to database");
    }
}
