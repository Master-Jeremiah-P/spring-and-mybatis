package com.jeremiah.practice.controller;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jeremiah/practice")
@Transactional
public class Controller {

    @GetMapping("/employee")
    public String getEmployee(){
        return  null;
    }
}
