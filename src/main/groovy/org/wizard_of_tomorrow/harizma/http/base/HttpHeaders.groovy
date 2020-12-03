package org.wizard_of_tomorrow.harizma.http.base

class HttpHeaders {

    private LinkedHashMap<String, String> headers

    String get(String headerName) {
        return headers.get(headerName)
    }

    void setHeader(String headerName, String headerValue) {
        headers.put(headerName, headerValue)
    }

}
