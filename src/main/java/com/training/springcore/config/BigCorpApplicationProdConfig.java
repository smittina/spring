package com.training.springcore.config;

import com.training.springcore.model.ApplicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.HashSet;
import java.util.Set;


@Configuration
@PropertySource("classpath:application-prod.properties")
@Profile("prod")
public class BigCorpApplicationProdConfig {

    @Autowired
    Environment environnement;

    @Bean
    public ApplicationInfo applicationInfo(){
        String name = environnement.getRequiredProperty("bigcorp.name");
        Integer version = Integer.parseInt(environnement.getProperty("bigcorp.version"));
        Set<String> emails = environnement.getRequiredProperty("bigcorp.emails", Set.class);
        String webSiteUrl = environnement.getRequiredProperty("BIGCORP_URL");

        return new ApplicationInfo(name,version,emails,webSiteUrl);
    }




}
