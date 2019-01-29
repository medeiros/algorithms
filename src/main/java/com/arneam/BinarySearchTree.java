package com.arneam;

public class BinarySearchTree {

  public static Node insert(Node node, int data) {
    if (node == null)
      return new Node(data);

    if (data < node.getData()) {
      node.setLeft(insert(node.getLeft(), data));
      return node;
    } else {
      node.setRight(insert(node.getRight(), data));
      return node;
    }
  }

  public static boolean contains(Node node, int data) {
    if (node == null)
      return false;

    if (node.getData() == data)
      return true;

    return data < node.getData() ? contains(node.getLeft(), data) : contains(node.getRight(), data);
  }

  static int height(final Node root) {
    if (root == null)
      return 0;
    return recursiveHeight(root) - 1;
  }

  private static int recursiveHeight(final Node root) {
    if (root == null)
      return 0;
    return Math.max(recursiveHeight(root.getLeft()), recursiveHeight(root.getRight())) + 1;
  }

}
