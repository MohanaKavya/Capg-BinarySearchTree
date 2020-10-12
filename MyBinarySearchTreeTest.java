package com.capgemini.assignment.binarysearchtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyBinarySearchTreeTest {
	@Test
	public void createBinaryTreeAddAllValuesTest() {
		MyBinarySearchTree<Integer> myBinarySearchTree=new MyBinarySearchTree<Integer>();
		myBinarySearchTree.add(56);
		myBinarySearchTree.add(30);
		myBinarySearchTree.add(70);
		int size=myBinarySearchTree.getSize();
		assertEquals(3, size);
		myBinarySearchTree.add(22);
		myBinarySearchTree.add(40);
		myBinarySearchTree.add(60);
		myBinarySearchTree.add(95);
		myBinarySearchTree.add(11);
		myBinarySearchTree.add(65);
		myBinarySearchTree.add(3);
		myBinarySearchTree.add(16);
		myBinarySearchTree.add(63);
		myBinarySearchTree.add(67);
		int fullSize=myBinarySearchTree.getSize();
		assertEquals(13, fullSize);
		int key = myBinarySearchTree.search(63);
		assertEquals(63, key);
	}
}
