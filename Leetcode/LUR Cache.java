class Node {
    private int key;
    private int value;
    private Node next;
    private Node prev;

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
class DLL {
    private Node head;
    private Node tail;

    public DLL() {
        this.head = createNode(0, 0);
        this.tail = createNode(-99, -99);
        this.head.setNext(tail);
        this.tail.setPrev(head);
        //display();    
    }

    private Node createNode(int key, int value) {
        Node node = new Node();
        node.setKey(key);
        node.setValue(value);
        node.setNext(null);
        node.setPrev(null);
        return node;
    }

    public Node addFromTop(int key, int value) {
        // Create node
        Node node = createNode(key, value);
        // Add between head and head.next
        Node nextNode = this.head.getNext();
        this.head.setNext(node);
        node.setPrev(this.head);
        node.setNext(nextNode);
        nextNode.setPrev(node);
        //display();
        return node;
    }

    public void removeNode(Node node) {
        Node prevNode = node.getPrev();
        Node nextNode = node.getNext();
        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);
        node.setKey(-66);
        node.setValue(-66);
        //display();
    }

    public Node getLeastRecentlyUsedNode() {
        return this.tail.getPrev();
    }


    public void display() {
        System.out.println("Displaying DLL");
        Node ptr = this.head;
        while(ptr != null) {
            System.out.println(ptr.getKey()+" "+ptr.getValue());
            ptr = ptr.getNext();
        } 
        System.out.println("*****");
    }
}
class LRUCache {
    public DLL dll;
    public int capacity;
    public HashMap<Integer, Node> hashMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.dll = new DLL();
        hashMap = new HashMap<Integer, Node>();
    }
    
    public int get(int key) {
        // Get the key
        if (!this.hashMap.containsKey(key)) {
            return -1;
        }
        // Get the value of the key
        int value = this.hashMap.get(key).getValue();
        // Insert the key again to put it on top of access list.
        put(key, value);
        // Return the value
        return value;
    }

    private boolean atCapacity() {
        if (this.hashMap.size() == this.capacity) {
            return true;
        }
        return false;
    }

    private void removeKey(Node node) {
        // Remove it from hash map
        this.hashMap.remove(node.getKey());
        // Remove the node from DLL queue
        this.dll.removeNode(node);
    }

    private void addKey(int key, int value) {
        // Add to DLL queue
        Node node = this.dll.addFromTop(key, value);
        // Add to hash map
        this.hashMap.put(key, node);
    }
    
    public void put(int key, int value) {
        // If hash map has key then update it.
        if (this.hashMap.containsKey(key)) {
            Node node = this.hashMap.get(key);
            // Remove it
            removeKey(node);
        }
        // If hash map does not have key
        // If hash map is at capcaity
        if (atCapacity()) {
            // Remove least recently used node
            Node leastRecentlyUsedNode = this.dll.getLeastRecentlyUsedNode();
            removeKey(leastRecentlyUsedNode);
        }
        // Add to hash map
        addKey(key, value);
        // Displaying contents of hash map
        System.out.println(this.hashMap);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */