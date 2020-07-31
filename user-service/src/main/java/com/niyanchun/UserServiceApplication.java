package com.niyanchun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author NiYanchun
 **/
@SpringBootApplication
@RestController
public class UserServiceApplication {

  @Autowired
  RestTemplate restTemplate;

  public static void main(String[] args) throws Exception {
    SpringApplication.run(UserServiceApplication.class, args);
  }

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @GetMapping("/user/{name}")
  String get(@PathVariable String name) {
    String resp = restTemplate.getForObject("http://127.0.0.1:8901/product/1", String.class);
    return name + ": " + resp;
  }
}
