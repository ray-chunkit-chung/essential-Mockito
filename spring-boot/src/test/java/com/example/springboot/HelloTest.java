package com.example.springboot;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.MethodOrderer;
// import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class);
public class HelloTest {

  // Hello world example
  @Test
  // @Order(1)
  @DisplayName("say hello string matches.")
  public void testSayHello() {
    Hello hello = new Hello();
    assertEquals("hello", hello.sayHello());
  }

  // Assumption example. To determine to run test or not: Assumption true -> run
  // test
  @Test
  // @Order(2)
  @DisplayName("say hello string matches if hello is not null.")
  public void testSayHelloWithAssumption() {
    Hello hello = new Hello();
    assumeTrue(hello != null);
    assertEquals("hello", hello.sayHello());
  }

  // Nested tests
  @Nested
  class NestedTestExample {
    @Test
    @DisplayName("say hello string matches in nested tests.")
    public void testSayHelloNested() {
      Hello hello = new Hello();
      assertEquals("hello", hello.sayHello());
    }
  }

  // Repeated test
  @Test
  @RepeatedTest(10)
  @DisplayName("say hello string matches x 10 times.")
  public void testSayHelloRepeatTen() {
    Hello hello = new Hello();
    assumeTrue(hello != null);
    assertEquals("hello", hello.sayHello());
  }
}
