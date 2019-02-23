package com.springgears.contextcaching;

import com.springgears.contextcaching.service.NotificationService;
import com.springgears.contextcaching.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SmsService.class)
public class SecondSmsApplicationConfigurationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private NotificationService notificationService;

    @Test
    public void shouldSendSms() {
        log.info("Application context from second test: {}", applicationContext);
        notificationService.send("Hello from second test!");
    }
}
