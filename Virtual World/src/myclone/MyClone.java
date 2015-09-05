package myclone;

/**
 * The MyClone class collects and displays clone information.
 * @author Smokie Lee
 */
public final class MyClone {

  private String firstName;
  private String lastName;
  private String fullName;
  
  /**
   * Create a clone with default values.
   */
  public MyClone() {
    this(null);
    this.firstName = "Dee";
    this.lastName = "Fault";
    this.fullName = firstName + " " + lastName;
  }
  
  /**
   * Create a clone with first name.
   * @param firstName
   */
  public MyClone(String firstName) {
    this(firstName,null); // If no arguments are passed, then call the next constructor.
    // This is called explicit constructor invocation, or constructor chaining, and helps support the DRY method of 
    // development: Don't Repeat Yourself. Since you're only setting instance variables in a limited number of places,
    // debugging is much easier, and the code becomes easier to read for other developers later on.
  }
  
  /**
   * Create a clone with first and last names.
   * @param firstName First name of clone.
   * @param lastName Last name of clone.
   */
  public MyClone(String firstName,String lastName) {
    this(firstName,lastName,null);
  }
  
  /**
   * Create a clone with first, last, and full names.
   * @param firstName First name of clone.
   * @param lastName Last name of clone.
   * @param fullName Full name of clone.
   */
  public MyClone(String firstName,String lastName,String fullName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = fullName;
  }

  /**
   * Returns the value of firstName.
   * @return firstName
   */
  public String getFirstName() {    
    return firstName;
  }

  /**
   * Returns the value of lastName.
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns the value of fullName.
   * @return fullName
   */
  public String getFullName() {
    return fullName;
  }
  
  /**
   * Sets the firstName variable.
   */
  public void setFirstName() {
    setFirstName(getFirstName());
  }
  
  /**
   * Sets the lastName variable.
   */
  public void setLastName() {
    setLastName(getLastName());
  }
  
  /**
   * Sets the fullName variable.
   */
  public void setFullName() {
    setFullName(getFirstName(),getLastName());
  }
  
  /**
   * Sets the firstName and fullName variables.
   * @param firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
    setFullName();
  }
  
  /**
   * Sets the lastName and fullName variables.
   * @param lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
    setFullName();
  }
  
  /**
   * Sets the firstName, lastName and fullName variables.
   * @param firstName
   * @param lastName
   */
  public void setFullName(String firstName,String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = firstName +  " " + lastName;
  }
  
  /**
   * Collect the first and last name from the user.
   * @return fullName via getFullName()
   */
  public String collectName() {
    UserInput u = new UserInput();
    setFirstName(u.collectUserString("Please enter a first name."));
    setLastName(u.collectUserString("Please enter a last name."));
    return getFullName();
  }

  /**
   * Introduce the user to the program.
   */
  public void introduction() {
    System.out.printf("\tWelcome to the \"Virtual World\" program!%n\t\tCreated by Smokie Lee");
    System.out.printf("%n\t---------------------------------------%n%n");
    collectName();
    System.out.printf("%nYour clone's name is %s.%n",getFullName());
  }
  
  /**
   * Thanks the user and ends the program.
   */
  public void end() {
    System.out.printf("%n%n\t---------------------------------------%n");
    System.out.printf("\t\tThanks for playing!%n");
  }

}
