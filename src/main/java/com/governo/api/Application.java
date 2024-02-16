package com.governo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
/*
        Main main = new Main();
        // add Java route classes
        main.configure().addRoutesBuilder(RotaIbge.class, ErrorHandler.class);
        // now keep the application running until the JVM is terminated (ctrl + c or sigterm)
        main.run(args);
        */
    }

}
