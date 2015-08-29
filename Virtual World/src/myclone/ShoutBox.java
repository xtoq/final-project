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

  private Integer numMessages;
  private HashMap<Integer, String> messageList;
  private String singleMessage;
  
  private UserInput u; // TODO: probably delete this and put it in each method instead?
  
  private String printMessageList;
  private Integer messageNumber;

  public ShoutBox() {
//    this(null);
    this.numMessages = 2;
    this.messageList = new HashMap<>();
    
    this.u = new UserInput();
  }

//  public ShoutBox(String a) {
////    this(a,null);
//  }
  
  public Integer getNumMessages() {
    return numMessages;
  }
  
  public void setNumMessages() {
    setNumMessages(getNumMessages());
  }
  
  public void setNumMessages(Integer numMessages) {
    this.numMessages = numMessages;
  }
  
  public HashMap<Integer,String> getMessageList() { // PRINT MESSAGE LIST
    return messageList;
  }
  
  public void setMessageList() {
    setMessageList(messageList);
  }
  
  public void setMessageList(HashMap<Integer,String> messageList) {
    this.messageList = messageList;
  }
  
  public String getSingleMessage() { // PRINT SINGLE MESSAGE
    return getSingleMessage(messageNumber);
  }
  
  public String getSingleMessage(Integer messageNumber) { // PRINT SINGLE MESSAGE
    return singleMessage;
//    return singleMessage = printMessage(messageNumber, messageList);
  }
  
  public void setSingleMessage() {
    // FIXME: not sure that I even need this? Or should this be for the single message number? and if I don't need this why do I have all those variables?
  }
  
  
  
  
  
  public void collectMessages() {
    collectMessages(getNumMessages(),getMessageList());
  }

  /**
   * Collect messages from the user.
   *
   * @param numMessages Number of messages to enter.
   * @param messageList Name of the message list.
   */
  public void collectMessages(Integer numMessages, HashMap<Integer, String> messageList) {
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
      messageList.put(i, u.collectUserString("Please enter a message.")); // Add user input into hash map.
    }
  }
  
  public Integer collectNumMessages() {
//    UserInput u = new UserInput();
    setNumMessages(u.collectUserInteger("How many messages would you like to enter?"));
    return getNumMessages();
  }
  
  
  
  
  
//  /**
//   * Print out each message in the array list in a numbered list.
//   *
//   * @param messageList Name of the message list.
//   * @return printMessageList Returns a numbered list of messages.
//   */
//  public String printMessageList(HashMap<Integer, String> messageList) {
//    System.out.printf("Message list:%n");
//    for (Map.Entry<Integer, String> entry : messageList.entrySet()) { // Enahnced for loop is more efficient here when we're iterating through the set.
//      System.out.printf("%s: %s\n", entry.getKey(), entry.getValue()); // Print key and value as a list.
//      // FUTURE: format this with tabs for extra goodness
//    }
//    return printMessageList;
//  }
//
//  /**
//   *
//   * @param messageList Name of array list to access.
//   * @param messageNumber Array index number.
//   * @return message Returns message at provided index value.
//   */
//  public String printMessage(int messageNumber, HashMap<Integer, String> messageList) {
//    String message = ""; // Initialize variable for later use.
//    System.out.printf("%s%n", messageList.get(messageNumber));
//    return message; // Return selected message.
//  }
//
//  
//  
//  public String shoutOutCannedMessage() {
//    shoutOutCannedMessage(messageList);
////    return singleMessage;
//    return singleMessage;
//  }
//
//  /**
//   *
//   * @param messageList Name of array list to access.
//   * @return singleMessage Returns a single message via the printMessage function.
//   */
//  public String shoutOutCannedMessage(HashMap<Integer, String> messageList) {
//    int messageNumber = 0; // Initalize variable for holding the user input.
//    do {
//      System.out.printf("%nSelect a message from the list below to print that message.%n%n");
//
//      printMessageList(messageList); // Print messages from the list in args.
//      messageNumber = u.collectUserInteger(""); // Set user input to the index value. 
//    } while (messageNumber > messageList.size()); // Keep iterating if user enters something outside the index.
//
//    System.out.printf("%n");
//
////    singleMessage = printMessage(messageNumber, messageList);
//    singleMessage = printMessage(messageNumber, messageList);
//    return singleMessage;
//  }
  
  
  
  
  
//  
//  public String shoutOutCannedMessage() {
//    shoutOutCannedMessage(messageList);
////    return singleMessage;
//    return singleMessage;
//  }
//
//  /**
//   *
//   * @param messageList Name of array list to access.
//   * @return singleMessage Returns a single message via the printMessage function.
//   */
//  public String shoutOutCannedMessage(HashMap<Integer, String> messageList) {
//    int messageNumber = 0; // Initalize variable for holding the user input.
//    do {
//      System.out.printf("%nSelect a message from the list below to print that message.%n%n");
//
//      printMessageList(messageList); // Print messages from the list in args.
//      messageNumber = u.collectUserInteger(""); // Set user input to the index value. 
//    } while (messageNumber > messageList.size()); // Keep iterating if user enters something outside the index.
//
//    System.out.printf("%n");
//
////    singleMessage = printMessage(messageNumber, messageList);
//    singleMessage = printMessage(messageNumber, messageList);
//    return singleMessage;
//  }

}
