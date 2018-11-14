package io.github.bcalmac.conditionalonannotation.service;

import io.github.bcalmac.conditionalonannotation.starter.EnableSomething;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSomething
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
