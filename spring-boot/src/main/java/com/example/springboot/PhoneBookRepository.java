package com.example.springboot;

// Copy from https://github.com/eugenp/tutorials/blob/950bbadc353bdca114befc98cf4a18476352220e/testing-modules/mockito-2/src/test/java/com/baeldung/mockito/bddmockito/PhoneBookRepository.java

public interface PhoneBookRepository {

  /**
   * Insert phone record
   * 
   * @param name  Contact name
   * @param phone Phone number
   */
  void insert(String name, String phone);

  /**
   * Search for contact phone number
   * 
   * @param name Contact name
   * @return phone number
   */
  String getPhoneNumberByContactName(String name);

  /**
   * Check if the phonebook contains this contact
   * 
   * @param name Contact name
   * @return true if this contact name exists
   */
  boolean contains(String name);

}