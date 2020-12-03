package org.wizard_of_tomorrow.harizma.parser

import org.wizard_of_tomorrow.harizma.exception.parser.HttpMessageParserCreationException
import org.wizard_of_tomorrow.harizma.http.base.HttpMessage
import org.wizard_of_tomorrow.harizma.parser.impl.Http1XMessageParser
import org.wizard_of_tomorrow.harizma.parser.impl.Http2XMessageParser

class HttpMessageParserManager {

     HttpMessage parse(String rawMessage) {
        def versionNumber = findVersion(rawMessage)

        def parser = createParser(versionNumber)

        parser.parse(rawMessage)
    }

    HttpMessageParser createParser(float httpVersion) {
        if (httpVersion < 2) {
            return new Http1XMessageParser()
        } else {
            return new Http2XMessageParser()
        }
    }

    private Float findVersion(String rawMessage) {
        def lines = rawMessage.split(System.lineSeparator())
        if(lines.length == 0) throw new HttpMessageParserCreationException()
        def elements = lines[0].split('[ ]')
        if (elements.length < 3) throw new HttpMessageParserCreationException()
        def version = elements[2].substring(elements[2].lastIndexOf('/'))
        if (version.isEmpty()) throw new HttpMessageParserCreationException()
        Float.valueOf(version)
    }
}
