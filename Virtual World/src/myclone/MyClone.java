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
public final class MyClone {
  
  private final UserInput u = new UserInput();
  private String firstName;
  private String lastName;
  private String fullName;
  
  public MyClone() {
    this(null);
    this.firstName = "Abby"; // NOTE: default content
    this.lastName = "Normal"; // NOTE: default content
    this.fullName = firstName + " " + lastName;
  }
  
  public MyClone(String firstName) {
//    this(firstName,null);
  }
  
  public MyClone(String firstName,String lastName) {
//    this(firstName,lastName,null);
//    this.firstName = firstName();
//    this.lastName = lastName();
  }
  
  public MyClone(String firstName, String lastName, String fullName) {
//    this(firstName,lastName,fullName,null);
//    this.firstName = firstName();
//    this.lastName = lastName();
  }
  
  public MyClone(String firstName, String lastName, String fullName, String intro) {
//    introduction(); // Having this here runs first, but doesn't really makes sense to be here b/c it's not "transparent" maybe?
//    fullName = getCloneName(); // Having this without the intro() makes it run twice
  }
  
  public void introduction() {    
//    userInput u = new userInput();
//    String printIntro = "";
    System.out.printf("\tWelcome to the \"Virtual World\" program!%n\t\tCreated by Smokie Lee");
    System.out.printf("%n\t---------------------------------------%n");
    System.out.printf("");
//    return printIntro;
  }
  
//  public void setIntroduction() {
//    // setter
//  }
  
  public String firstName() {
    firstName = u.getUserString("%nWhat would you like your clone's first name to be?%n>> ");
    return firstName;
  }
  
  public String lastName() {
    lastName = u.getUserString("%nWhat would you like your clone's last name to be?%n>> ");
    return lastName;
  }
  
  public String getCloneName() {
    fullName = firstName() + " " + lastName();
//    fullName = firstName + " " + lastName;
    System.out.printf("%nYour clone's name is %s%n",fullName);
    return fullName;
  }
  
}
