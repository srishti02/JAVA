package trees;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @description This class runs the test cases for Lab-Assignment-1 Ques 4 and 5.
 */
public class RunTestCases {

  public static BinarySearchTree<Integer> bst;
  public static AVLTree<Integer> avlTree;
  public static RedBlackBST<Integer,Integer> redBlackBst;
  public static SplayTree<Integer> splayTree;

  public static long totalTime = 0;

  /**
   * @brief Solution to COMP-8547 Assignment-1 Q4
   *
   * @param inputSize is the no. of elements to be inserted in tree 
   */
  public static void runQuestion4TestCases(int inputSize) {

    bst = new BinarySearchTree<Integer>();
    avlTree = new AVLTree<Integer>();
    redBlackBst = new RedBlackBST<Integer,Integer>();
    splayTree = new SplayTree<Integer>();
 
    System.out.println();
    System.out.println("*****Question 4.a Results for input size: " 
        + inputSize+ "*****");


    //------------------------------Q4a - BST----------------------------------
    totalTime = 0;
    /** For each integer in range 1 to inputSize, insert it in BST*/
    IntStream.rangeClosed(1,inputSize).forEach(RunTestCases::insertInBst);

    System.out.println("Average time to insert in BST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4a - AVL----------------------------------
    totalTime = 0;
    /** For each integer in range 1 to inputSize, insert it in AVL*/
    IntStream.rangeClosed(1,inputSize).forEach(RunTestCases::insertInAvl);

    System.out.println("Average time to insert in AVL: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4a - RedBlackBST----------------------------------
    totalTime = 0;
    /** For each integer in range 1 to inputSize, insert it in Red Black BST*/
    IntStream.rangeClosed(1,inputSize).forEach(RunTestCases::insertInRedBlackBst);

    System.out.println("Average time to insert in RedBlackBST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4a - Splay Tree----------------------------------
    totalTime = 0;
    /** For each integer in range 1 to inputSize, insert it in Splay tree*/
    IntStream.rangeClosed(1,inputSize).forEach(RunTestCases::insertInSplayTree);

    System.out.println("Average time to insert in Splay Tree: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );


    System.out.println();
    System.out.println("*****Question 4.b Results for input size: " 
        + inputSize+ "*****");

    //------------------------------Q4b - BST----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInBst);

    System.out.println("Average time to search in BST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4b - AVL----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in AVL*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInAvl);

    System.out.println("Average time to search in AVL: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4b - RedBlackBST----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in Red black BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInRedBlackBst);

    System.out.println("Average time to search in RedBlackBST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4b - Splay Tree----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in Splay tree*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInSplayTree);

    System.out.println("Average time to search in Splay Tree: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );



    System.out.println();
    System.out.println("*****Question 4.c Results for input size: " 
        + inputSize+ "*****");
    
    //------------------------------Q4c - BST----------------------------------
    totalTime = 0;
    /** Iterate over reversed IntStream of sequence of integers i.e., from 
     * 1,00,000 to 1, and remove elements from BST*/
    IntStream.rangeClosed(1,inputSize)
      .boxed()
      .sorted(Collections.reverseOrder())
      .forEach(RunTestCases::removeFromBst);

    System.out.println("Average time to remove from BST: " + String.format( 
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4c - AVL----------------------------------
    totalTime = 0;
    /** Iterate over reversed IntStream of sequence of integers i.e., from 
     * 1,00,000 to 1, and remove elements from AVL*/
    IntStream.rangeClosed(1,inputSize)
      .boxed()
      .sorted(Collections.reverseOrder())
      .forEach(RunTestCases::removeFromAvl);

    System.out.println("Average time to remove from AVL: " + String.format( 
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4c - RedBlackBST----------------------------------
    totalTime = 0;
    /** Iterate over reversed IntStream of sequence of integers i.e., from 
     * 1,00,000 to 1, and remove elements from Red Black BST*/
    IntStream.rangeClosed(1,inputSize)
      .boxed()
      .sorted(Collections.reverseOrder())
      .forEach(RunTestCases::removeFromRedBlackBst);

    System.out.println("Average time to remove from RedBlackBST: " + String.format( 
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q4c - Splay Tree----------------------------------
    totalTime = 0;
    /** Iterate over reversed IntStream of sequence of integers i.e., from 
     * 1,00,000 to 1, and remove elements from Splay tree*/
    IntStream.rangeClosed(1,inputSize)
      .boxed()
      .sorted(Collections.reverseOrder())
      .forEach(RunTestCases::removeFromSplayTree);

    System.out.println("Average time to remove from Splay Tree: " + String.format( 
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );
  }

  public static void runQuestion5TestCases(int inputSize) {

    bst = new BinarySearchTree<Integer>();
    avlTree = new AVLTree<Integer>();
    redBlackBst = new RedBlackBST<Integer,Integer>();
    splayTree = new SplayTree<Integer>();
  
    System.out.println();
    System.out.println("*****Question 5.a Results for input size: " 
        + inputSize+ "*****");

    
    //------------------------------Q5a - BST----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform insert operation in BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::insertInBst);

    System.out.println("Average time to insert in BST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5a - AVL----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform insert operation in AVL*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::insertInAvl);

    System.out.println("Average time to insert in AVL: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5a - RedBlackBST---------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform insert operation in Red black BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::insertInRedBlackBst);

    System.out.println("Average time to insert in RedBlackBST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5a - Splay---------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform insert operation in Splay tree*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::insertInSplayTree);

    System.out.println("Average time to insert in Splay Tree: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );



    System.out.println();
    System.out.println("*****Question 5.b Results for input size: " 
        + inputSize+ "*****");

    //------------------------------Q5b - BST----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInBst);

    System.out.println("Average time to search in BST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5b - AVL----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in AVL*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInAvl);

    System.out.println("Average time to search in AVL: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5b - RedBlackBST----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in Red Black BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInRedBlackBst);

    System.out.println("Average time to search in RedBlackBST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5b - Splay Tree----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform search operation in Splay tree*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::findInSplayTree);

    System.out.println("Average time to search in Splay Tree: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );



    System.out.println();
    System.out.println("*****Question 5.c Results for input size: " 
        + inputSize+ "*****");

    //------------------------------Q5c - BST----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform remove operation in BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::removeFromBst);

    System.out.println("Average time to remove from BST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5c - AVL----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform remove operation in AVL*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::removeFromAvl);

    System.out.println("Average time to remove from AVL: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5c - RedBlackBST----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform remove operation in Red Black BST*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::removeFromRedBlackBst);

    System.out.println("Average time to remove from RedBlackBST: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );

    //------------------------------Q5c - Splay Tree----------------------------------
    totalTime = 0;
    /** For each integer in IntStream of random integers generated in the range
     * 1 to inputSize+1, perform remove operation in Splay tree*/
    new Random().ints(inputSize,1,inputSize + 1).forEach(RunTestCases::removeFromSplayTree);

    System.out.println("Average time to remove from Splay Tree: " + String.format(
          "%12.9f", ( totalTime/ inputSize ) / (double) 1000000000 ) );
  }

  //----------------------------------------------------------------------------
  //                           BST operations 
  //----------------------------------------------------------------------------

  public static void insertInBst(int value) {

    Instant start = Instant.now();
    bst.insert(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void findInBst(int value) {

    Instant start = Instant.now();
    bst.contains(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void removeFromBst(int value) {

    Instant start = Instant.now();
    bst.remove(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }
  //------------------------------------------------------------------------------

  //----------------------------------------------------------------------------
  //                           AVL operations 
  //----------------------------------------------------------------------------

  public static void insertInAvl(int value) {

    Instant start = Instant.now();
    avlTree.insert(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void findInAvl(int value) {

    Instant start = Instant.now();
    avlTree.contains(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void removeFromAvl(int value) {

    Instant start = Instant.now();
    avlTree.remove(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }
  //------------------------------------------------------------------------------

  //----------------------------------------------------------------------------
  //                           RB-Tree operations 
  //----------------------------------------------------------------------------

  public static void insertInRedBlackBst(int value) {

    Instant start = Instant.now();
    redBlackBst.put(value,value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void findInRedBlackBst(int value) {

    Instant start = Instant.now();
    redBlackBst.get(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void removeFromRedBlackBst(int value) {

    Instant start = Instant.now();
    redBlackBst.delete(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }
  //------------------------------------------------------------------------------

  //----------------------------------------------------------------------------
  //                           Splay tree operations 
  //----------------------------------------------------------------------------

  public static void insertInSplayTree(int value) {

    Instant start = Instant.now();
    splayTree.insert(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void findInSplayTree(int value) {

    Instant start = Instant.now();
    splayTree.contains(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }

  public static void removeFromSplayTree(int value) {

    Instant start = Instant.now();
    splayTree.remove(value);
    Instant end = Instant.now();
    totalTime += Duration.between(start,end).toNanos();
  }
  //------------------------------------------------------------------------------

  public static void main(String[] args) {

      runQuestion4TestCases(100000);
      runQuestion5TestCases(100000);
  }

}
