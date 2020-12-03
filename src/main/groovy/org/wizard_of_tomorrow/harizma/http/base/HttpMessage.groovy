package org.wizard_of_tomorrow.harizma.http.base

class HttpMessage {

    String protocol
    HttpHeaders headers
    String httpMethod
    byte[] body

    HttpMessage protocolVersion(String protocol) {
        this.protocol = protocol
        this
    }

    HttpMessage headers(HttpHeaders headers) {
        this.headers = headers
        this
    }

    HttpMessage httpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        this
    }

    HttpMessage body(byte[] body) {
        this.body = body;
        this
    }

}
