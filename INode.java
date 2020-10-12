package com.capgemini.assignment.binarysearchtree;


public interface INode<T extends Comparable<T>> {
	void setLeft(INode<T> left);
	void setRight(INode<T> right);
	INode<T> getLeft();
	INode<T> getRight();	
	T getKey();
	void setKey(T key);
}
