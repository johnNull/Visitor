package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Node {
	String word;
	Results out;
	Node left;
	Node right;
	
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
}