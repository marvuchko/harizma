package org.wizard_of_tomorrow.harizma.http.base

class HttpEntity<M extends HttpMessage> {

    final HttpProtocol<M> protocol;

    HttpEntity(HttpEntity<M> protocol) {
        this.protocol = protocol as HttpProtocol<M>
    }

    int getVersion() {
        protocol
                .httpMessage()
                .getProtocol()
    }

    HttpHeaders getHeaders() {
        protocol
                .httpMessage()
                .getHeaders()
    }

    byte[] body() {
        protocol
                .httpMessage()
                .getBody()
    }

}
