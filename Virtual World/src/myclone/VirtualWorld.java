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
//    p.print("Welcome");
    
    // create word lists
    Words w = new Words();
    
    w.setSubjectList();
    w.setVerbList();
    
    p.print("Subjects:");
    p.printList(w.getSubjectList());
    
    p.print("","Verbs:");
    p.printList(w.getVerbList());
    
    // generate random number
    WordUp wu = new WordUp();
    p.print("","Random subject word:");
    p.printListElement(wu.generateRandomNumber(w.getSubjectList().size()),w.getSubjectList());
    p.print("","Random verb word:");
    p.printListElement(wu.generateRandomNumber(w.getVerbList().size()),w.getVerbList());
    
//    p.print(wu.generateRandomNumber(w.getVerbList().size()));
//    p.print(wu.generateRandomNumber(w.getSubjectList().size()));

    
    
    
    
    
    
    
    
    
    
    
    // DO BELOW FOR EACH ARRAY LIST/WHILE ARRAY LISTS EXIST
    
    
    // generate random number
//    Random g = new Random();
//    Integer r = g.nextInt(subjectList.size());
//    p.print(r);
    
    // print word in array based on random number
//    p.print("Random word:",subjectList.get(r));
    
    // DO ABOVE FOR EACH ARRAY LIST/WHILE ARRAY LISTS EXIST
    
    // picks a different number and prints a word based on the size of the list...not exactly what we want
//    for (int i = 0; i < subjectList.size(); i++) {
//      // generate random number
//      Random g = new Random();
//      Integer r = g.nextInt(subjectList.size());
//      p.print();
//      p.print("Random #:",r);
//      // print word in array based on random number
//      p.print("Random word:",subjectList.get(r));
//    }
    
//    for (int i = 0; i < subjectList.size(); i++) {
//    }
    
    
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
