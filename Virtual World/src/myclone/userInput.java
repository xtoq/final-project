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

  /**
   * No argument constructor.
   */
  public UserInput() {
//    this(null); // Place "null" as the value of the argument and call the constructor again. Called constructor chaining.
  }
  
//  public UserInput(String message) {
////    this(null,null);
//  }
  
//  public UserInput(String message, String userString) {
//    this(null,null,null);
//  }

  /**
   * Get next line of user input.
   *
   * @param message
   * @return userString Returns the value input by the user.
   */
//  public String getUserString() {
  public String getUserString(String message) {
    System.out.printf(message);
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    String userString = userInputScanner.nextLine(); // Create a new string variable to store the user input.
//    userString = userInputScanner.nextLine(); // Create a new string variable to store the user input.
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
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    int userInt = userInputScanner.nextInt(); // Create a new integer (primitive) variable to store the user input.
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
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    Integer userInteger = userInputScanner.nextInt(); // Create a new integer variable to store the user input.
    return userInteger; // Returns the value of the user input.
  }
}
