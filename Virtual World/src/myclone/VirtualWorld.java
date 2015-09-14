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
    UserInput u = new UserInput();
    
    // Welcome the user.
    m.introduction();
    
    Boolean r = u.yesOrNo();
    if (r == true) {
        s.shoutOutRandomMessage();
    }
    else {
      s.shoutOutCannedMessage();
    }
    
    // Thank the user.
    m.thanks();
  }

}
