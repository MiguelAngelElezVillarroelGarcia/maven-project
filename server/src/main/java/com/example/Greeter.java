package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**  
    * Greets someone.  
    * @param someone: person who is greeted
    * @return A String data type.  
    */  
  public final String greet(final String someone) {
    return String.format("Hello Jenkins boy, %s!", someone);
  }
}
