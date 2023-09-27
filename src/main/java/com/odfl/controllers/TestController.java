package com.odfl.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/odfl")
public class TestController {

    @GetMapping("/get-msg")
    public ResponseEntity<String> display() {
        return ResponseEntity.ok("This is testing api...");
    }
}
