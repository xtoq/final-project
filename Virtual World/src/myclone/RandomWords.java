package myclone;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smokie Lee
 */
public class RandomWords {
  
  // Variables
  
  private final ArrayList arrayList;
  private Integer randomNumber;
  private String printMessage;
  
  // Constructors
  
  /**
   * Create a new WordUp object with new array list.
   */
  public RandomWords() {
    this(new ArrayList<>());
  }
  
  /**
   * Create a new WordUp object with an existing array list.
   * @param arrayList Name of array list.
   */
  public RandomWords(ArrayList arrayList) {
    this.arrayList = arrayList;
    this.randomNumber = 0;
    this.printMessage = "";
  }
  
  // Accessors
  
  /**
   * Returns value of arrayList as an array.
   * @return arrayList
   */
    public ArrayList getArrayList() {
    return arrayList;
  }
  
  /**
   * Returns the value of randomNumber.
   * @return randomNumber
   */
  public Integer getRandomNumber() {
    return randomNumber;
  }
  
  /**
   * Returns the value of printMessage.
   * @return printMessage
   */
  public String getPrintMessage() {
    return printMessage;
  }
  
  // Mutators
  
  /**
   * Set array list values.
   */
    public void setArrayList() {
    setArrayList("");
  }
  
  /**
   * Set array list values.
   * @param word String to add as array list value.
   */
  public void setArrayList(String word) {
    // set/put values into the array list
    this.arrayList.add(word);
  }
  
  /**
   * Generate & set random number.
   */
  public void setRandomNumber() {
    // compute random number then set it
//    Random gen = new Random();
//    this.randomNumber = gen.nextInt(this.arrayList.size());
    setRandomNumber(null);
  }
  
  /**
   * Generate & set random number.
   * @param listName
   */
  public void setRandomNumber(ArrayList arrayList) {
    // compute random number then set it
    Random gen = new Random();
    this.randomNumber = gen.nextInt(this.arrayList.size());
  }
  
  /**
   * Set printMessage variable.
   */
  public void setPrintMessage() {
    setPrintMessage(randomNumber);
  }
  
  /**
   * Set printMessage variable.
   * @param messageNumber Index number of array list value.
   */
  public void setPrintMessage(Integer messageNumber) {
    this.printMessage = (String) arrayList.get(messageNumber); // Cast the object that is returned into String, since printMessage is a String variable.
  }
  
  // Misc methods
  
  /**
   * Generate & print a random number.
   */
    public void randomNumber() {
    setRandomNumber();
    System.out.printf("Number: %s%n",getRandomNumber());
  }

  /**
   * Print random message.
   */
  public void randomMessage() {
    setPrintMessage(getRandomNumber());
    System.out.printf("Word: \t%s%n",getPrintMessage());
  }
  
//  /**
//   * Populate/generate the array list.
//   */
//  public void generateList() {
//    setArrayList("antling");
//    setArrayList("baby");
//    setArrayList("calf");
//    setArrayList("chick");
//    setArrayList("codling");
//    setArrayList("cria");
//    setArrayList("cub");
//    setArrayList("duckling");
//    setArrayList("elver");
//    setArrayList("fawn");
//    setArrayList("fledgling");
//    setArrayList("foal");
//    setArrayList("hake");
//    setArrayList("hatchling");
//    setArrayList("infant");
//    setArrayList("joey");
//    setArrayList("kit");
//    setArrayList("kitten");
//    setArrayList("larvae");
//    setArrayList("nymph");
//    setArrayList("pinkie");
//    setArrayList("puggle");
//    setArrayList("pup");
//    setArrayList("puppy");
//    setArrayList("pupae");
//    setArrayList("snakelet");
//    setArrayList("squab");
//    setArrayList("tadpole");
//  }

//  /**
//   * Introduce the user to the program.
//   */
//  public void welcome() {
//    System.out.printf("Welcome to the \"RandomWords\" program. Let's print random words!%n");
//    System.out.printf("%n\t\tCreated by Smokie Lee");
//    System.out.printf("%n\t---------------------------------------%n%n");
//  }
  
//  /**
//   * Thank the user.
//   */
//  public void thanks() {
//    System.out.printf("%n\t---------------------------------------%n");
//    System.out.printf("\t\tThanks for playing!%n");
//  }
  
  public Integer generateRandomNumber() {
//    return generateRandomNumber(arrayList.size());
    return generateRandomNumber(0);
  }
  
  public Integer generateRandomNumber(ArrayList listName) {
    return generateRandomNumber(listName.size());
  }
  
  public Integer generateRandomNumber(Integer size) {
    Random gen = new Random();
    Integer r = gen.nextInt(size);
    return r;
  }

//  /**
//   * @param args the command line arguments
//   */
//  public static void main(String[] args) {
//    // Create new object.
//    RandomWords w = new RandomWords();
//
//    // Welcome the user.
////    w.welcome();
//    
//    // Generate the word list.
//    w.generateList();
//    
//    // Generate the random number.
//    w.randomNumber();
//    
//    // Print the word from the list.
//    w.randomMessage();
//    
//    // Thank the user.
////    w.thanks();
//  }
  
}
