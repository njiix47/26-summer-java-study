package com.example.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class Ex05Application {

    public static void main(String[] args) {
        SpringApplication.run(Ex05Application.class, args);
    }

}
