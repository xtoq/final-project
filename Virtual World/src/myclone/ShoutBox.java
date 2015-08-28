/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

// NOTE: imports
//import java.util.HashMap;
//import java.util.Map;
import java.util.*; // Since we need 3 imports, this seems more prudent. Also endorsed by the Java documentation.

/**
 * The ShoutBox class collects and displays user messages.
 *
 * @author Smokie Lee
 */
public class ShoutBox {
    private UserInput u = new UserInput();
  
  public ShoutBox() {
//    this(null);
//    String printMessageList = "No messages entered.";
  }
  
  public ShoutBox(String wtf) {
  }

  /**
   * Collect messages from the user.
   *
   * @param numMessages Number of messages to enter.
   * @param messageListName Name of the message list.
   */
  public void collectMessages(Integer numMessages, HashMap<Integer, String> messageListName) {
//  UserInput u = new UserInput(); // FIXME: when commented, this creates the strange duplication.
//  CreateMessageList l = new CreateMessageList();
  u = new UserInput(); // NOTE: this works, don't know why (reusing variables?), but DO NOT COMMENT OR REMOVE.
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
      messageListName.put(i, u.getUserString("%nPlease enter a message:%n>> ")); // Add user input into hash map.
    }
  }
  
  /**
   * Print out each message in the array list in a numbered list.
   *
   * @param messageListName Name of the message list.
   * @return printMessageList Returns a numbered list of messages.
   */
  public String printMessageList(HashMap<Integer, String> messageListName) {
    String printMessageList = null;
    for (Map.Entry<Integer, String> entry : messageListName.entrySet()) { // Enahnced for loop is more efficient here when we're iterating through the set.
      System.out.printf("%s: %s\n", entry.getKey(), entry.getValue()); // Print key and value as a list.
      // TODO: format this with tabs for extra goodness
    }
    return printMessageList;
  }
  
  /**
   *
   * @param messageListName Name of array list to access.
   * @return message Returns a single message via the printMessage function.
   */
  public String shoutOutCannedMessage(HashMap<Integer, String> messageListName) {
//    UserInput u = new UserInput();
    int messageNumber = 0; // Initalize variable for holding the user input.
    do {
//      System.out.printf("%nPlease type a number from the list below to print that message.%n%n");
//      printMessageList(messageListName); // Print messages from the list in args.
//      System.out.printf("%n>> ");
//      messageNumber = u.getUserInteger(null); // Set user input to the index value. 
      messageNumber = u.getUserInteger("%nPlease type a number from the list below to print that message.%n%n"); // Set user input to the index value. 
      printMessageList(messageListName); // Print messages from the list in args.
      System.out.printf("%n>> ");
    } while (messageNumber > messageListName.size()); // Keep iterating if user enters something outside the index.

    System.out.printf("%n");

    return printMessage(messageNumber, messageListName); // Print selected message.
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
  
//  public Integer OLDgetNumber() {
////    System.out.printf(message);
//////    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
////    userInteger = userInputScanner.nextInt(); // Collect and store user input.
////    return userInteger; // Returns the value of the user input.
//    
//    UserInput u = new UserInput();
//    Integer count = u.getUserInteger("%nHow many messages would you like to enter? Please enter a number.%n>> ");
//    return count;
//    
////    return getNumber2(null);
//  }
  
  /**
   *
   * @param message The message you would like to display to the user before getting input.
   * @return
   */
  public Integer getNumber(String message) {
//    System.out.printf(message);
////    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
//    userInteger = userInputScanner.nextInt(); // Collect and store user input.
//    return userInteger; // Returns the value of the user input.
    
//    UserInput u = new UserInput();
    Integer count = u.getUserInteger(message);
//    
    return count;
  }
  
//  public void OLDcollectMessages() {
//    CreateMessageList list = new CreateMessageList();
//    HashMap<Integer, String> messageHashMap = new HashMap<>();
//    list.setMessages(list.getNumber(), messageHashMap);
//  }
  
//  public void OLDprintMessage() {
//    CreateMessageList list = new CreateMessageList();
//    HashMap<Integer, String> messageHashMap = new HashMap<>();
//    list.shoutOutCannedMessage(messageHashMap);
//  }















//  // NOTE: below is old and working, but I don't think I need a main method here

//  /**
//   * @param args the command line arguments
//   */
//  public static void main(String[] args) {
//
//    // Create objects.
//    CreateMessageList list = new CreateMessageList(); // Create a new message list object.
//    HashMap<Integer, String> messageHashMap = new HashMap<>(); // Create hash map object to hold user messages.
//
//    // Welcome the user.
//    System.out.printf("Welcome to the \"ShoutBox\" program. Let's shout some messages!%n%n");
//
//    // Collect number of messages (this is the size of the hash map) & the messages (these are the hash map values) from the user.
//    list.setMessages(list.getNumber(), messageHashMap);
//    
//    // Print messages.
//    list.shoutOutCannedMessage(messageHashMap);
//
//  }

}
