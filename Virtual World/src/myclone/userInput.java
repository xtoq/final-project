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

  private final Scanner userInputScanner; // FUTURE: be sure to check that this being final still allows us to set the variable!
  private String userString;
  private Integer userInteger;

  /**
   * No argument constructor.
   */
  public UserInput() {
    this.userInputScanner = new Scanner(System.in);
    this.userString = "None";
    this.userInteger = 0;
  }
  
  public String userString() {
    return userString;
  }
  
  public Integer userInteger() {
    return userInteger;
  }
  
  public String collectUserString() {
    return userString = userInputScanner.nextLine();
  }
  
  /**
   * Get next line of user input.
   *
   * @param message
   * @return userString Returns the value input by the user.
   */
  public String collectUserString(String message) {
    System.out.printf(message);
    return userString = userInputScanner.nextLine();
  }

  public Integer collectUserInteger() {
    return userInteger = userInputScanner.nextInt();
  }

  /**
   * Get next integer of user input.
   *
   * @param message
   * @return userInteger Returns the value input by the user.
   */
  public Integer collectUserInteger(String message) {
//    System.out.printf("%s%nPlease enter a number.%n>> ", message);
    System.out.printf(message);
    return userInteger = userInputScanner.nextInt();
  }
  
  public void setUserString() {
    setUserString(userString);
  }
  
  public void setUserString(String userString) {
    this.userString = userString;
  }

  public void setUserInteger() {
    setUserInteger(userInteger);
  }
  
  public void setUserInteger(Integer userInteger) {
    this.userInteger = userInteger;
  }

//  public void setFirstName() {
//    setFirstName(this.firstName = u.collectUserString("%nPlease enter your clone's first name.%n>> "));
//  }
  
  
  
//  public String collectUserString2() {
//    userString = userInputScanner.nextLine(); // Collect and store user input.
//    return userString; // Returns the value of the user input.
//  }
  
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
  
  // TODO: create setters for user string variables (this will likely solve my problems in other ares...derp
}
