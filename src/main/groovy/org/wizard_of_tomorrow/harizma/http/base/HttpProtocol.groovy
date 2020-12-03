package org.wizard_of_tomorrow.harizma.http.base

interface HttpProtocol<M extends HttpMessage> {

    M httpMessage();

}
