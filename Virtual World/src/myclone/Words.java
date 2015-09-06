package myclone;

import java.util.*;

/**
 *
 * @author Smokie Lee
 */
public class Words {
  
  // initialize variables
  private Object subject, verb, adjective, object, adverb, sentence;
  private final ArrayList<String> subjectList, verbList, adjectiveList, objectList, adverbList;
  private final ArrayList<Object> sentenceList;
  private final HashMap<Integer, Object> sentenceHash;
  private final Print p;
  private Integer i;

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
    this.sentenceHash = new HashMap<>();
    this.p = new Print();
    this.i = 0;
  }

  // getters/accessors (return)
  /**
   * Returns the value of the subject variable.
   * @return the value of subject
   */
  public Object getSubject() {
    return subject;
  }
  
  /**
   * Returns the value of the subjectList variable.
   * @return the value of subjectList
   */
  public ArrayList getSubjectList() {
//    setSubjectList();
    return subjectList;
  }

  /**
   * Returns the value of the verb variable.
   * @return the value of verb
   */
  public Object getVerb() {
    return verb;
  }
  
  /**
   * Returns the value of the verbList variable.
   * @return the value of verbList
   */
  public ArrayList getVerbList() {
//    setVerbList();
    return verbList;
  }

  /**
   * Returns the value of the adjective variable.
   * @return the value of adjective
   */
  public Object getAdjective() {
    return adjective;
  }
  
  /**
   * Returns the value of the adjectiveList variable.
   * @return the value of adjectiveList
   */
  public ArrayList getAdjectiveList() {
    return adjectiveList;
  }

  /**
   * Returns the value of the object variable.
   * @return the value of object
   */
  public Object getObject() {
    return object;
  }
  
  /**
   * Returns the value of the objectList variable.
   * @return the value of objectList
   */
  public ArrayList getObjectList() {
    return objectList;
  }

  /**
   * Returns the value of the adverb variable.
   * @return the value of adverb
   */
  public Object getAdverb() {
    return adverb;
  }
  
  /**
   * Returns the value of the adverbList variable.
   * @return the value of adverbList
   */
  public ArrayList getAdverbList() {
    return adverbList;
  }
  
  public Object getSentence() {
    return sentence; // Returns the value of sentence.
  }
  
  /**
   * Returns the value of the sentenceList variable.
   * @return the value of sentenceList
   */
  public ArrayList getSentenceList() {
    return sentenceList;
  }
  
  /**
   * Returns the value of the sentenceHash variable.
   * @return the value of sentenceHash
   */
  public HashMap<Integer,Object> getSentenceHash() {
    return sentenceHash;
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
    this.sentence = getSubject() + " " + getVerb() + " " + getAdjective() + " " + getObject() + " " + getAdverb();
  }
  
  /**
   * Add each new sentence to the sentenceList array
   * @param sentence
   */
  public void setSentenceList(Object sentence) {
    this.sentenceList.add(sentence);
  }
  
  /**
   * Add each new sentence to the sentenceHash array
   * @param sentence
   */
  public void setSentenceHash(Object sentence) { // HASHMAPSTUFF
    i = 0;
    this.sentenceHash.put(i++,sentence);
  }

  // other methods

  /**
   * Generate all word lists at once.
   */
    public void generateLists() {
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
  
  /**
   *
   */
  public void generateSentenceList() {
      // create word lists
      generateLists();
      for (int i = 0; i < 10; i++) {
        generateSentence(); // generate sentence        
        setSentenceList(getSentence()); // add sentence into sentence list/generate sentence list
//        setSentenceHash(getSentenceHash()); // add sentence into sentence list/generate sentence list // HASHMAPSTUFF
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
  
  /**
   *
   */
  public void chooseSentence() {
    // let user choose a message from the list
    UserInput u = new UserInput();
    Integer messageNumber;
    // print sentence list
    p.print("","Sentence list:");
    p.printList(getSentenceList());
//    p.printHash(getSentenceHash()); // HASHMAPSTUFF
    do { // do {collect input} while user input is outside array
      // collect user input
      messageNumber = u.collectUserInteger("Select a message from the list above to print that message."); // Sets index value to user input.
    } while (messageNumber > getSentenceList().size()); // Keep iterating if user enters something outside the index.
//    } while (messageNumber > getSentenceHash().size()); // Keep iterating if user enters something outside the index. // HASHMAPSTUFF
    p.print("","You chose:",p.printListElement(messageNumber - 1,getSentenceList()));
//    p.print("","You chose:",p.printHashElement(messageNumber - 1,getSentenceHash())); // HASHMAPSTUFF
  }
  
}
