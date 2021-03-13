package com.eurekadevops.redleaf.web.rest.errors;

import com.eurekadevops.redleaf.web.rest.errors.NotFoundException;

public class TaskNotFoundException extends NotFoundException {

    public TaskNotFoundException() {
    }

    public TaskNotFoundException(String message) {
        super(message);
    }

}
