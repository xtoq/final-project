package myclone;

import java.util.*;

/**
 * @author Smokie Lee
 */
public class Print {
  
  // === Variables ===
  private final Object x;
  
  /**
   * Constructor.
   */
  public Print() {
    this("");
  }
  
  /**
   * Set variable x to argument.
   * @param x
   */
  public Print(Object x) {
    this.x = x;
  }
  
  /**
   * Return x.
   * @return x
   */
  public Object getObject() {
    return x;
  }
  
  /**
   * Print whatever is passed.
   */
  public void print() {
    print(getObject());
  }

  /**
   * Print whatever is passed.
   * @param x
   */
    public void print(Object x) {
    System.out.printf("%s%n",x);
  }
  
  /**
   * Print whatever is passed.
   * @param x
   * @param y
   */
  public void print(Object x,Object y) {
    System.out.printf("%s%n%s%n",x,y);
  }
  
  /**
   * Print whatever is passed.
   * @param x
   * @param y
   * @param z
   */
  public void print(Object x,Object y,Object z) {
    System.out.printf("%s%n%s%n%s%n",x,y,z);
  }
  
  /**
   * Print out each message in the array list in a numbered list.
   */
  public void printList() {
    printList(null);
  }
  
  /**
   * Print out each message in the array list in a numbered list.
   * @param listName
   */
  public void printList(ArrayList listName) {
    int order = 1; // Counter for the numbered list.
    for (Object message : listName) { // Enhanced for loop is more efficient here.
      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
    }
  }
  
  /**
   * Return array list value.
   * @return
   */
  public Object printListElement() {
    return printListElement(0);
  }
  
  /**
   * Return array list value.
   * @param wordIndex
   * @return array list value
   */
  public Object printListElement(Integer wordIndex) {
    return printListElement(wordIndex,null);
  }
  
  /**
   * Return array list value.
   * @param listName
   * @return array list value
   */
  public Object printListElement(ArrayList listName) {
    return printListElement(null,listName);
  }
  
  /**
   * Return array list value.
   * @param wordIndex
   * @param listName
   * @return array list value
   */
  public Object printListElement(Integer wordIndex,ArrayList listName) {
    return listName.get(wordIndex);
  }
  
  /**
   * Return array list value.
   * @param wordIndex
   * @param listName
   * @return array list value
   */
  public Object printHashElement(Integer wordIndex,HashMap listName) {
    return listName.get(wordIndex);
  }
}
