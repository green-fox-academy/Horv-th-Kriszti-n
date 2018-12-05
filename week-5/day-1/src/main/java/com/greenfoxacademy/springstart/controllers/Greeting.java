package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  long id;
  String content;
  static AtomicLong counter = new AtomicLong(1);  // <--- it needs to be STATIC, because it must counter globally, not only in this Object!

  public Greeting(String content) {
    this.id = counter.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
