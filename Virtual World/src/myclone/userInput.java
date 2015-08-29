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
//  private int userInt;

  /**
   * No argument constructor.
   */
  public UserInput() {
    this.userString = null; // NOTE: default content
    this.userInteger = null; // NOTE: default content
//    this.userInt = 0; // NOTE: default content
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
    userString = userInputScanner.nextLine(); // Collect and store user input.
    return userString; // Returns the value of the user input.
  }

  public String getUserString2() {
    userString = userInputScanner.nextLine(); // Collect and store user input.
    return userString; // Returns the value of the user input.
  }

//  /**
//   * Get next integer (primitive) of user input.
//   *
//   * @param message
//   * @return userInt Returns the value input by the user.
//   */
//  public int getUserInt(String message) {
////    System.out.printf(message);
//    System.out.printf("%s%nPlease enter a number.%n>> ", message);
//    userInt = userInputScanner.nextInt(); // Collect and store user input.
//    return userInt; // Returns the value of the user input.
//  }

  /**
   * Get next integer of user input.
   *
   * @param message
   * @return userInteger Returns the value input by the user.
   */
  public Integer getUserInteger(String message) {
    System.out.printf("%s%nPlease enter a number.%n>> ", message);
    userInteger = userInputScanner.nextInt(); // Collect and store user input.
    return userInteger; // Returns the value of the user input.
  }
  
  // TODO: create setters for user string variables (this will likely solve my problems in other ares...derp
}
