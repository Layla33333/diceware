package edu.cnm.deepdive.diceware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

  @GetMapping(value = "greet")
  public String greet(@RequestParam(name = "t", required = false, defaultValue = "World!") String target){
    return String.format("Hello, %s", target);

  }
  @GetMapping("goodjob")
  public String goodJob(){
    return "Your building a webserver then soon on to a webservice congratulations!";
  }
}
