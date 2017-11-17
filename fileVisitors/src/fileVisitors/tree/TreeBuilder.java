package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class TreeBuilder {
	Node head;
	Results out;
	
	public TreeBuilder(Results r) {
		head = null;
		out = r;
	}
	
	public void populate(String word) {
		if (head == null) {
			head = new Node(word, out);
		} else {
			head.populate(word);
		}
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}