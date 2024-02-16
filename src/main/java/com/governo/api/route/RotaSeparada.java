package com.governo.api.route;

import org.apache.camel.builder.RouteBuilder;


public class RotaSeparada extends RouteBuilder {
    @Override
    public void configure() throws Exception {
 //       from("timer:foo?repeatCount=6") 
        from("direct:furada") 
        .setBody().constant(123)
        .process(new NumberConversionBean())
        .log("Result: ${body}");
    }
}
