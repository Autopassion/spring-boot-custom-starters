package com.demo.conf;

import com.demo.properties.DemoProperties;
import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnClass(DemoService.class)
public class DemoConfiguration {
    @Autowired
    private DemoProperties demoProperties;

    @Bean
    @ConditionalOnMissingBean(DemoService.class)
    protected DemoService getDemoService(){
        DemoService demoService = new DemoService(demoProperties.getMsg());
        return demoService;
    }

}
