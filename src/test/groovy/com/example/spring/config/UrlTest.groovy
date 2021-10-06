package com.example.spring.config

import spock.lang.Specification

class UrlTest extends Specification {

    private Url url = Stub()

    def "url 체크" () {
        given:
        url.getUrl() >> "www.naver.com and www.google.com"

        when:
        def result = url.getUrl()

        then:
        result == "www.naver.com and www.google.com"
    }
}
