/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

import java.util.Scanner;

/**
 * Functions to collect various types of user input.
 *
 * @author Smokie Lee
 */
public class UserInput {
  private final Scanner userInputScanner = new Scanner(System.in);
  private String userString;
  private Integer userInteger;
  private int userInt;

  /**
   * No argument constructor.
   */
  public UserInput() {
//    this(null); // Place "null" as the value of the argument and call the constructor again. Called constructor chaining. // NOTE: this could be something like DEFAULT CONTENT
    this.userString = null;
    this.userInteger = null;
    this.userInt = 0;
  }
  
  public UserInput(String message) {
//    this(null,null);
  }
  
  public UserInput(String message, String inputType) {
//    this(null,null,null);
  }

  /**
   * Get next line of user input.
   *
   * @param message
   * @return userString Returns the value input by the user.
   */
//  public String getUserString() {
  public String getUserString(String message) {
    System.out.printf(message);
//    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
//    String userString = userInputScanner.nextLine(); // Collect and store user input.
    this.userString = userInputScanner.nextLine(); // Collect and store user input.
    return userString; // Returns the value of the user input.
  }

  /**
   * Get next integer (primitive) of user input.
   *
   * @param message
   * @return userInt Returns the value input by the user.
   */
  public int getUserInt(String message) {
    System.out.printf(message);
//    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    userInt = userInputScanner.nextInt(); // Collect and store user input.
    return userInt; // Returns the value of the user input.
  }

  /**
   * Get next integer of user input.
   *
   * @param message
   * @return userInteger Returns the value input by the user.
   */
  public Integer getUserInteger(String message) {
    System.out.printf(message);
//    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    userInteger = userInputScanner.nextInt(); // Collect and store user input.
    return userInteger; // Returns the value of the user input.
  }
}
