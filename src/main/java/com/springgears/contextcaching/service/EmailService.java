package com.springgears.contextcaching.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        log.info("Sending message via EMAIL: {}", message);
    }
}
