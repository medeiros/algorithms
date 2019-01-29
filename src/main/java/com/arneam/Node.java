package com.arneam;

public class Node {

  private Node left;
  private Node right;
  private int data;

  public Node(final int data) {
    this.data = data;
  }

  Node getLeft() {
    return left;
  }

  void setLeft(final Node left) {
    this.left = left;
  }

  Node getRight() {
    return right;
  }

  void setRight(final Node right) {
    this.right = right;
  }

  int getData() {
    return data;
  }

  @Override
  public boolean equals(final Object o) {
    return super.equals(o);
  }

}
