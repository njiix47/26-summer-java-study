package com.example.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {

    @GetMapping("/A")
    public String A() {
        return "A";
    }
}