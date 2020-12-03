package org.wizard_of_tomorrow.harizma.exception.parser

import org.wizard_of_tomorrow.harizma.exception.base.BaseHarizmaException

class HttpMessageParserCreationException extends BaseHarizmaException {

    HttpMessageParserCreationException() {
        super("Cannot create HttpMessageParser from Raw Message")
    }

}
