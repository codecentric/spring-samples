package de.codecentric.soap;

import de.codecentric.soap.configuration.CxfBootSimpleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@Import(CxfBootSimpleConfiguration.class)
public class CxfBootSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxfBootSimpleApplication.class, args);
    }
}
