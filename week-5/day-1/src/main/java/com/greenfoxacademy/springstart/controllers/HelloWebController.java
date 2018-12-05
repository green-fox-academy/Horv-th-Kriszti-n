package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

@Controller
public class HelloWebController {

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model) {
    Greeting greetings = new Greeting();

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
        "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
        "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
        "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    int randomHello = (int) (Math.random() * hellos.length);
    int randomSize = 10 +(int) (Math.random() * 40);
    String randomColor = "green";


    model.addAttribute("fontSize", randomSize);
    model.addAttribute("fontColor", randomColor);
    model.addAttribute("hello", hellos[randomHello]);
    model.addAttribute("name", "Krisztián");
    model.addAttribute("counter", greetings.id);
    return "greeting";
  }
}
