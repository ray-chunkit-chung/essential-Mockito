package com.example.springboot;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
// import org.junit.jupiter.params.provider.EnumSource;

@ExtendWith(HelloParameterResolver.class)
public class HelloDependInjectTest {

  // Test with Dependency injection
  @Test
  @DisplayName("say hello string matches with dependency injection.")
  public void testSayHelloDedendencyInjection(Hello hello) {
    assertEquals("hello", hello.sayHello());
  }

  // Test with Parametrized test
  @ParameterizedTest
  @ValueSource(strings = { "hello", "hello", "hello" })
  @DisplayName("say hello string matches with parametrized test.")
  public void testSayHelloParametrized(String str, Hello hello) {
    assertEquals(str, hello.sayHello());
  }

  // Test with Enum
  // @ParameterizedTest
  // @EnumSource(value = Hello.class, names = {"hello", "hello", "hello"})
  // @DisplayName("say hello string matches with enum.")
  // public void testSayHelloEnum(Hello hello) {
  // assertEquals("hello", hello.sayHello());
  // }

}
