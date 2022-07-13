package com.example.springboot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloTest {

  @Test
  @DisplayName("say hello string matches.")
  public void testSayHello() {
    Hello hello = new Hello();
    assertEquals("hello", hello.sayHello());
  }

}
