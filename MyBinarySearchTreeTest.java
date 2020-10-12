package com.capgemini.assignment.binarysearchtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyBinarySearchTreeTest {
	@Test
	public void createBinaryTreeAddIntegersTest() {
		MyBinarySearchTree<Integer> myBinarySearchTree=new MyBinarySearchTree<Integer>();
		myBinarySearchTree.add(56);
		myBinarySearchTree.add(30);
		myBinarySearchTree.add(70);
		int size=myBinarySearchTree.getSize();
		assertEquals(3, size);
	}
}
