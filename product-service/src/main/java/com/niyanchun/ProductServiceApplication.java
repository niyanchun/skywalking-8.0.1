package com.niyanchun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NiYanchun
 **/
@SpringBootApplication
@RestController
public class ProductServiceApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(ProductServiceApplication.class, args);
  }

  @GetMapping("/product/{id}")
  String get(@PathVariable String id) {
    return "product " + id;
  }
}
