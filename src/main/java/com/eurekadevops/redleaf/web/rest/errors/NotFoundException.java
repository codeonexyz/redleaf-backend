package com.eurekadevops.redleaf.web.rest.errors;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

}
