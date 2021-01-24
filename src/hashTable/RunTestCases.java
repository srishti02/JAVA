package hashTable;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.Vector;

public class RunTestCases {

  public static HashTable<String> hashObj;
  public static Scanner obj = new Scanner(System.in);
  public static Vector<String> randomGenStrVec;

  public static void insertStringsToHash() {

    long totalTime = 0;
    for( String str : randomGenStrVec) {

      Instant start = Instant.now();
      hashObj.insert(str);
      Instant end = Instant.now();
      totalTime += Duration.between(start,end).toNanos();
    }
    
    System.out.println("Average time to insert : " + String.format( "%12.9f", 
          ( totalTime/ randomGenStrVec.size() ) / (double) 1000000000 ) );
  }

  public static void findAndRemoveStringsFromHash() {

    long totalTime = 0;
    for( String str : randomGenStrVec) {

      Instant start = Instant.now();
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
    System.out.println("Enter number of strings for random generation : ");
    int elementCount = obj.nextInt();

    hashObj = new QuadraticProbingHashTable<>(elementCount,"A");
  
    randomGenStrVec = HelperMethods.generateRandomString(elementCount);
    
    insertStringsToHash();

    // Question 2
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
      randomGenStrVec = HelperMethods.generateRandomString(elementCount);
    }    
    
    findAndRemoveStringsFromHash();

    // Question 3
    for(int i = 1; i <= 20; ++i)
    {
      System.out.println();
      System.out.println(
          "----------Processing for " + Math.pow(2,i) + " elements---------");
      randomGenStrVec.clear();
      randomGenStrVec = HelperMethods.generateRandomString(
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
