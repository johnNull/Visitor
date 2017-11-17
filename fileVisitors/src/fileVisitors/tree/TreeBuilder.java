package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;
import fileVisitors.visitor.VisitorI;

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
	
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
}
