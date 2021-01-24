package hashTable;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @description A generic class implementing HashTable interface and Separate
 *              Chaining technique of hashing.
 *              In this, chain of elements are stored for each table index.
 */
public class SeparateChainingHashTable<Type> implements HashTable<Type> {

  private List<Type>[] _table;
  private Set<Type> _insertedItemsSet = new HashSet<Type>();
  private int _tableSize;
  private int _multiplier = 33;
	
  SeparateChainingHashTable() {

    this(HelperMethods.DEFAULT_TABLE_SIZE);
  }
  
  SeparateChainingHashTable(int elementCount) {

    _tableSize = HelperMethods.DEFAULT_TABLE_SIZE; // default size
    _table = new LinkedList[_tableSize];
    for( int i = 0; i < _tableSize; ++i)
      _table[i] = new LinkedList<>(); 
    //System.out.println("Separate Chaining table size : " + _tableSize);
  }

  @Override
	public boolean insert(Type entry) {
    
    /** element already inserted */
    if(!_insertedItemsSet.add(entry))
      return false;

    /** get hash code and then compress it*/
    int genHash = HelperMethods.calculateHashCode(entry, _multiplier);
    int hashId = getCompressedHash(genHash);

    /** insert element*/
    _table[hashId].add(entry);

    if( _insertedItemsSet.size() > _tableSize * 8 )
      rehash();

    return true;
	}

	@Override
	public boolean delete(Type entry) {

    /** calculate hash code */
    int genHash = HelperMethods.calculateHashCode(entry, _multiplier);
    int hashId = getCompressedHash(genHash);

    /** check and delete if available in table */
    return _table[hashId].remove(entry);
	}

	@Override
	public boolean find(Type entry) {
    
    /** calculate hash code */
    int genHash = HelperMethods.calculateHashCode(entry, _multiplier);
    int hashId = getCompressedHash(genHash);

    /** check if available in table */
    return _table[hashId].contains(entry);
	}

	@Override
	public void rehash() {
	
    //System.out.println("Starting rehash!");
      
    /** expand table */
    _tableSize *= 2; 
    
    /** Re-initialise tables */
    _table = new LinkedList[_tableSize];
    for( int i = 0; i < _tableSize; ++i)
      _table[i] = new LinkedList<>(); 
	
    /** Create copy of set containing all elements inserted uptil now*/
    Set<Type> insertedItemsSetCopy = _insertedItemsSet;

    /** This set cannot be used directly for re-insertion as insertion logic
     * uses this set to eliminate duplicates */
    _insertedItemsSet.clear();

    /** insert all elements to tables again*/
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
