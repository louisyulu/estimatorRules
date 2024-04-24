package com.example.estimatorRules.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.estimatorRules.model.Echo;

import java.time.LocalDateTime;

@RestController
public class EchoController {
    @GetMapping("/echo")
    public ResponseEntity<Echo> echoBack(@RequestParam(value = "msg", defaultValue = "Hello") String msg) {
        var tm = LocalDateTime.now();
        var echo = new Echo(tm.toString(), msg);
        return new ResponseEntity<>(echo, HttpStatus.OK);
    }
}
