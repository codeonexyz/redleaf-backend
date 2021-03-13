package com.eurekadevops.redleaf.web.rest.errors;

import com.eurekadevops.redleaf.web.rest.errors.NotFoundException;

public class UserNotFoundException extends NotFoundException {

    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }

}
