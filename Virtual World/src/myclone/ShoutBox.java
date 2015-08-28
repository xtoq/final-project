/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

// NOTE: imports
import java.util.HashMap; // Since we need 3 imports, this seems more prudent. Also endorsed by the Java documentation.

/**
 * The ShoutBox class collects and displays user messages.
 *
 * @author Smokie Lee
 */
public class ShoutBox {
  
  public ShoutBox() {
//    this(null);
  }
  
  public ShoutBox(String wtf) {
  }

  /**
   * Collect messages from the user.
   *
   * @param numMessages Number of messages to enter.
   * @param messageListName Name of the array message list to add to.
   */
  public void collectMessages(Integer numMessages, HashMap<Integer, String> messageListName) {
  UserInput u = new UserInput();
  CreateMessageList l = new CreateMessageList();
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0. // NOTE: change this
      messageListName.put(i, u.getUserString("%nPlease enter a message:%n>> ")); // Add user input into hash map.
    }
  }
  
  public void OLDcollectMessages() {
    CreateMessageList list = new CreateMessageList();
    HashMap<Integer, String> messageHashMap = new HashMap<>();
    list.setMessages(list.getNumber(), messageHashMap);
  }
  
  public void OLDprintMessage() {
    CreateMessageList list = new CreateMessageList();
    HashMap<Integer, String> messageHashMap = new HashMap<>();
    list.shoutOutCannedMessage(messageHashMap);
  }















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
