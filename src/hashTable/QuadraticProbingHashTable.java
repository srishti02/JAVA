package hashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @description A generic class implementing HashTable interface and Separate
 *              Probing technique of hashing.
 */
public class QuadraticProbingHashTable<Type> implements HashTable<Type> {

  private Type[] _table;
  private Set<Type> _insertedItemsSet = new HashSet<Type>();
  private int _tableSize;
  private int _multiplier = 33;
  private Type _deactivationValue;

  QuadraticProbingHashTable(Type deactivationValue) {

    this(HelperMethods.DEFAULT_TABLE_SIZE, deactivationValue);
  }

  QuadraticProbingHashTable( int elementCount, Type deactivationValue) {

    _tableSize = HelperMethods.getNextPrime(2 * elementCount);
    _table = (Type[]) new Object[_tableSize]; 
    _deactivationValue = deactivationValue;
  }

  @Override
	public boolean insert(Type entry) {

    /** element already inserted */
    if(!_insertedItemsSet.add(entry))
      return false;

    /** get hash code and then compress it*/
    int genHash = HelperMethods.calculateHashCode(entry, _multiplier);
    int hashId = getCompressedHash(genHash);
    int probe = 1;

    int counter = 0;

    /** loop until a pos with null or deactivation value is found*/
    while ( _table[hashId] != null && 
        !_table[hashId].equals(_deactivationValue)) {

      /** counter to check for long cycle*/
      counter++;

      /** recalculate compressed hash after quadratic probing*/
      hashId = getCompressedHash((int)(hashId + Math.pow(probe,2)));
      ++probe;

      /** check for long cycle*/
      if( ++counter >= _tableSize/2 ) {
        //System.out.println("Rehash Needed");
        rehash();
        //System.out.println("Rehash Complete");
        hashId = getCompressedHash(genHash);
        counter = 0;
      }
    }

    _table[hashId] = entry;
    //System.out.println("Element " + entry + " inserted at : " + hashId + " after cycles : " + counter);
		return true;
	}

	@Override
	public boolean delete(Type entry) {

    /** get hash code and then compress it*/
    int genHash = HelperMethods.calculateHashCode(entry, _multiplier);
    int hashId = getCompressedHash(genHash);
    int probe = 1;

    while ( _table[hashId] != null ) {

      if( _table[hashId].equals(entry)) {
       
        _table[hashId] = _deactivationValue;
        //System.out.println("Element " + entry + " deleted from : " + hashId);
        return true;
      }

      hashId = getCompressedHash((int)(hashId + Math.pow(probe,2)));
      ++probe;
    }

		return false;
	}

	@Override
  public boolean find(Type entry) {

    int genHash = HelperMethods.calculateHashCode(entry, _multiplier);
    int hashId = getCompressedHash(genHash);
    int probe = 1;

    while ( _table[hashId] != null ) {

      if( _table[hashId].equals(entry)) {
        //System.out.println("Element " + entry + " Found at : " + hashId);
        return true;
      }

      hashId = getCompressedHash((int)(hashId + Math.pow(probe,2)));
      ++probe;
    } 

    return false;
  }

  @Override
  public void rehash() {
    
    //System.out.println("Starting rehash!");

    if ( _tableSize >= HelperMethods.getNextPrime(_insertedItemsSet.size()) ) {

      /** get a different multipler for hash code calculation */
      _multiplier = HelperMethods.getNextPrime(_multiplier > 39 ? 30 : _multiplier);
      //System.out.println("Cuckoo updated Multiplier : " + _multiplier);
    }
    else {

      /** expand table */
      _tableSize = HelperMethods.getNextPrime(_insertedItemsSet.size());
      //System.out.println("Cuckoo updated table size : " + _tableSize);
    }

    /** Re-initialise table */
    _table = (Type[]) new Object[_tableSize];

    /** Create copy of set containing all elements inserted uptil now*/
    Set<Type> insertedItemsSetCopy = _insertedItemsSet;

    /** This set cannot be used directly for re-insertion as insertion logic
     * uses this set to eliminate duplicates */
    _insertedItemsSet.clear();

    /** insert all elements to table again*/
    for( Type entry : insertedItemsSetCopy ) {

      insert( entry );
    }
    //System.out.println("Rehash successful!");
  }

  /**
   * @brief Compress the generated hash to limit [0,tableSize-1]
   *
   * @param hashcode to compress
   * @param tableid to decide hash method to be applied
   *
   * @return compressed hash id
   */
  private int getCompressedHash(int genHash) {

    int hashId = genHash % _tableSize;
    if( hashId < 0 )
      return hashId + _tableSize;
    return hashId;
  }
}
