package com.example.springboot;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloTest {

  // Hello world example
  @Test
  @DisplayName("say hello string matches.")
  public void testSayHello() {
    Hello hello = new Hello();
    assertEquals("hello", hello.sayHello());
  }

  // Assumption example. To determine to run test or not: Assumption true -> run test
  @Test
  @DisplayName("say hello string matches if hello is not null.")
  public void testSayHelloWithAssumption() {
    Hello hello = new Hello();
    assumeTrue(hello != null);
    assertEquals("hello", hello.sayHello());
  }
}
