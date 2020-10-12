package com.capgemini.assignment.binarysearchtree;

public class MyBinarySearchTree<T extends Comparable<T>> {
	private INode root;
	public void add(T key) {
		this.root = addRecursively(root, key);
	}

	private INode addRecursively(INode current , T key) {
		if(current==null)
		return new MyBinaryTreeNode(key);
		int compare = current.getKey().compareTo(key);
		if(compare==0)
			return current;
		else if(compare==1)
			current.setLeft(addRecursively(current.getLeft(), key));
		else
			current.setRight(addRecursively(current.getRight(), key));
		return current;
	}

	public int getSize() {
		return getSizeRecursively(root);
		
	}

	private int getSizeRecursively(INode current) {
		return current == null ? 0 : 1 +  getSizeRecursively(current.getLeft())
									   + getSizeRecursively(current.getRight());
	}

	public T search(T search) {
		return searchRecursively(root, search);
	}

	private T searchRecursively(INode current, T search) {
		if(current==null)
		return null;
		int compare = current.getKey().compareTo(search);
		if(compare==0)
			return (T) current.getKey();
		else if(compare==1)
			return searchRecursively(current.getLeft(), search);
		else
			return searchRecursively(current.getRight(), search);		
	}

}






