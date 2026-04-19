public class ChainingHashMap {

    /**
     * Construct a ChainingHashMap.
     *
     * @param arraySize: The initial capacity of the array.
     * @param maxBucketSize: The maximum size of a bucket before resizing
     */
    public ChainingHashMap(int arraySize, int maxBucketSize) {
        // FIXME
    }

    /**
     * Return the number of elements in the map.
     *
     * @return The number of elements in the map.
     */
    public int size() {
        return 0; // FIXME
    }

    /**
     * Add a key-value pair to the map.
     *
     * If the key already exists in the map, the value is replaced.
     *
     * @param key The key.
     * @param value The value.
     */
    public void put(int key, String value) {
        // FIXME
    }

    /**
     * Check if a key is already in the map.
     *
     * @param key The key.
     * @return true if the key is in the map, false otherwise.
     */
    public boolean containsKey(int key) {
        return false;
    }

    /**
     * Get the value associated with a key.
     *
     * If the key is not in the map, return null.
     *
     * @param key The key.
     * @return The value associated with the key, or null.
     */
    public String get(int key) {
        return null;
    }

    /**
     * Remove the key from the map.
     *
     * Nothing happens if the key is not in the map.
     *
     * @param key The key.
     */
    public void remove(int key) {
        // FIXME
    }

    /**
     * Print out the structure of the map.
     *
     * This method is used for testing. This method should return a multi-line
     * String, where each line lists the index of the array, the number of
     * elements at that index, and the keys and values at that index. For
     * example, if a HashMap is created with initial capacity of 5, and we
     * put(0, "nil"), then put(5, "zilch"), then put(3, "drei"), this function
     * should return the String:
     *
     * 0 (2): 5->zilch, 0->nil,
     * 1 (0):
     * 2 (0):
     * 3 (1): 3->drei,
     * 4 (0):
     *
     * Breaking down each line:
     *
     * * The first number is the index of the array.
     * * The second number is the number of elements at that index.
     * * After the colon, each key-value pair in the chain is listed, using an
     *   arrow ("->") to separate the key and value, and a comma (",") to
     *   separate the pairs. Note that there is an ending comma after the last
     *   key-value pair.
     *
     * @return A String as described above.
     */
    public String showStructure() {
        return ""; // FIXME
    }

}
