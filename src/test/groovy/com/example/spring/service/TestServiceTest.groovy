package com.example.spring.service

import spock.lang.Specification

class TestServiceTest extends Specification {

    private TestService testService = Stub()

    def "property value 확인"() {
        given:
        testService.propertyAdd() >> "hello world"

        when:
        def result = testService.propertyAdd()

        then:
        result == "hello world"
    }
}
