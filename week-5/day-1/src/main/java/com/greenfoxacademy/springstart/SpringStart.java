package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringStart {

  @RequestMapping(value = "/comeOnBaby")
  @ResponseBody
  public String comeOnBaby() {
    return "Come on baby!!!";
  }
}
