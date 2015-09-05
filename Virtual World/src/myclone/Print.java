/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclone;

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
}
