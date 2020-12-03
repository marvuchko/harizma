package org.wizard_of_tomorrow.harizma.http

import org.wizard_of_tomorrow.harizma.http.base.HttpEntity
import org.wizard_of_tomorrow.harizma.http.base.HttpMessage

class Request extends HttpEntity<HttpMessage> {

    RequestMethod method;

    Request(HttpEntity<HttpMessage> protocol) {
        super(protocol)
    }

    enum RequestMethod {
        GET,
        POST,
        PUT,
        PATCH,
        DELETE,
        OPTIONS
    }
}
