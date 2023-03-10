package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class inicio {
  @GetMapping
  public String run(){
    return "ingresado";
  }
  @GetMapping("inicio/")
  public String reacer(){
    return "reaciendo";
  }
}
