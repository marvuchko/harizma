package org.wizard_of_tomorrow.harizma.parser.impl

import org.wizard_of_tomorrow.harizma.http.base.HttpHeaders
import org.wizard_of_tomorrow.harizma.http.base.HttpMessage
import org.wizard_of_tomorrow.harizma.parser.HttpMessageParser

class Http1XMessageParser implements HttpMessageParser {

    @Override
    HttpMessage parse(String rawMessage) {
        def protocol = '';
        def httpMethod = '';
        def headers = new HttpHeaders()

        return new HttpMessage()
                .protocolVersion(protocol)
                .httpMethod(httpMethod)
                .headers(headers)
                .body(new byte[0])
    }

}
