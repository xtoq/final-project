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
    MyClone clone = new MyClone();
    ShoutBox shout = new ShoutBox();
//    HashMap<Integer, String> messageHashMap = new HashMap<>();

    // introduction
    clone.introduction();
    
//    System.out.println("First, we're going to have to name your clone.");
    
//    System.out.printf("%nYour clone's name is currently %s%n", clone.getFullName());
    clone.collectName();
    
    // print name of avatar
//    System.out.printf("%n>>>>> Your clone's name is %s <<<<<%n", clone.getFullName());
    
//    System.out.printf("---------------------------------------%n");
    
    // shout box message collection
//    shout.collectMessages(shout.getNumber("How many messages would you like to enter?"), messageHashMap);
    System.out.printf("How many messages would you like to enter?%n");
    shout.collectMessages();

    // collect message #
    
    // collect messages x message #
    
    // print all messages
    
    // let user select message to print
//    shout.shoutOutCannedMessage(messageHashMap);
    shout.shoutOutCannedMessage();
    
//    System.out.printf("\t========= RESULTS =========%n");
//    System.out.printf("Clone name: %s%n",clone.getFullName());
////    System.out.printf("Message list:");
////    System.out.printf(shout.printMessageList());
//    System.out.printf("Chosen message: %s%n");
//    System.out.printf("");
//    System.out.printf("\t===========================%n");
  }

}
