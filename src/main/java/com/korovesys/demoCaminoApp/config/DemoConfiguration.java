package com.korovesys.demoCaminoApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.korovesys.demoCaminoApp.action.FirstActionHandler;
import com.korovesys.demoCaminoApp.action.ForthActionHandler;
import com.korovesys.demoCaminoApp.action.SecondActionHandler;
import com.korovesys.demoCaminoApp.action.ThirdActionHandler;

@Configuration
public class DemoConfiguration {

    @Bean
    public FirstActionHandler firstActionHandler() {
        return new FirstActionHandler();
    }

    @Bean
    public SecondActionHandler secondActionHandler() {
        return new SecondActionHandler();
    }

    @Bean
    public ThirdActionHandler thirdActionHandler() {
        return new ThirdActionHandler();
    }

    @Bean
    public ForthActionHandler forthActionHandler() {
        return new ForthActionHandler();
    }
}
