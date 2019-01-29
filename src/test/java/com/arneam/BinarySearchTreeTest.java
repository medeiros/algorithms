package com.arneam;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class BinarySearchTreeTest {

  @Test
  public void shouldInsertRootNode() {
    Node root = null;
    root = BinarySearchTree.insert(root, 3);
    assertThat(root.getData(), is(equalTo(3)));
  }

  @Test
  public void shouldInsertLeftRootNode() {
    Node root = null;
    root = BinarySearchTree.insert(root, 3);
    BinarySearchTree.insert(root, 2);

    assertThat(root.getLeft().getData(), is(equalTo(2)));
  }

  @Test
  public void shouldInsertLeftOfLeftOfRootNode() {
    Node root = null;
    root = BinarySearchTree.insert(root, 3);
    BinarySearchTree.insert(root, 2);
    BinarySearchTree.insert(root, 1);

    assertThat(root.getLeft().getLeft().getData(), is(equalTo(1)));
  }

  @Test
  public void shouldInsertRightRootNode() {
    Node root = null;
    root = BinarySearchTree.insert(root, 3);
    BinarySearchTree.insert(root, 5);

    assertThat(root.getRight().getData(), is(equalTo(5)));
  }

  @Test
  public void shouldInsertLeftOfRightOfRootNode() {
    Node root = null;
    root = BinarySearchTree.insert(root, 3);
    Node a = BinarySearchTree.insert(root, 5);
    Node b = BinarySearchTree.insert(root, 4);

    assertThat(root.getRight().getLeft().getData(), is(equalTo(4)));
  }

  @Test
  public void shouldFindElement() {
    Node root = null;
    root = BinarySearchTree.insert(root, 3);
    BinarySearchTree.insert(root, 5);
    BinarySearchTree.insert(root, 4);

    assertThat(BinarySearchTree.contains(root, 4), is(true));
    assertThat(BinarySearchTree.contains(root, 6), is(false));
  }

  @Test
  public void shouldCalculateHeightForZeroElement() {
    Node root = null;
    int height = BinarySearchTree.height(root);
    assertThat(height, is(equalTo(0)));
  }

  @Test
  public void shouldCalculateHeightForSomeElements() {
    Node root = null;
    root = BinarySearchTree.insert(root, 3);
    BinarySearchTree.insert(root, 2);
    BinarySearchTree.insert(root, 1);
    BinarySearchTree.insert(root, 5);
    BinarySearchTree.insert(root, 4);
    BinarySearchTree.insert(root, 6);
    BinarySearchTree.insert(root, 7);

    int height = BinarySearchTree.height(root);
    assertThat(height, is(equalTo(3)));
  }

}
