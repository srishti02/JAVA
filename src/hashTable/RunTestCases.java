package hashTable;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.Vector;

/**
 * @description This class runs the test cases for Lab-Assignment-1 Ques 1-3.
 */
public class RunTestCases {

  /** A object of interface type which later will be cast to various
   * implementations.*/
  public static HashTable<String> hashObj;

  public static Scanner obj = new Scanner(System.in);

  /** This vector shall hold the randomly generated strings.*/
  public static Vector<String> randomGenStrVec;

  /**
   * @brief Insert the strings in vector(randomGenStrVec) to hash table. Every
   *        insert operation is timed to calculate the average insertion time at
   *        the end of method.
   */
  public static void insertStringsToHash() {

    long totalTime = 0;
    // iterate and insert the strings to hash map
    for( String str : randomGenStrVec) {

      Instant start = Instant.now();
      hashObj.insert(str);
      Instant end = Instant.now();
      totalTime += Duration.between(start,end).toNanos();
    }
    // Print the average result
    System.out.println("Average time to insert : " + String.format( "%12.9f", 
          ( totalTime/ randomGenStrVec.size() ) / (double) 1000000000 ) );
  }

  /**
   * @brief Find the vector(randomGenStrVec) of strings in a hash table. Every
   *        operation is timed to calculate average time at the end.
   *       
   *        Note : Time captured is for find + delete.
   *        Justification : No. of primitive operations would be n + n = 2n
   *        As per BigOh property, If f(n) is a polynomial of degree d, then f(n)
   *        is O(pow(n,d)); therefore the algorithm's complexity analysis shall
   *        not be affected by considering delete operation for time
   *        calculation.
   */
  public static void findAndRemoveStringsFromHash() {

    long totalTime = 0;
    /** iterate over vector and remove all strings*/
    for( String str : randomGenStrVec) {

      Instant start = Instant.now();
      /** delete operation internally will first perform find*/
      hashObj.delete(str);
      Instant end = Instant.now();
      totalTime += Duration.between(start,end).toNanos();
    }
    
    System.out.println("Average time to search and remove : " + 
        String.format( "%12.9f", 
          ( totalTime / randomGenStrVec.size() ) / (double) 1000000000 ) );
  }

  public static void main(String[] args) {

    // Question 1
    System.out.println("*****Question 1 Results*****");
    System.out.println("Enter number of strings for random generation : ");
    int elementCount = obj.nextInt();

    randomGenStrVec = HelperMethods.generateRandomStrings(elementCount);
    
    hashObj = new QuadraticProbingHashTable<>(elementCount,"A");
  
    insertStringsToHash();

    // Question 2
    // Note : Whether to generate new strings or use the already inserted ones
    //        has been made configurable with user input as it can have varied results*/
    System.out.println("*****Question 2 Results*****");
    int processInsertedString = 0;
    do {
      System.out.println("Choose and enter [1/2]: ");
      System.out.println("[1] Search already inserted strings.");
      System.out.println("[2] Generate new strings for search.");

      processInsertedString = obj.nextInt();
    }
    while(processInsertedString < 1 || processInsertedString > 2);

    if( processInsertedString == 2 ) {

      System.out.println("Enter number of strings for random generation : ");
      elementCount = obj.nextInt();

      randomGenStrVec.clear();
      randomGenStrVec = HelperMethods.generateRandomStrings(elementCount);
    }    
    
    findAndRemoveStringsFromHash();

    // Question 3
    System.out.println("*****Question 3 Results*****");
    for(int i = 1; i <= 20; ++i)
    {
      System.out.println();
      System.out.println(
          "----------Processing for " + Math.pow(2,i) + " elements---------");
      randomGenStrVec.clear();
      randomGenStrVec = HelperMethods.generateRandomStrings(
          (int)(Math.pow(2,i)));

      System.out.println("---------Cuckoo---------");
      hashObj = new CuckooHashTable<>();
      insertStringsToHash();
      findAndRemoveStringsFromHash();

      System.out.println("---------QuadraticProbing---------");
      hashObj = new QuadraticProbingHashTable<>("A");
      insertStringsToHash();
      findAndRemoveStringsFromHash();

      System.out.println("---------SeparateChaining---------");
      hashObj = new SeparateChainingHashTable<>();
      insertStringsToHash();
      findAndRemoveStringsFromHash();
    }
  }

}
