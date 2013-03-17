package com.tadamski.arij.rest.exceptions;

/**
 * 404 HTTP response code
 * @author t.adamski
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException(String responseMessage) {
        super(responseMessage);
    }
}
