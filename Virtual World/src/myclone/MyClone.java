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

  private String firstName;
  private String lastName;
  private String fullName;
  private final UserInput u = new UserInput();
  
  public MyClone() {
//    this(null);
    this.firstName = "Dee"; // NOTE: default content
    this.lastName = "Fault"; // NOTE: default content
    this.fullName = firstName + " " + lastName; // NOTE: default content
  }
  
//  public MyClone(String firstName) {
//    this(firstName,null);
//    this.firstName = firstName; // NOTE: default content
////    this.lastName = "Fault"; // NOTE: default content
////    this.fullName = firstName + " " + lastName; // NOTE: default content
//  }
  
//  public MyClone(String firstName,String lastName) {
////    this.firstName = firstName; // NOTE: default content
////    this.lastName = lastName; // NOTE: default content
////    this.fullName = firstName + " " + lastName; // NOTE: default content
//  }
  
//  public MyClone(String firstName,String lastName,String fullName) {
//    this.firstName = firstName; // NOTE: default content
//    this.lastName = lastName; // NOTE: default content
//    this.fullName = fullName; // NOTE: default content
//  }

  public String getFirstName() {    
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFullName() {
    return fullName;
  }
  
  public void setFirstName() {
    setFirstName(this.firstName = u.getUserString("%nPlease enter your clone's first name.%n>> "));
  }
  
  public void setLastName() {
    setLastName(this.lastName = u.getUserString("%nPlease enter your clone's last name.%n>> "));
  }
  
  public void setFullName() {
    setFullName(firstName,lastName);
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void setFullName(String firstName,String lastName) {
    this.fullName = firstName +  " " + lastName;
  }
  
  public String collectName() {
    setFirstName();
    setLastName();
    setFullName();
    return getFullName();
  }

  public void introduction() {
    System.out.printf("\tWelcome to the \"Virtual World\" program!%n\t\tCreated by Smokie Lee");
    System.out.printf("%n\t---------------------------------------");
//    System.out.printf("This program collects information from the user to create a virtual clone with a vocabulary.%n%n");
//    System.out.printf("%n\t---------------------------------------%n%n");
    System.out.println();
    // TODO: file input here for the "narrative"?
  }

}
