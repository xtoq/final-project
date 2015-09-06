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
    // TODO: create generateLists() method to generate all words at once
    Words w = new Words();
    w.generateLists();
    
    // generate random numbers and print the words associated with them
    
    // TODO: generate 5 random sentences and set them in the array list
    for (int i = 0; i < 5; i++) {
      // generate sentence
      w.generateSentence(); // do this 5 times to get a (hopefully) different sentence every time (for? do while?)

      // add sentence into sentence list/generate sentence list
      w.generateSentenceList();
    }

      // print sentence list
      p.print("","Sentence list:");
      p.printList(w.getSentenceList());
    
    
    // TODO: let user choose a message from the list
    
    // TODO: print message user chose
    
    
    
    
    
    
    
    
//    for (int i = 0; i < w.getSubjectList().size(); i++) {
//    }
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
