package com.governo.api.erro;

import org.apache.camel.builder.RouteConfigurationBuilder;

/**
 * Route configuration for error handling.
 */
public class ErrorHandler extends RouteConfigurationBuilder {

    @Override
    public void configuration() throws Exception {
        routeConfiguration("javaError")
            .onException(Exception.class).handled(true)
            .log("Java WARN: ${exception.message}");
    }
}