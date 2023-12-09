package com.desabisc.security31x.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class HomeControlller {

    @GetMapping("/home")
    public ResponseEntity<String> home() {
        String message = "Spring Boot 3.1 and Spring Security";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
