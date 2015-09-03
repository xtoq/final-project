package myclone;

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
    
    clone.introduction();
    shout.collect();
    shout.shoutOutCannedMessage();
    clone.end();
  }

}
