package hashTable;
import java.util.HashSet;
import java.util.Set;

/**
 * @description A generic class implementing HashTable interface and Cuckoo
 *              technique of hashing.
 *              In this, if an element is already present at the hash index, it
 *              is evicted and replaced by the new element. Then a new location
 *              is calculated for the evicted element.
 */
public class CuckooHashTable<Type> implements HashTable<Type> {

  private Type [][]_table;
  private Set<Type> _insertedItemsSet = new HashSet<Type>();
  private int _tableSize = 0;
  private int _multiplier = 33;

  CuckooHashTable() {

    this(HelperMethods.DEFAULT_TABLE_SIZE);
  }

  CuckooHashTable(int arraySize){

    _tableSize = HelperMethods.getNextPrime(arraySize);
    _table = (Type[][]) new Object[2][_tableSize];

    //System.out.println("Cuckoo table size : " + _tableSize);
  }

  @Override
  public boolean insert(Type entry) {

    /** element already inserted */
    if(!_insertedItemsSet.add(entry))
      return false;

    //System.out.println("Element to insert : " + entry);

    /** get hash code and then compress it*/
    int hashCode = Math.abs(HelperMethods.calculateHashCode(entry,_multiplier));

    int hash1 = getCompressedHash(hashCode,0);
    int hash2 = getCompressedHash(hashCode,1);

    /** Note : since set is taking care of duplicate insertions, this check is
      not required. */
    ///** if key already exists return*/
    //if( _table[0][hash1] != null && _table[0][hash1].equals((String)entry) || 
    //    _table[1][hash2] != null && _table[1][hash2].equals((String)entry))
    //  return false;

    /** Insert if position available */
    if( _table[0][hash1] == null ) {
      _table[0][hash1] = entry;
      //System.out.println("Inserted " + entry + " at " + 0 + " " + hash1);
      return true;
    }

    /** Position not available ! 
     * Evict the previous entry and store new one*/
    Type temp = _table[0][hash1];
    _table[0][hash1] = entry;
    //System.out.println("Inserted " + entry + " at " + 0 + " " + hash1);

    /** Find place for evicted entry*/
    handleCollision(temp, 1);
    return true;
  }

  @Override
  public boolean delete(Type entry) {

    /** calculate hash code */
    int hashCode = HelperMethods.calculateHashCode(entry,_multiplier);

    /** check and delete if available in table 1*/
    int hash1 = getCompressedHash(Math.abs(hashCode),0);
    if( _table[0][hash1] != null && _table[0][hash1].equals(entry)) { 
      //System.out.println("Element deleted from table:hashId : 0:" + hash1);
      _table[0][hash1] = null;
      return true;
    }

    /** check and delete if available in table 2*/
    int hash2 = getCompressedHash(Math.abs(hashCode),1);
    if( _table[1][hash2] != null && _table[1][hash2].equals(entry)) {
      //System.out.println("Element deleted from table:hashId : 1:" + hash2);
      _table[1][hash2] = null;
      return true;
    } 

    /** entry not found*/
    return false;
  }

  @Override
  public boolean find(Type entry) {

    /** calculate hash code */
    int hashCode = HelperMethods.calculateHashCode(entry,_multiplier);

    /** check if available in table 1*/
    int hash1 = getCompressedHash(Math.abs(hashCode),0);
    if( _table[0][hash1] != null && _table[0][hash1].equals(entry)) {
      System.out.println("Element found at table:hashId : 0:" + hash1);
      return true;
    }

    /** check if available in table 2*/
    int hash2 = getCompressedHash(Math.abs(hashCode),1);
    if( _table[1][hash2] != null && _table[1][hash2].equals(entry)) {
      System.out.println("Element found at table:hashId : 1:" + hash2);
      return true;
    }

    /** entry not found
     * @return */
    return false;
  }

  public int[] findAndReturn(Type entry) {

    int[] returnVal = new int[]{-1,-1};

    /** calculate hash code */
    int hashCode = HelperMethods.calculateHashCode(entry,_multiplier);

    /** check if available in table 1*/
    int hash1 = getCompressedHash(Math.abs(hashCode),0);
    if( _table[0][hash1] != null && _table[0][hash1].equals(entry)) {
      System.out.println("Element found at table:hashId : 0:" + hash1);
      returnVal[0] = 0;
      returnVal[1] = hash1;
      return returnVal;
    }

    /** check if available in table 2*/
    int hash2 = getCompressedHash(Math.abs(hashCode),1);
    if( _table[1][hash2] != null && _table[1][hash2].equals(entry)) {
      System.out.println("Element found at table:hashId : 1:" + hash2);
      returnVal[0] = 1;
      returnVal[1] = hash2;
      return returnVal;
    }

    /** entry not found*/
    return returnVal;
  }

  public void delete(int[] pos) {

    //System.out.println("Element deleted from table:hashId :" pos[0] + ":" + hash2);
    _table[pos[0]][pos[1]] = null;
  }

  /**
   * @brief Implements cuckoo hashing eviction logic to handle collision.
   *        This method can only be called via insert method in case of
   *        collision.
   *
   * @param evicted entry
   * @param table id in which evicted entry is required to be inserted.
   */
  private void handleCollision(Type entry, int tableId) {

    int collisionCounter = 0;
    while( true )
    {
      //System.out.println("Collision occured, evicting : " + entry);

      /** calculate hash for evicted entry*/
      int hash = getCompressedHash( Math.abs(
            HelperMethods.calculateHashCode(entry, _multiplier)), tableId );

      /** if the next table hop allows direct insertion, insert and return*/
      if( _table[tableId][hash] == null ) {
        _table[tableId][hash] = entry;
        //System.out.println("Inserted " + entry + " at " + tableId + " " + hash);
        return;
      }

      /** store previous entry in temp variable*/
      Type temp = _table[tableId][hash];

      /** evict previous entry*/
      _table[tableId][hash] = entry;
      entry = temp;

      /** toggle table-id between 0 and 1 */
      tableId = (tableId + 1)%2;

      //System.out.println("collisionCounter : " + collisionCounter + " tableSize :" + _tableSize);

      /** check for a long cycle*/
      if ( ++collisionCounter > _tableSize )
        rehash();
    }
  }

  /**
   * @brief Create a new table with expanded size and insert all the elements in
   *        old table to new one, following the same insertion method as before.
   */
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

    /** Re-initialise tables */
    _table = (Type[][]) new Object[2][_tableSize];

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
  private int getCompressedHash(int hashCode, int tableId){

    if( tableId == 0 )
      return hashCode % _tableSize;
    else
      return (hashCode / _tableSize) % _tableSize;
  }
}
