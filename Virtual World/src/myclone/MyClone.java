/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

/**
 * @author Smokie Lee
 */
public class MyClone {
  
  private String firstName; // Initializes the private variable to store the first name.
  private String lastName; // Initializes the private variable to store the last name.
  
  public String getFirstName() { // Setup getter for first name variable.
    return firstName; // Returns the value of the firstName variable.
  }

  public String getLastName() { // Setup getter for last name variable.
    return lastName; // Returns the value of the lastName variable.
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    MyClone s = new MyClone(); // Create a new object of the MyClone class.
    String fullName = s.getFirstName() + " " + s.getLastName(); // Form the full name by concatenating, or merging, the the firstName and lastName values.
    // TODO: Determine how setter will be programmed.
  }
  
}
