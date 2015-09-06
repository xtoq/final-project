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
public class Print {
  private final Object x;
//  private final Integer xInteger;
  
  public Print() {
    this("");
//    x = "";
  }
  
  public Print(Object x) {
    this.x = x;
//    this(null,null);
//    this.x = (String) x; // Cast x into a String so we can set it.
//    y = "";
  }
  
  public Object getObject() {
    return x;
  }
  
//  public Integer getInteger() {
//    return xInteger;
//  }
  
  public void print() {
    print(getObject());
  }
  
//  public void print(String x) {
  public void print(Object x) {
//    System.out.printf("%s",getObject());
//    System.out.printf("%s%n",x);
    System.out.printf("%s%n",x);
  }
  
  public void print(Object x,Object y) {
    System.out.printf("%s%n%s%n",x,y);
  }
  
  public void print(Object x,Object y,Object z) {
    System.out.printf("%s%n%s%n%s%n",x,y,z);
  }
  
//  public void print(ArrayList arrayList) {
//    System.out.printf("%s%n",arrayList);
//    System.out.printf("%s",list1);
//  }
  
//  public void setString() {
//    setString(x);
//  }
  
//  public void setString(String x) {
//    this.x = x;
//  }
  
  /**
   * Print out each message in the array list in a numbered list.
   * @param listName
   * @param messageListName Name of the array message list.
   * @return printList    Returns a numbered list of messages.
   */
//  public String printList(ArrayList listName) {
//    int order = 1; // Counter for the numbered list.
//    String printList = "";
//    for (Object message : listName) { // Enhanced for loop is more efficient here.
//      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
//    }
//    return printList;
//  }
  
  public void printList() {
    printList(null);
  }
  
  /**
   * Print out each message in the array list in a numbered list.
   * @param listName
   * @param messageListName Name of the array message list.
   * @return printList    Returns a numbered list of messages.
   */
  public void printList(ArrayList listName) {
    int order = 1; // Counter for the numbered list.
    for (Object message : listName) { // Enhanced for loop is more efficient here.
      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
    }
  }
  
  /**
   * Prints the list of messages.
   * @param messageList
   * @return Returns the hash map as a formatted list.
   */
  public String printHash(HashMap<Integer, Object> messageList) { // PRINT MESSAGE LIST
//    System.out.printf("Message List:%n");
    int order = 1; // Counter for the numbered list.
    for (Map.Entry<Integer, Object> entry : messageList.entrySet()) { // Enhanced for loop is more efficient here.
      System.out.printf("%s. %s%n", entry.getKey(), entry.getValue()); // Print key and value as a list.
    }
    return "";
  }
  
  public Object printListElement() {
    return printListElement(0);
  }
  
  public Object printListElement(Integer wordIndex) {
    return printListElement(wordIndex,null);
  }
  
  public Object printListElement(ArrayList listName) {
    return printListElement(null,listName);
  }
  
  public Object printListElement(Integer wordIndex,ArrayList listName) {
//    listName.get(wordIndex);
//    System.out.printf("%s%n",listName.get(wordIndex));
    return listName.get(wordIndex);
  }
  
  public Object printHashElement(Integer wordIndex,HashMap listName) {
//    listName.get(wordIndex);
//    System.out.printf("%s%n",listName.get(wordIndex));
    return listName.get(wordIndex);
  }
  
  
//  public Object returnListElement(Integer wordIndex,ArrayList listName) {
//    return listName.get(wordIndex);
//  }
}
