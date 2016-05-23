package de.codecentric.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"de.codecentric.cxf", "de.codecentric.soap"})
public class CxfBootSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxfBootSimpleApplication.class, args);
    }
}
