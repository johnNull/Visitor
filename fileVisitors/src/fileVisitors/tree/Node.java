package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Node {
	private String word;
	private Results out;
	private Node left;
	private Node right;
	
	public Node(String s, Results r) {
		word = s;
		out = r;
	}
	
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
	
	public void palindrome() {
		
	}
	
	public void primeLength() {
		
	}
	
	public String toString() {
		String out = "";
		if (left != null) {
			out = left.toString() + "\n";
		}
		out = out + word + "\n";
		if (right != null) {
			out = out + right.toString() + "\n";
		}
		return out;
	}
}