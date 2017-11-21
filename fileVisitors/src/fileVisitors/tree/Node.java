package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Node {
	String word;
	Results out;
	Node left;
	Node right;
	
	/**
	 * Constructor for Node in BST
	 * @param s String to be stored in Node
	 * @param r Results instance to append to
	 */
	public Node(String s, Results r) {
		word = s;
		out = r;
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
	
	/**
	 * Makes all stored Strings that are palindromes all uppercase
	 */
	public void palindrome() {
		if (word.length() > 3) {
			boolean pal = true;
			for (int i = 0; i <= word.length() / 2; i++) {
				if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(word.length() - 1 - i))) {
					pal = false;
					break;
				}
			}	
			if (pal) {
				word = word.toUpperCase();
			}
			if (left != null) {
				left.palindrome();
			}
			if (right != null) {
				right.palindrome();
			}
		}
		if (left != null) {
			left.palindrome();
		}
		if (right != null) {
			right.palindrome();
		}
	}
	
}
