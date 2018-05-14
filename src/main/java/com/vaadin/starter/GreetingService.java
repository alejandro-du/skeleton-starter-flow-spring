package com.vaadin.starter;

import org.springframework.stereotype.Service;

/**
 * A Spring-managed service implementation.
 */
@Service
public class GreetingService {

    public String getMessage() {
        return "Hello, World!";
    }

}
