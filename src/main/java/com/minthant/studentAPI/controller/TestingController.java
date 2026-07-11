package com.minthant.studentAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
    @GetMapping("/")
    public String hello() {
        return "Hello spring boot";
    }
}
