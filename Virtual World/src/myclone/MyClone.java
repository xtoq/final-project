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
  
  public MyClone() {
    this(null);
    this.firstName = "Dee";
    this.lastName = "Fault";
    this.fullName = firstName + " " + lastName;
  }
  
  public MyClone(String firstName) {
    this(firstName,null);
  }
  
  public MyClone(String firstName,String lastName) {
    this(firstName,lastName,null);
  }
  
  public MyClone(String firstName,String lastName,String fullName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = fullName;
  }

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
    setFirstName(getFirstName());
  }
  
  public void setLastName() {
    setLastName(getLastName());
  }
  
  public void setFullName() {
    setFullName(getFirstName(),getLastName());
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
    setFullName();
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
    setFullName();
  }
  
  public void setFullName(String firstName,String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = firstName +  " " + lastName;
  }
  
  public String collectName() {
    UserInput u = new UserInput();
    setFirstName(u.collectUserString("Please enter a first name."));
    setLastName(u.collectUserString("Please enter a last name."));
    return getFullName();
  }

  public void introduction() {
    System.out.printf("\tWelcome to the \"Virtual World\" program!%n\t\tCreated by Smokie Lee");
    System.out.printf("%n\t---------------------------------------%n");
    collectName();
    System.out.printf("%nYour clone's name is %s.%n",getFullName());
  }

}
