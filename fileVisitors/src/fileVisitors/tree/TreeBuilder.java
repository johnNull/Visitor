package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;
import fileVisitors.visitor.VisitorI;

public class TreeBuilder {
	private Node head;
	private Results out;
	
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
	
	public void palindrome() {
		if (head != null) {
			head.palindrome();
		}
	}
	
	public void primeLength() {
		
	}
	
	public void printTree() {
		printTree(head);
	}

	public void printTree(Node n){
		if(n == null)
			return;
		printTree(n.left);
		System.out.println(n.word + " ");
		printTree(n.right);
	}
	
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
}
