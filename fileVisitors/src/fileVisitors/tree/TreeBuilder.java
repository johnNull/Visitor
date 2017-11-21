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
		primeLength(head);
	}
	
	public void primeLength(Node n) {
		if(n == null)
			return;
		boolean flag = true;
		double num = n.word.length();
		primeLength(n.left);
		if(num == 2)
			n.word += "-PRIME";
		if(num % 2 == 0)
			flag = false;
		for(int i = 3; i * i <= num; i += 2)
			if(num % i == 0)
				flag = false;
		if(flag)
				n.word += "-PRIME";
		primeLength(n.right);
	}
	
	public void printTree() {
		printTree(head);
	}

	public void printTree(Node n){
		if(n == null)
			return;
		printTree(n.left);
		out.append(n.word + "\n");
		printTree(n.right);
	}
	
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
}
