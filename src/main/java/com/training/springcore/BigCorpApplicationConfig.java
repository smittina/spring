package com.training.springcore;

import com.training.springcore.model.ApplicationInfo;
import com.training.springcore.service.CaptorService;
import com.training.springcore.service.CaptorServiceImpl;
import com.training.springcore.service.SiteService;
import com.training.springcore.service.SiteServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.Set;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class BigCorpApplicationConfig {

    @Value("${bigcorp.name}")
    private String name;

    @Value("${bigcorp.version}")
    private Integer version;

    @Value("${bigcorp.emails}")
    private Set<String> emails;

    @Value("${bigcorp.webSiteUrl}")
    private String webSiteUrl;

    @Bean
    public ApplicationInfo applicationInfo(){
        return new ApplicationInfo(name,version,emails,webSiteUrl);
    }




}
