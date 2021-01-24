package hashTable;

/**
 * @description An generic interface with basic methods of a hash-table 
 *              incorporated to ensure basic functionality is supported by each
 *              hashtable implementation.
 */
public interface HashTable<Type> {

  /**
   * @brief Insert an entry in a hashtable.
   *
   * @return false if entry already exists, else true
   */
	boolean insert( Type entry);

  /**
   * @brief Find and delete a key from hashtable if it exists else take no action.
   *
   * @return return true if entry was deleted else false
   */
	boolean delete(Type entry);

  /**
   * @brief Find an entry in hashtable.
   *
   * @return true if found, else false
   */
  boolean find(Type entry);

  /**
   * @brief Apply rehash logic as per the hashtable implementation.
   */
  void rehash();
}
