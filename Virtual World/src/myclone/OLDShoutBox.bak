package myclone;

import java.util.*; // Since we need 3 imports, this seems more prudent. Also endorsed by the Java documentation.

/**
 * The ShoutBox class collects and displays user messages.
 * @author Smokie Lee
 */
public class ShoutBox {

  private final HashMap<Integer, String> messageList;
  private final String singleMessage;
  private Integer numMessages;
  private UserInput u = new UserInput(); // TODO: probably delete this and put it in each method instead?
  private Integer messageNumber;

  /**
   * Create a shout box with default values.
   */
  public ShoutBox() {
    this.messageList = new HashMap<>();
    this.singleMessage = "No message";
    this.numMessages = 10;
    this.u = null;
    this.messageNumber = 1;
  }
  
  /**
   * Returns the value of numMessages.
   * @return numMessages
   */
  public Integer getNumMessages() {
    return numMessages;
  }
  
  /**
   * Returns the message list as a hash map.
   * @return messageList
   */
  public HashMap<Integer, String> getMessageList() { // RETURN A HASHMAP!
    return messageList;
  }
  
  /**
   * Returns a single message from the list.
   * @return singleMessage Return a value from the hash map that corresponds to the messageNumber.
   */
  public String getSingleMessage() { // PRINT SINGLE MESSAGE
    return getSingleMessage(messageNumber);
  }
  
  /**
   * Returns a single message from the list.
   * @param messageNumber Index of a value in the hash map.
   * @return singleMessage Return a value from the hash map that corresponds to the messageNumber.
   */
  public String getSingleMessage(Integer messageNumber) { // PRINT SINGLE MESSAGE
    return singleMessage;
  }
  
  /**
   * Returns the value of messageNumber.
   * @return messageNumber Return the value of messageNumber.
   */
  public Integer getMessageNumber() {
    return messageNumber;
  }
  
//  public void setMessages() {
//    this.messages = printList();
//  }
  
  /**
   * Sets the number of messages in the list.
   */    
  public void setNumMessages() {
    setNumMessages(getNumMessages());
  }
  
  /**
   * Sets the number of messages in the list.
   * @param numMessages Size of hash map/number of messages in list.
   */
  public void setNumMessages(Integer numMessages) {
    this.numMessages = numMessages;
  }
  
  /**
   * Prints the list of messages.
   * @return Returns the hash map as a formatted list.
   */
  public String printList() {
    return printList(getMessageList());
  }
  
  /**
   * Prints the list of messages.
   * @param messageList
   * @return Returns the hash map as a formatted list.
   */
  public String printList(HashMap<Integer, String> messageList) { // PRINT MESSAGE LIST
    System.out.printf("Message List:%n");
    for (Map.Entry<Integer, String> entry : messageList.entrySet()) { // Enahnced for loop is more efficient here when we're iterating through the set.
      System.out.printf("%s. %s%n", entry.getKey(), entry.getValue()); // Print key and value as a list.
    }
    return "";
  }
  
  /**
   * Sets the messageNumber variable.
   */
  public void setMessageNumber() {
    setMessageNumber(getMessageNumber());
  }
  
  /**
   * Sets the messageNumber variable.
   * @param messageNumber
   */
  public void setMessageNumber(Integer messageNumber) {
    this.messageNumber = messageNumber;
  }
  
  /**
   * Collect messages from the user to populate the list/hash map.
   */
  public void collectMessages() {
    collectMessages(getNumMessages(),getMessageList());
  }
  
  /**
   * Collect messages from the user to populate the list/hash map.
   * @param numMessages Number of messages to enter.
   */
  public void collectMessages(Integer numMessages) {
    collectMessages(numMessages,getMessageList());
  }

  /**
   * Collect messages from the user to populate the list/hash map.
   * @param numMessages Number of messages to enter.
   * @param messageList Name of the message list.
   */
  public void collectMessages(Integer numMessages, HashMap<Integer, String> messageList) {
    u = new UserInput();
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
      messageList.put(i, u.collectUserString("Please enter a message.")); // Add user input into hash map.
    }
  }
  
  /**
   * Collect number of messages to store from the user.
   */
  public void collectNumMessages() {
    u = new UserInput();
    setNumMessages(u.collectUserInteger("How many messages would you like to enter?"));
  }
  
  /**
   * Print a single message.
   * @return singleMessage Returns message at provided index value.
   */
  public String printMessage() {
    return printMessage(getMessageNumber());
  }
  
  /**
   * Print a single message.
   * @param messageNumber
   * @return singleMessage Returns message at provided index value.
   */
  public String printMessage(Integer messageNumber) {
    return printMessage(messageNumber,getMessageList());
  }
  
   /**
   * Print a single message.
   * @param messageNumber Hash map index number.
   * @param messageList Name of hash map to access.
   * @return singleMessage Returns message at provided index value.
   */
  public String printMessage(Integer messageNumber, HashMap<Integer, String> messageList) {
    System.out.printf("%nYou chose: %s%n", messageList.get(messageNumber));
    return getSingleMessage();
  }
  
  /**
   * Allow the user to select a message from the list.
   * @return messageNumber Return the index chosen by the user.
   */
  public Integer selectMessage() {
    return selectMessage(getMessageNumber());
  }
  
  /**
   * Allow the user to select a message from the list.
   * @param messageNumber Index of value that user chooses.
   * @return messageNumber Return the index chosen by the user.
   */
  public Integer selectMessage(Integer messageNumber) {
    return selectMessage(messageNumber,getMessageList());
  }
  
  /**
   * Allow the user to select a message from the list.
   * @param messageNumber Index of value that user chooses.
   * @param messageList Name of hash map to access.
   * @return messageNumber Return the index chosen by the user.
   */
    
  public Integer selectMessage(Integer messageNumber,HashMap<Integer, String> messageList) {
    do {
      System.out.printf("%nSelect a message from the list below to print that message.%n%n");
      printList(getMessageList()); // Print messages from the list in args. 
      setMessageNumber(u.collectUserInteger()); // Sets index value to user input.
    } while (messageNumber > messageList.size()); // Keep iterating if user enters something outside the index.
    return getMessageNumber();
  }
  
  /**
   * Allows the user to select a message from the list, then prints the selected message.
   */
  public void shoutOutCannedMessage() {
    printMessage(selectMessage());
  }
  
  /**
   * Allows the user to determine how many messages are stored, then collects each message.
   */
  public void collect() {
    collectNumMessages();
    collectMessages();
  }

  // TODO: must have shoutOutCanneMessage() and shoutOutRandomMessage() methods
}
