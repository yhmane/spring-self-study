package com.example.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.spring.config.Url;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

    private final Url site;

    @Value("${word.first}")
    private String first;

    @Value("${word.last}")
    private String last;


    public String propertyAdd() {
        return first + " " + last;
    }

    public String getUrl() {
        return site.getUrl();
    }
}
