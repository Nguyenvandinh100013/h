package com.example.demo_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomePage {

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
