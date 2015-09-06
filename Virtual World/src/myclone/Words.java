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
  private String subject, verb, adjective, object, adverb;
//  private HashMap<> list;
//  private final HashMap<Integer, String> wordList;
  private final ArrayList<String> subjectList, verbList, adjectiveList, objectList, adverbList;

  // constructor(s)
  public Words() {
    this.subject = "";
    this.verb = "";
    this.adjective = "";
    this.object = "";
    this.adverb = "";
    this.subjectList = new ArrayList<>();
    this.verbList = new ArrayList<>();
    this.adjectiveList = new ArrayList<>();
    this.objectList = new ArrayList<>();
    this.adverbList = new ArrayList<>();
  }

  // getters/accessors (return)
  /**
   * Returns the value of the subject variable.
   * @return the value of subject
   */
  public String getSubject() {
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
  public String getVerb() {
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

//  /**
//   * Returns the value of the adjective variable.
//   * @return the value of adjective
//   */
//  public String getAdjective() {
//    return adjective; // Returns the value of adjective.
//  }
//
//  /**
//   * Returns the value of the object variable.
//   * @return the value of object
//   */
//  public String getObject() {
//    return object; // Returns the value of object.
//  }
//
//  /**
//   * Returns the value of the adverb variable.
//   * @return the value of adverb
//   */
//  public String getAdverb() {
//    return adverb; // Returns the value of adverb.
//  }

  // setters/mutators (void)
  /**
   * Sets the subject variable.
   * @param word Subject word.
   */
  public void setSubject(String word) {
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
  }

  /**
   * Sets the verb variable.
   * @param word Verb word.
   */
  public void setVerb(String word) {
    this.verb = word;
  }
  
  /**
   * Sets the verbList variable.
   * @param word SubjectList word.
   */
  public void setVerbList() {
    this.verbList.add("kill");
    this.verbList.add("read");
    this.verbList.add("pet");
  }

//  /**
//   * Sets the adjective variable.
//   * @param word Adjective word.
//   */
//  public void setAdjective(String word) {
//    this.adjective = word;
//  }
//
//  /**
//   * Sets the object variable.
//   * @param word Subject word.
//   */
//  public void setObject(String word) {
//    this.object = word;
//  }
//  
//  /**
//   * Sets the adverb variable.
//   * @param word Adverb word.
//   */
//  public void setAdverb(String word) {
//    this.adverb = word;
//  }

  // other methods
  public void addToList() {
    addToList(null);
  }
  
  public void addToList(ArrayList listName) {
    addToList(listName,null,null,null);
//    listName.add("1");
//    listName.add("2");
//    listName.add("3");
  }
  
  public void addToList(String a,String b,String c) {
    addToList(null,a,b,c);
  }
  
  public void addToList(ArrayList listName,String a,String b,String c) {
    listName.add(a);
    listName.add(b);
    listName.add(c);
  }
  
  public void generateList() {
    generateList(null);
  }
  
  public void generateList(ArrayList listName) {
    listName = new ArrayList<>();
    addToList(listName);
//    listName.add("1");
//    listName.add("2");
//    listName.add("3");
    Print p = new Print();
    p.print("List:",listName);
  }
}
