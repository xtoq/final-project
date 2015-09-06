package myclone;

import java.util.*;

/**
 * @author Smokie Lee
 */
public class VirtualWorld {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // milestone 4
    Words w = new Words();
    Print p = new Print();
    // TODO: add welcome message
    
    // === shoutOutCannedMessage() ===
    // generate sentences
    w.generateSentenceList();
    // let user choose a message from the list to print
    w.chooseSentence();
    // === end shoutOutCannedMessage() ===
    
    // === shoutOutRandomMessage() ===
    w.generateSentence();
    w.setSentenceList(w.getSentence());
//    w.setSentenceHash(w.getSentence()); // HASHMAPSTUFF
    // print sentence list
    p.print("","Random message:");
    p.print(w.getSentence());
    // === end shoutOutRandomMessage() ===
  
    
//    w.generateSentenceList();
//    w.chooseSentence();
    
    
    // create sentence list
    // print message/sentence list
    // select message/sentence
    // print selected message/sentence
    // thank user
    
//    // milestone 3    
//    MyClone clone = new MyClone();
//    ShoutBox shout = new ShoutBox();
//    clone.introduction();
//    shout.collect();
//    shout.shoutOutCannedMessage();
//    clone.end();
  }

}
