package org.wizard_of_tomorrow.harizma.http

import org.wizard_of_tomorrow.harizma.http.base.HttpEntity
import org.wizard_of_tomorrow.harizma.http.base.HttpMessage

class Response extends HttpEntity<HttpMessage> {

    Response(HttpEntity<HttpMessage> protocol) {
        super(protocol)
    }

}
