/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

import java.util.HashMap;


/**
 * @author Smokie Lee
 */
public class VirtualWorld {
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyClone clone = new MyClone();
    UserInput u = new UserInput();
    ShoutBox s = new ShoutBox();
//    CreateMessageList l = new CreateMessageList();
    HashMap<Integer, String> messageHashMap;
    
    String cloneFullName;

    // introduction
    clone.introduction();
    
    // print name of avatar
//    clone.getFullName();
//    MyClone clone2 = new MyClone(clone.firstName(),clone.lastName(),clone.getFullName()); // NOTE: this is another way to do creating the clone...probably not better than chaining with no arg constructor
    
    // i: ask if correct
    
    // shout box message collection
//    s.collectMessages(); // NOTE: works but for some reason repeats the "please enter a message" the first time through
//    l.setMessages(2, messageHashMap = new HashMap<>());
//    l.setMessages(l.getNumber(), messageHashMap = new HashMap<>()); // FIXME: duplication is definitely somewhere within the getNumber method
//    l.setMessages(u.getUserInteger("%nHow many messages would you like to enter? Please enter a number.%n>> "), messageHashMap = new HashMap<>()); // NOTE: this works perfectly.
    s.collectMessages(u.getUserInteger("%nHow many messages would you like to enter? Please enter a number.%n>> "), messageHashMap = new HashMap<>()); // NOTE: this works perfectly.
    
    // collect message #
    
    // collect messages x message #
    
    // print all messages

  }
  
}
