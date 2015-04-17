package com.micromata.webengineering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Hello world!
 */
@SpringBootApplication
@Controller
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @ResponseBody
  @RequestMapping("/")
  public String index() {
    return new Date().toString();
  }
}
