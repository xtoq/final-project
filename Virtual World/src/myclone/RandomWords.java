package myclone;


import java.util.*;

/**
 *
 * @author Smokie Lee
 */
public class RandomWords {
  
  // === Variables ===
  
  private final ArrayList arrayList;
  private Integer randomNumber;
  private String printMessage;
  
  // === Constructors ===
  
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
  
  // === Accessors ===
  
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
  
  // === Mutators ===
  
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
    this.arrayList.add(word);
  }
  
  /**
   * Generate & set random number.
   */
  public void setRandomNumber() {
    setRandomNumber(null);
  }
  
  /**
   * Generate & set random number.
   * @param arrayList
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
  
  /**
   *
   * @return
   */
    
  public Integer generateRandomNumber() {
    return generateRandomNumber(0);
  }
  
  /**
   *
   * @param listName
   * @return
   */
  public Integer generateRandomNumber(ArrayList listName) {
    return generateRandomNumber(listName.size());
  }
  
  /**
   * 
   * @param size
   * @return
   */
  public Integer generateRandomNumber(Integer size) {
    Random gen = new Random();
    Integer r = gen.nextInt(size);
    return r;
  }
  
}
