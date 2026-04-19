public class ChainingHashSet {

    /**
     * Construct a ChainingHashSet.
     *
     * @param arraySize: The initial capacity of the array.
     * @param maxBucketSize: The maximum size of a bucket before resizing
     */
    public ChainingHashSet(int arraySize, int maxBucketSize) {
        // FIXME
    }

    /**
     * Return the number of elements in the set.
     *
     * @return The number of elements in the set.
     */
    public int size() {
        return 0; // FIXME
    }

    /**
     * Add an element to the set.
     *
     * Nothing happens if the element already exists in the set.
     *
     * @param element The element.
     */
    public void add(int element) {
        // FIXME
    }

    /**
     * Check if an element is already in the set.
     *
     * @param element The element.
     * @return true if the element is in the set, false otherwise.
     */
    public boolean contains(int element) {
        return false;
    }

    /**
     * Remove the element from the set.
     *
     * Nothing happens if the element is not in the set.
     *
     * @param element The element.
     */
    public void remove(int element) {
        // FIXME
    }

    /**
     * Print out the structure of the set.
     *
     * This method is used for testing. This method should return a multi-line
     * String, where each line lists the index of the array, the number of
     * elements at that index, and the elements at that index. For example,
     * if a HashSet is created with initial capacity of 5, and we add(0), then
     * add(5), then add(3), this function should return the String:
     *
     * 0 (2): 5, 0,
     * 1 (0):
     * 2 (0):
     * 3 (1): 3,
     * 4 (0):
     *
     * Breaking down each line:
     *
     * * The first number is the index of the array.
     * * The second number is the number of elements at that index.
     * * After the colon, each element in the chain is listed, using a comma
     *   (",") to separate the elements. Note that there is an ending comma
     *   after the last element.
     *
     * @return A String as described above.
     */
    public String showStructure() {
        return ""; // FIXME
    }

}
