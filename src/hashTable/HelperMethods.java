package hashTable;

import java.util.Vector;
import java.util.Random;

public class HelperMethods {

  public static final int DEFAULT_TABLE_SIZE = 100;

  public static Vector<String> generateRandomString(int count) {

    int stringLen = 10;
    Vector<String> randomGenStrVec = new Vector<String>();
    for(int i = 0; i < count; ++i) {

      randomGenStrVec.add(new Random().ints(97, 123)
          .limit(stringLen)
          .collect(StringBuilder::new, 
            StringBuilder::appendCodePoint, 
            StringBuilder::append)
          .toString());
    }
    return randomGenStrVec;
  }

  /**
   * @brief Calculate a hashcode for the entry.
   *
   * @return calculated hash code
   */
  public static <Type> int calculateHashCode(Type entry, int multiplier) {

    if( entry instanceof String )
      return HelperMethods.getStringHashCode((String) entry, multiplier);
    else
      return entry.hashCode();
  }

  /**
   * @brief Calculate hash-code for a string passed as argument
   *        using polynomial evaluation technique.
   *
   * @return Hash-code for a string
   */
  public static int getStringHashCode(String entry, int multiplier){

    int hashCode = 0;
    for( int i = 0; i < entry.length() ; ++i)
    {
      hashCode = multiplier * hashCode + entry.charAt(i);
    }
    return hashCode;
  }
  
  public static int getNextPrime(int num) {

    while(!isPrime(++num)) {
    }

    return num;
  }

  public static boolean isPrime(int num) {

    if( num == 0 || num == 1 )
      return false;

    if( num % 2 == 0 )
      return false;

    for( int i = 3; i * i < num; i += 2) {

      if( num % i == 0 )
        return false;
    }
    return true;
  }
}
