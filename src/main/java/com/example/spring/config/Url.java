package com.example.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Setter
@Component
@ConfigurationProperties(prefix = "url")
public class Url {

    private String naver;
    private String google;

    public String getUrl() {
        return naver + " and " + google;
    }
}
