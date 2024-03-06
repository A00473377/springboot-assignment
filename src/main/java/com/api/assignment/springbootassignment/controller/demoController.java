package com.api.assignment.springbootassignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class demoController {
    @GetMapping
    public String getAllUsers() {
        return "Hello, World!";
    }
}
