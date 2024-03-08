// Inorder, post order, pre order traversal
import java.io.*;
import java.util.*;

class Solution {
  public static Node createNode(int val) {
    Node node = new Node();
    node.val = val;
    node.left = null;
    node.right = null;
    return node;
  }

  public static void inOrder(Node node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.println(node.val);
    inOrder(node.right);
  }

  public static void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.println(node.val);
    preOrder(node.left);
    preOrder(node.right);
  }

  public static void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.val);
  }

  public static void main(String[] args) {
    Node head = createNode(0);
    head.left = createNode(1);
    head.right = createNode(2);
    head.left.left = createNode(3);
    head.left.right = createNode(4);
    System.out.println("Inorder traversal");
    inOrder(head);
    System.out.println("Pre-Order traversal");
    preOrder(head);
    System.out.println("Post-Order traversal");
    postOrder(head);
  }
}
class Node {
  int val;
  Node left;
  Node right;
}
