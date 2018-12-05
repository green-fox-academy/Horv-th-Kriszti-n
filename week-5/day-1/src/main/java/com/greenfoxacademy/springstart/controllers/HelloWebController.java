package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model) {
    Greeting greetings = new Greeting();
    model.addAttribute("name", "Krisztián");
    model.addAttribute("counter", greetings.counter);
    return "greeting";
  }
}
