package com.devisv.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/greeting")
  public GreetingDto getMessage() {
    return new GreetingDto("Hello World!");
  }
}
