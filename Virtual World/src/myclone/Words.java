package myclone;

import java.util.*;

/**
 *
 * @author Smokie Lee
 */
public class Words {
  
  // === Variables ===
  private Object subject, verb, adjective, object, adverb, sentence;
  private final ArrayList<String> subjectList, verbList, adjectiveList, objectList, adverbList;
  private final ArrayList<Object> sentenceList;
  private final HashMap<Integer, Object> sentenceHash;
  private final Print p;
  private Integer i;

  // === Constructor(s) ===
  /**
   * Initialize all variables.
   */
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

  // === Accessors ===
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
  
  /**
   * Returns the value of sentence.
   * @return
   */
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

  // === Mutators ===
  /**
   * Sets the subject variable.
   */
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
   */
  public void setSubjectList() {
    this.subjectList.add("minecraft");
    this.subjectList.add("dictionary");
    this.subjectList.add("kitten");
    this.subjectList.add("playground");
    this.subjectList.add("car");
  }
  
  /**
   * Sets the verb variable.
   */
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
  public void setSentenceHash(Object sentence) {
    i = 0;
    this.sentenceHash.put(i++,sentence);
  }

  // === Other methods ===
  /**
   * Generate all word lists at once.
   */
    public void generateLists() {
    setSubjectList();
    setVerbList();
    setAdjectiveList();
    setObjectList();
    setAdverbList();
  }
  
  /**
   * Create the list with sentences made from random words.
   */
  public void generateSentenceList() {
      generateLists(); // Generate the word lists.
      for (i = 0; i < 10; i++) { // Loop 10 times.
        generateSentence(); // Generate a sentence.      
        setSentenceList(getSentence()); // Add sentence to the sentence list.
      }
  }
  
  /**
   * Generates a random sentence.
   */
  public void generateSentence() {
    RandomWords rw = new RandomWords();
    generateLists(); // Generate the word lists.
    // For each array list, generate a random number based on array list size, then set the corresponding variable with the value at the random index.
    setSubject(p.printListElement(rw.generateRandomNumber(getSubjectList()),getSubjectList()));
    setVerb(p.printListElement(rw.generateRandomNumber(getVerbList()),getVerbList()));
    setAdjective(p.printListElement(rw.generateRandomNumber(getAdjectiveList()),getAdjectiveList()));
    setObject(p.printListElement(rw.generateRandomNumber(getObjectList()),getObjectList()));
    setAdverb(p.printListElement(rw.generateRandomNumber(getAdverbList()),getAdverbList()));
    setSentence(); // After generating each random word, set the sentence.
  }
  
  /**
   * Prints messages and lets user choose a message to print.
   */
  public void chooseSentence() {
    UserInput u = new UserInput();
    Integer messageNumber;
    p.print("","Sentence list:");
    p.printList(getSentenceList()); // Print the list of randomly generated sentences.
    do {
      messageNumber = u.collectUserInteger("Select a message from the list above to print that message."); // Sets index value to user input.
    } while (messageNumber > getSentenceList().size()); // Keep iterating if user enters something outside the index.
    p.print("","You chose:",p.printListElement(messageNumber - 1,getSentenceList())); // goes with void
  }
  
}
