package com.example.faasDemoFunction;

import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FaasDemoFunctionApplication {


  //TODO: Figure out the proper way to handle sendEmail as part of Spring Cloud Function
  @Bean
  public Function<String, String> sendEmail() {
    return value -> value.toLowerCase();
  }

  public static void main(String[] args) {
    SpringApplication.run(FaasDemoFunctionApplication.class, args);
  }

}




