package com.example.demo.controller;

import com.example.demo.model.ResponseExample;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicController {

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/exampleData/{data}")
    public ResponseExample exampleData(@PathVariable String data) {

        if (data.equals("1")) {
            return new ResponseExample("example 1");
        } else if (data.equals("2")) {
            return new ResponseExample("example 2");
        } else if (data.equals("3")) {
            return new ResponseExample("example 3");
        } else if (data.equals("4")) {
            return new ResponseExample("example 4");
        } else if (data.equals("5")) {
            return new ResponseExample("example 5");
        } else {
            return new ResponseExample("example");
        }
    }
}