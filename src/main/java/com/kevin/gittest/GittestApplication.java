package com.kevin.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittestApplication {

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("3");
        System.out.println("2");
        SpringApplication.run(GittestApplication.class, args);
    }

}
