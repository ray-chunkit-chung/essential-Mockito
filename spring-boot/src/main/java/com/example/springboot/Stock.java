package com.example.springboot;

// Modify from https://www.tutorialspoint.com/mockito/mockito_first_application.htm

public class Stock {
  private String stockId;
  private String name;
  private int quantity;

  public Stock(String stockId, String name, int quantity) {
    this.stockId = stockId;
    this.name = name;
    this.quantity = quantity;
  }

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
