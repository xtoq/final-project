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
    
    // debug
    System.out.printf("\t========= RESULTS =========%n");
    System.out.printf("Clone name: %s%n",clone.getFullName());
//    System.out.printf("Message list:");
//    System.out.printf(shout.printMessageList());
//    System.out.printf("Chosen message: %s%n");
//    System.out.printf("");
//    System.out.printf("\t===========================%n");
    clone.setFullName("Smokie","Lee");
    System.out.printf("Clone name: %s%n",clone.getFullName());
    
    UserInput u = new UserInput();
    u.setUserString(u.collectUserString("String: "));
    System.out.printf("%s%n",u.userString());
//    System.out.printf("%s%n",u.collectUserString());

    
    
    
    
    
    
    
    
    
    
    
    
    // ============================================== WORKING ==========================================================
//    MyClone clone = new MyClone();
//    ShoutBox shout = new ShoutBox();
    // introduction
//    clone.introduction();
//    clone.collectName();
    
    // print name of avatar
//    System.out.printf("%n>>>>> Your clone's name is %s <<<<<%n", clone.getFullName());
//    System.out.printf("---------------------------------------%n");
    
    // shout box message collection
//    System.out.printf("How many messages would you like to enter?%n");
//    shout.collectMessages();
    
    // let user select message to print
//    shout.shoutOutCannedMessage();
  }

}
