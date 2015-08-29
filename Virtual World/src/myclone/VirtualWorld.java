/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

//import java.util.HashMap;

/**
 * @author Smokie Lee
 */
public class VirtualWorld {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    // debug
    MyClone clone = new MyClone();
//    UserInput u = new UserInput();
    ShoutBox shout = new ShoutBox();
    
    System.out.printf("Number of messages: %s%n",shout.getNumMessages());
    System.out.printf("First name: %s%nLast name: %s%nFull name: %s%n",clone.getFirstName(),clone.getLastName(),clone.getFullName());
    
//    clone.introduction();
//    clone.collectName();
//    shout.collectMessages();
    
//    shout.setNumMessages(3);
    shout.collectNumMessages();
    
    
    System.out.printf("\t%n========= RESULTS =========%n");
    System.out.printf("Number of messages: %s%n",shout.getNumMessages());
    System.out.printf("First name: %s%nLast name: %s%nFull name: %s%n",clone.getFirstName(),clone.getLastName(),clone.getFullName());
    
    
    
    
    
    
    
    
    
    
    
    
//    // ============================================== WORKING ==========================================================
//    MyClone clone = new MyClone();
//    ShoutBox shout = new ShoutBox();
//    // introduction
//    clone.introduction();
//    
//    // shout box message collection
//    System.out.printf("How many messages would you like to enter?%n");
//    shout.collectMessages();
//    
//    // let user select message to print
//    shout.shoutOutCannedMessage();
  }

}
