package com.ltoe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping("/greeting/{username}")
    public ResponseEntity<String> greeting(@PathVariable String username) {
        return new ResponseEntity<>(new StringBuilder()
                .append("Hello there! This is my first gradle action workflow.")
                .append(" i am ")
                .append(username).toString(), HttpStatus.OK);
    }
}
