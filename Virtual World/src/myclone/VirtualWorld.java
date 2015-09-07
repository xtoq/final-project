package myclone;

/**
 * @author Smokie Lee
 */
public class VirtualWorld {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // milestone 4
    ShoutBox s = new ShoutBox();
    MyClone m = new MyClone();
    Print p = new Print();
    
    // Welcome the user.
    m.welcome();
    
    // Generate random sentences so the user can choose one.
    p.print("","--- shoutOutCannedMessage() ---");
    s.shoutOutCannedMessage();
    
    // Generate a random sentence.
    p.print("","--- shoutOutRandomMessage() ---");
    s.shoutOutRandomMessage();
    
    // Thank the user.
    m.thanks();
    
//    // milestone 3    
//    MyClone clone = new MyClone();
//    ShoutBox shout = new ShoutBox();
//    clone.introduction();
//    shout.collect();
//    shout.shoutOutCannedMessage();
//    clone.thanks();
  }

}
