/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

import java.util.*;

/**
 *
 * @author Smokie Lee
 */
public class Words {
  
  // initialize variables
  private Object subject, verb, adjective, object, adverb, sentence;
  private final ArrayList<String> subjectList, verbList, adjectiveList, objectList, adverbList/*, sentenceList*/;
  private final ArrayList<Object> sentenceList;
  private final HashMap<Integer, Object> sentenceListHash;
  private final Print p;

  // constructor(s)
  public Words() {
    this.subject = "";
    this.verb = "";
    this.adjective = "";
    this.object = "";
    this.adverb = "";
    this.sentence = subject + " " + verb + " " + adjective + " " + object + " " + adverb;
    this.subjectList = new ArrayList<>();
    this.verbList = new ArrayList<>();
    this.adjectiveList = new ArrayList<>();
    this.objectList = new ArrayList<>();
    this.adverbList = new ArrayList<>();
    this.sentenceList = new ArrayList<>();
    this.sentenceListHash = new HashMap<>();
    this.p = new Print();
  }

  // getters/accessors (return)
  /**
   * Returns the value of the subject variable.
   * @return the value of subject
   */
  public Object getSubject() {
    return subject; // Returns the value of subject.
  }
  
  /**
   * Returns the value of the subjectList variable.
   * @return the value of subjectList
   */
  public ArrayList getSubjectList() {
//    setSubjectList();
    return subjectList; // Returns the value of subjectList.
  }

  /**
   * Returns the value of the verb variable.
   * @return the value of verb
   */
  public Object getVerb() {
    return verb; // Returns the value of verb.
  }
  
  /**
   * Returns the value of the verbList variable.
   * @return the value of verbList
   */
  public ArrayList getVerbList() {
//    setVerbList();
    return verbList; // Returns the value of verbList.
  }

  /**
   * Returns the value of the adjective variable.
   * @return the value of adjective
   */
  public Object getAdjective() {
    return adjective; // Returns the value of adjective.
  }
  
  /**
   * Returns the value of the adjectiveList variable.
   * @return the value of adjectiveList
   */
  public ArrayList getAdjectiveList() {
    return adjectiveList; // Returns the value of adjectiveList.
  }

  /**
   * Returns the value of the object variable.
   * @return the value of object
   */
  public Object getObject() {
    return object; // Returns the value of object.
  }
  
  /**
   * Returns the value of the objectList variable.
   * @return the value of objectList
   */
  public ArrayList getObjectList() {
    return objectList; // Returns the value of objectList.
  }

  /**
   * Returns the value of the adverb variable.
   * @return the value of adverb
   */
  public Object getAdverb() {
    return adverb; // Returns the value of adverb.
  }
  
  /**
   * Returns the value of the adverbList variable.
   * @return the value of adverbList
   */
  public ArrayList getAdverbList() {
    return adverbList; // Returns the value of adverbList.
  }
  
  public Object getSentence() {
    return sentence; // Returns the value of sentence.
  }
  
  /**
   * Returns the value of the sentenceList variable.
   * @return the value of sentenceList
   */
  public ArrayList getSentenceList() {
    return sentenceList; // Returns the value of sentenceList.
  }
  
  /**
   * Returns the value of the sentenceListHash variable.
   * @return the value of sentenceListHash
   */
  public HashMap<Integer,Object> getSentenceListHash() {
    return sentenceListHash; // Returns the value of sentenceListHash.
  }

  // setters/mutators (void)
  public void setSubject() {
    setSubject(null);
  }
  
  /**
   * Sets the subject variable.
   * @param word Subject word.
   */
  public void setSubject(Object word) {
    this.subject = word;
  }
  
  /**
   * Sets the subjectList variable.
   * @param word SubjectList word.
   */
  public void setSubjectList() {
    this.subjectList.add("minecraft");
    this.subjectList.add("dictionary");
    this.subjectList.add("kitten");
    this.subjectList.add("playground");
    this.subjectList.add("car");
  }
  
  public void setVerb() {
    setVerb(null);
  }

  /**
   * Sets the verb variable.
   * @param word Verb word.
   */
  public void setVerb(Object word) {
    this.verb = word;
  }
  
  /**
   * Sets the verbList variable.
   * @param word SubjectList word.
   */
  public void setVerbList() {
    this.verbList.add("explode");
    this.verbList.add("read");
    this.verbList.add("pet");
    this.verbList.add("run");
    this.verbList.add("drive");
  }

  /**
   * Sets the adjective variable.
   * @param word Adjective word.
   */
  public void setAdjective(Object word) {
    this.adjective = word;
  }
  
  /**
   * Sets the adjectiveList variable.
   * @param sentence
   */
  public void setAdjectiveList() {
    this.adjectiveList.add("blocky");
    this.adjectiveList.add("fat");
    this.adjectiveList.add("soft");
    this.adjectiveList.add("sunny");
    this.adjectiveList.add("old");
  }

  /**
   * Sets the object variable.
   * @param word Subject word.
   */
  public void setObject(Object word) {
    this.object = word;
  }
  
  /**
   * Sets the objectList variable.
   * @param sentence
   */
  public void setObjectList() {
    this.objectList.add("zombie");
    this.objectList.add("pages");
    this.objectList.add("paws");
    this.objectList.add("swings");
    this.objectList.add("brakes");
  }
  
  /**
   * Sets the adverb variable.
   * @param word Adverb word.
   */
  public void setAdverb(Object word) {
    this.adverb = word;
  }
  
  /**
   * Sets the adverbList variable.
   * @param sentence
   */
  public void setAdverbList() {
    this.adverbList.add("slowly");
    this.adverbList.add("quietly");
    this.adverbList.add("softly");
    this.adverbList.add("actively");
    this.adverbList.add("gently");
  }

  /**
   * Sets the sentence variable.
   * @param word Verb word.
   */
  public void setSentence() {
//    this.sentence = getSubject() + " " + getVerb() + " " + getAdjective();
    this.sentence = getSubject() + " " + getVerb() + " " + getAdjective() + " " + getObject() + " " + getAdverb();
  }
  
  /**
   * Sets the sentenceList variable.
   * @param sentence
   */
  public void setSentenceList(Object sentence) {
    // add each new sentence to the sentenceList array
    this.sentenceList.add(sentence);
//    this.sentenceList.add("da fuq");
  }
  
  /**
   * Sets the sentenceListHash variable.
   * @param sentence
   */
  public void setSentenceListHash(Object sentence) {
    // add each new sentence to the sentenceListHash array
    this.sentenceListHash.put(1,sentence);
//    this.sentenceListHash.add("da fuq");
  }

  // other methods
//  public void addToList() {
//    addToList(null);
//  }
//  
//  public void addToList(ArrayList listName) {
//    addToList(listName,null,null,null);
////    listName.add("1");
////    listName.add("2");
////    listName.add("3");
//  }
//  
//  public void addToList(String a,String b,String c) {
//    addToList(null,a,b,c);
//  }
//  
//  public void addToList(ArrayList listName,String a,String b,String c) {
//    listName.add(a);
//    listName.add(b);
//    listName.add(c);
//  }
//  
//  public void generateList() {
//    generateList(null);
//  }
//  
//  public void generateList(ArrayList listName) {
//    listName = new ArrayList<>();
//    addToList(listName);
////    listName.add("1");
////    listName.add("2");
////    listName.add("3");
//    Print p = new Print();
//    p.print("List:",listName);
//  }
  
  public void generateLists() {
    // generate all lists at once (because I don't want to deal with that much user input...)
    setSubjectList();
    setVerbList();
    setAdjectiveList();
    setObjectList();
    setAdverbList();
//    // debugging
//    Print p = new Print();
//    p.print("Subjects:");
//    p.printList(getSubjectList());    
//    p.print("","Verbs:");
//    p.printList(getVerbList());
  }
  
  public void generateSentenceList() {
      // create word lists
      generateLists();
      for (int i = 0; i < 10; i++) {
        // generate sentence
        generateSentence();
        // add sentence into sentence list/generate sentence list
//        setSentenceList(getSentence());
        setSentenceListHash(getSentence());
      }
//    // debugging
//    Print p = new Print();
//    p.print("","Sentence list:");
//    p.printList(getSentenceList());
  }
  
  /**
   * Generates a random sentence by generating random numbers based on the sizes of the array lists, then accessing that index value.
   */
  public void generateSentence() {
    RandomWords rw = new RandomWords();
//    Print p = new Print();
    generateLists();
    setSubject(p.printListElement(rw.generateRandomNumber(getSubjectList()),getSubjectList()));
    setVerb(p.printListElement(rw.generateRandomNumber(getVerbList()),getVerbList()));
    setAdjective(p.printListElement(rw.generateRandomNumber(getAdjectiveList()),getAdjectiveList()));
    setObject(p.printListElement(rw.generateRandomNumber(getObjectList()),getObjectList()));
    setAdverb(p.printListElement(rw.generateRandomNumber(getAdverbList()),getAdverbList()));
    setSentence();
//    // debugging
//    p.print("","Random subject word:");
//    p.print(getSubject());
//    p.print("","Random verb word:");
//    p.print(getVerb());
  }
  
  public void chooseSentence() {
    // let user choose a message from the list
    UserInput u = new UserInput();
    Integer messageNumber;
//    Print p = new Print();
//    p = new Print();
    // print sentence list
    p.print("","Sentence list:");
//    p.printList(getSentenceList());
    p.printHash(getSentenceListHash());
    // do {collect input} while user input is outside array
    do {
//      // print sentence list
//      p.print("","Sentence list:");
//      p.printList(w.getSentenceList());
      // collect user input
      messageNumber = u.collectUserInteger("Select a message from the list above to print that message."); // Sets index value to user input.
//      setMessageNumber(u.collectUserInteger()); // Sets index value to user input.
//    } while (messageNumber > getSentenceList().size()); // Keep iterating if user enters something outside the index.
    } while (messageNumber > getSentenceListHash().size()); // Keep iterating if user enters something outside the index.
//    p.print("","You chose:",p.printListElement(messageNumber - 1,getSentenceList()));
    p.print("","You chose:",p.printHashElement(messageNumber - 1,getSentenceListHash()));
  }
  
  public Integer OLDchooseSentence() {
    // let user choose a message from the list
    UserInput u = new UserInput();
    Integer messageNumber;
    // do {print list & collect input} while user input is outside array
    do {
//      // print sentence list
//      p.print("","Sentence list:");
//      p.printList(w.getSentenceList());
      // collect user input
      messageNumber = u.collectUserInteger("Select a message from the list above to print that message."); // Sets index value to user input.
//      setMessageNumber(u.collectUserInteger()); // Sets index value to user input.
//    } while (messageNumber > getSentenceList().size()); // Keep iterating if user enters something outside the index.
    } while (messageNumber > getSentenceListHash().size()); // Keep iterating if user enters something outside the index.
    return messageNumber - 1; // subtract 1 because the index starts at 0 not 1
  }
  
  
}
