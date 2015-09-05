package myclone;

import java.util.Scanner;

/**
 * Functions to collect various types of user input.
 * @author Smokie Lee
 */
public class UserInput {

  private final Scanner userInputScanner;
  private String userString;
  private Integer userInteger;

  /**
   * Create an input with default values.
   */
  public UserInput() {
    this.userInputScanner = new Scanner(System.in);
    this.userString = "None";
    this.userInteger = 0;
  }
  
  /**
   * Returns the value of userString.
   * @return userString Returns the next string input by the user.
   */
  public String userString() {
    return userString;
  }
  
  /**
   * Returns the value of userInteger.
   * @return userInteger Returns the next integer input by the user.
   */
  public Integer userInteger() {
    return userInteger;
  }
  
  /**
   * Get the next line of user input.
   * @return userString Returns the next string input by the user.
   */
  public String collectUserString() {
    return collectUserString("");
  }
  
  /**
   * Get next line of user input.
   * @param message The message to display to the user before input.
   * @return userString Returns the next string input by the user.
   */
  public String collectUserString(String message) {
    System.out.printf("%n%s%n>> ",message);
    return userString = userInputScanner.nextLine();
  }

  /**
   * Get next integer of user input.
   * @return userInteger Returns the next integer input by the user.
   */
  public Integer collectUserInteger() {
    return collectUserInteger("");
  }

  /**
   * Get next integer of user input.
   * @param message The message to display to the user before input.
   * @return userInteger Returns the next integer input by the user.
   */
  public Integer collectUserInteger(String message) {
    System.out.printf("%n%s%n>> ",message);
    return userInteger = userInputScanner.nextInt();
  }
  
  /**
   * Set userString variable.
   */
  public void setUserString() {
    setUserString(userString);
  }
  
  /**
   * Set userString variable.
   * @param userString The string to set.
   */
  public void setUserString(String userString) {
    this.userString = userString;
  }

  /**
   * Set userInteger variable.
   */
  public void setUserInteger() {
    setUserInteger(userInteger);
  }
  
  /**
   * Set userInteger variable.
   * @param userInteger The integer to set.
   */
  public void setUserInteger(Integer userInteger) {
    this.userInteger = userInteger;
  }
}
