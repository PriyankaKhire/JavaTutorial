public class LearningLinkedList {
    private static Node createNode(String value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        return node;
    }
    public static void main(String[] args) {
        // Create 5 node linked list
        Node prev = null;
        for (int i = 0; i < 5; i++) {
            Node currNode = createNode("val"+i);
            currNode.next = prev;
            prev = currNode;
        }

        // Display the contents of linked list
        Node ptr = prev;
        while(ptr != null) {
            System.out.print(ptr.value+" -> ");
            ptr = ptr.next;
        }

        // Internal linked list class
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();
        linkedList.add("Val1");
        linkedList.add("Val2");
        System.out.println("\nThe internal linked list");
        System.out.println(linkedList);

    }

}
class Node {
    public String value;
    public Node next;
}
