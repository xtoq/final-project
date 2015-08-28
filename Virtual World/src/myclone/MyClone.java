/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

/**
 *
 * @author Smokie Lee
 */
public class MyClone {
  
  UserInput u = new UserInput();
  
  private String firstName;
  private String lastName;
  private String fullName;
  
  //  introduction method
  //  - welcome user
  //  - get first name from user
  //  - get last name from user
  //  - explain what's going on
  //  - print name of avatar
  
  public MyClone() {
//    this(null);
  }
  
  public void introduction() {
    // intro method
//    userInput u = new userInput();
    String printIntro = "";
    System.out.printf("\tWelcome to the \"Virtual World\" program!%n\t\tCreated by Smokie Lee");
    System.out.printf("%n\t---------------------------------------%n");
    System.out.printf("");
//    return printIntro;
  }
  
//  public void setIntroduction() {
//    // setter
//  }
  
  public String printFirstName() {
    firstName = u.getUserString("%nWhat would you like your clone's first name to be?%n>> ");
    return firstName;
  }
  
  public String printLastName() {
    lastName = u.getUserString("%nWhat would you like your clone's last name to be?%n>> ");
    return lastName;
  }
  
  public String cloneName() {
//    String fullName = firstName + " " + lastName;
    fullName = printFirstName() + " " + printLastName();
    System.out.printf("%nYour clone's name is %s%n",fullName);
    return fullName;
  }
  
}
