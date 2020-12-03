package org.wizard_of_tomorrow.harizma.http.base.impl

import org.wizard_of_tomorrow.harizma.http.base.HttpMessage
import org.wizard_of_tomorrow.harizma.http.base.HttpProtocol

class StandardHttpProtocol<M extends HttpMessage> implements HttpProtocol<M> {

    private final M message;

    StandardHttpProtocol(M message) {
        this.message = message;
    }

    @Override
    M httpMessage() {
        message
    }
}
