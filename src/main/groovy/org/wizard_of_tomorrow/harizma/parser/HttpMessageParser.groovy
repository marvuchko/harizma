package org.wizard_of_tomorrow.harizma.parser

import org.wizard_of_tomorrow.harizma.http.base.HttpMessage

interface HttpMessageParser {

    HttpMessage parse(String rawMessage);

}