public class HashNode {

    public int key;
    public String value;
    public HashNode prev;
    public HashNode next;

    public HashNode(int key) {
        this.initialize(key, null);
    }

    public HashNode(int key, String value) {
        this.initialize(key, value);
    }

    private void initialize(int key, String value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }

}
