/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

import java.util.*; // Since we need 3 imports, this seems more prudent. Also endorsed by the Java documentation.

/**
 * The ShoutBox class collects and displays user messages.
 *
 * @author Smokie Lee
 */
public class ShoutBox {

  private UserInput u = new UserInput();
  private String printMessageList;
  private String singleMessage;
  private Integer numMessages;
  private HashMap<Integer, String> messageListName = new HashMap<>();

  public ShoutBox() {
    this(null);
  }

  public ShoutBox(String a) {
//    this(a,null);
  }
  
  public void collectMessages() {
//    collectMessages(u.getUserInteger("Message!"),messageListName);
//    collectMessages(numMessages,messageListName);
    collectMessages(getNumber(),messageListName);
//    collectMessages(getNumber("How many messages would you like to enter?"),messageListName);
  }

//  public void setFullName() {
//    setFullName(firstName,lastName);
//  }

  /**
   * Collect messages from the user.
   *
   * @param numMessages Number of messages to enter.
   * @param messageListName Name of the message list.
   */
  public void collectMessages(Integer numMessages, HashMap<Integer, String> messageListName) {
    u = new UserInput(); // NOTE: this works, don't know why (reusing variables?), but DO NOT COMMENT OR REMOVE.
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
      messageListName.put(i, u.collectUserString("Please enter a message:%n>> ")); // Add user input into hash map.
    }
  }

  /**
   * Print out each message in the array list in a numbered list.
   *
   * @param messageListName Name of the message list.
   * @return printMessageList Returns a numbered list of messages.
   */
  public String printMessageList(HashMap<Integer, String> messageListName) {
    System.out.printf("Message list:%n");
    for (Map.Entry<Integer, String> entry : messageListName.entrySet()) { // Enahnced for loop is more efficient here when we're iterating through the set.
      System.out.printf("%s: %s\n", entry.getKey(), entry.getValue()); // Print key and value as a list.
      // FUTURE: format this with tabs for extra goodness
    }
    return printMessageList;
  }
  
  public String shoutOutCannedMessage() {
    shoutOutCannedMessage(messageListName);
//    return singleMessage;
    return singleMessage;
  }

  /**
   *
   * @param messageListName Name of array list to access.
   * @return singleMessage Returns a single message via the printMessage function.
   */
  public String shoutOutCannedMessage(HashMap<Integer, String> messageListName) {
    int messageNumber = 0; // Initalize variable for holding the user input.
    do {
      System.out.printf("%nSelect a message from the list below to print that message.%n%n");

      printMessageList(messageListName); // Print messages from the list in args.
      messageNumber = u.collectUserInteger(""); // Set user input to the index value. 
    } while (messageNumber > messageListName.size()); // Keep iterating if user enters something outside the index.

    System.out.printf("%n");

//    singleMessage = printMessage(messageNumber, messageListName);
    singleMessage = printMessage(messageNumber, messageListName);
    return singleMessage;
  }

  /**
   *
   * @param messageListName Name of array list to access.
   * @param messageNumber Array index number.
   * @return message Returns message at provided index value.
   */
  public String printMessage(int messageNumber, HashMap<Integer, String> messageListName) {
    String message = ""; // Initialize variable for later use.
    System.out.printf("%s%n", messageListName.get(messageNumber));
    return message; // Return selected message.
  }
  
  public Integer getNumber() {
//    Integer numMessages = 0;
    getNumber("");
    return numMessages;
  }
  
  // when passing getNumber without an argument need to print a default message ""

  /**
   *
   * @param message The message you would like to display to the user before getting input.
   * @return
   */
  public Integer getNumber(String message) {
    numMessages = u.collectUserInteger(message);
    return numMessages;
  }

}
