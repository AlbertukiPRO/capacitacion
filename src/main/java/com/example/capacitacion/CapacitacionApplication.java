package com.example.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CapacitacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapacitacionApplication.class, args);
    }

}
