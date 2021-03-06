package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Node {
	private String word;
	private Results out;
	private Node left;
	private Node right;
	
	/**
	 * Constructor for Node in BST
	 * @param s String to be stored in Node
	 * @param r Results instance to append to
	 */
	public Node(String s, Results r) {
		word = s;
		out = r;
		out.writeToScreen("Creating Node", MyLogger.DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * Return the word stored in the node
	 * @return String stored in node
	 */
	public String getWord() {
		return word;
	}
	
	/**
	 * Set the word stored in the node
	 * @param str String to be stored in the node
	 */
	public void setWord(String str) {
		word = str;
	}
	
	/**
	 * Return the left child of the node
	 * @return The left child of the node
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * Return the right child of the node
	 * @return The right child of the node
	 */	
	public Node getRight() {
		return right;
	}
	
	/**
	 * Populate Tree with new Nodes
	 * @param w String to compare and create new Node or add word count
	 */
	public void populate(String s) {
		int comparison = s.compareTo(word);
		if (comparison < 0) {
			if (left == null) {
				left = new Node(s, out);
			} else {
				left.populate(s);
			}
		} else if (comparison > 0) {
			if (right == null) {
				right = new Node(s, out);
			} else {
				right.populate(s);
			}
		}
	}
}
