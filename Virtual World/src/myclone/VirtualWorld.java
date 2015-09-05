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
//    HashMap<Integer,String> list = new HashMap<>();
    
    // welcome user
    Print p = new Print();
    p.print("Welcome");
    
    // create word lists
    ArrayList<String> wordList = new ArrayList<>();
    wordList.add("wordList-1");
    wordList.add("wordList-2");
    wordList.add("wordList-3");
    p.print("List:",wordList);
    
    // generate random number
//    Random g = new Random();
//    Integer r = g.nextInt(wordList.size());
//    p.print(r);
    
    // print word in array based on random number
//    p.print("Random word:",wordList.get(r));
    
    for (int i = 0; i < wordList.size(); i++) {
      // generate random number
      Random g = new Random();
      Integer r = g.nextInt(wordList.size());
      p.print();
      p.print("Random #:",r);
      // print word in array based on random number
      p.print("Random word:",wordList.get(r));
    }
    
    
    
    
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
