package com.example.springboot;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


// Test with Dependency injection

@ExtendWith(HelloParameterResolver.class)
public class HelloDependInjectTest {

  @Test
  @DisplayName("say hello string matches with dependency injection.")
  public void testSayHelloDedendencyInjection(Hello hello) {
    assertEquals("hello", hello.sayHello());
  }

}
