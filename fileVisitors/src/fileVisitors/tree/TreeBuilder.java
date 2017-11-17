package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;
import fileVisitors.visitor.VisitorI;

public class TreeBuilder {
	private Node head;
	private Results out;
	
	public TreeBuilder(FileProcessor fp, Results r) {
		head = null;
		out = r;
	}
	
	public void populate() {
		if (head == null) {
			head = new Node(word, out);
		} else {
			head.populate(word);
		}
	}
	
	public void palindrome() {
		if (head != null) {
			head.palindrome();
		}
	}
	
	public void primeLength() {
		
	}
	
	public void printTree() {
		
	}
	
	public void accept(VisitorI visitor) {
		this =  visitor.visit(this);
	}
}
