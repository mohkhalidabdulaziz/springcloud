package com.khalid.srv_hello.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @CircuitBreaker(name = "backendA", fallbackMethod = "fallbackMethod")
    @Retry(name = "myRetry")
    public String callExternalService() {
        return externalService();
    }

    private String externalService() {
        return "External service was called successfully.";
    }

    public String fallbackMethod(Throwable t) {
        return "Fallback response due to: " + t.getMessage();
    }
}
