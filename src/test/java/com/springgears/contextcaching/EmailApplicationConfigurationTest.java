package com.springgears.contextcaching;

import com.springgears.contextcaching.service.EmailService;
import com.springgears.contextcaching.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EmailService.class)
public class EmailApplicationConfigurationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private NotificationService notificationService;

    @Test
    public void shouldSendSms() {
        log.info("Application context from email test: {}", applicationContext);
        notificationService.send("Hello from email test!");
    }
}
