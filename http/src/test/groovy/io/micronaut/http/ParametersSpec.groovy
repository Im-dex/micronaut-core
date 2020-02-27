package io.micronaut.http

import spock.lang.Specification

class ParametersSpec extends Specification {
    void "test parameters decoding"() {

        given:
        def request = HttpRequest.GET("/some/path?arg=value")
        expect:
        request.getParameters().size() == 1
        request.getParameters().get("arg") == "value"
    }
}
