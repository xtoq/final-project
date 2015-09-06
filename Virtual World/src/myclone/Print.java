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
  
  public void printListElement() {
    printListElement(0);
  }
  
  public void printListElement(Integer wordIndex) {
    printListElement(wordIndex,null);
  }
  
  public void printListElement(ArrayList listName) {
    printListElement(null,listName);
  }
  
  public void printListElement(Integer wordIndex,ArrayList listName) {
//    listName.get(wordIndex);
    System.out.printf("%s%n",listName.get(wordIndex));
  }
}
