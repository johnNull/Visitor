package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;
import fileVisitors.visitor.VisitorI;

public class TreeBuilder {
	private Node head;
	private Results out;
	
	/**
	 * Constructor for TreeManager
	 * @param r Results instance for printing
	 */
	public TreeBuilder(Results r) {
		head = null;
		out = r;
	}
	
	/**
	 * Populate the tree with a Node
	 * @param word String for which to create Node or add count to
	 */
	public void populate(String word) {
		if (head == null) {
			head = new Node(word, out);
		} else {
			head.populate(word);
		}
	}
	
	/**
	 * Call the Node palindrome method to capitalize palindromes
	 */
	public void palindrome() {
		if (head != null) {
			head.palindrome();
		}
	}
	
	/**
	 * Call the recursive primeLength method to mark prime length strings.
	 */
	public void primeLength() {
		primeLength(head);
	}
	
	/**
	 * Append "-PRIME" to all Strings of prime length
	 * @param n Node used to check and for recursive traversal
	 */
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
	
	/**
	 * Calls the recursive printTree to print the tree alphanumerically
	 */
	public void printTree() {
		printTree(head);
	}

	/**
	 * Appends alphanumerically to Results instance
	 * @param n Node to get string from and use for recursive traversal
	 */
	public void printTree(Node n){
		if(n == null)
			return;
		printTree(n.left);
		out.append(n.word + "\n");
		printTree(n.right);
	}
	
	/**
	 * Allow Visitors to alter this structure
	 * @param visitor Visitor to alter tree elements 
	 */
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
}
