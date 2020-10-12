package com.capgemini.assignment.binarysearchtree;

public class MyBinaryTreeNode<T extends Comparable<T>> implements INode<T> {
	private T key;
	private INode left, right;
	public MyBinaryTreeNode(T key) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
	@Override
	public void setLeft(INode left) {
		this.left = left;
	}
	@Override
	public void setRight(INode right) {
		this.right = right;
	}
	@Override
	public INode getLeft() {
		return this.left;
	}
	@Override
	public INode getRight() {
		return this.right;
	}
	@Override
	public T getKey() {
		return this.key;
	}
	@Override
	public void setKey(T key) {
		this.key = key;
	}

}
