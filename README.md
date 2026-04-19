# Project 3: Hash Tables

Initial due date: 2024-11-03 23:59 PT

This project asks you to implement a chaining-based `ChainingHashSet` and `ChainingHashMap`. The Set will store `int`s; the Map will store `int` keys and `String` values. Beyond a deeper understanding of how hashing-based data structures work, this project also aims to give you practice with understanding the similarities between the Set and Map ADTs.

The two data structures share similar methods that you must implement:

* The constructor, `ChainingHashSet()` and `ChainingHashMap()`.
* The `size()` method, which returns the size of the hash table.
* The `add()` (for Set) and `put()` (for Map) methods, which add elements to the hash table.
* The `contains()` (for Set) and `containsKey()` (for Map) methods, which check if an element/key is in the Set/Map.
* The `get()` method, which only exists for `ChainingHashMap`, which gets the value associated with a key in the Map.
* The `remove()` method, which removes an element/key from the Set/Map.
* The `showStructure()` method, which returns a String describing what is in the hash table. Details about the return value is in the comment documentation.

For resizing, both hash tables should be resized to 2 * length + 1, in lieu of resizing to the next prime number.

In addition to the stubs in `ChainingHashSet.java` and `ChainingHashMap.java`, a `HashNode.java` that represents a node in the chain is also provided for you for convenience. Note that `ChainingHashSet` does not require the use of all of the member variables of `HashNode`.

