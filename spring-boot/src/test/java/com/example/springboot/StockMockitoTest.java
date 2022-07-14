package com.example.springboot;

// Modify from https://www.tutorialspoint.com/mockito/mockito_first_application.htm

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class StockMockitoTest {

  @Mock
  StockMockito stock;

  @BeforeEach
  public void setupMocks() {
    Mockito.when(stock.getName()).thenReturn("Google");
  }

  @Test
  public void testGetName() {
    assertEquals("Google", stock.getName());
  }
}
