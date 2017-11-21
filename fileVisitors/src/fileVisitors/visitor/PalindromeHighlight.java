package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.tree.Node;
import fileVisitors.tree.Palindrome;
import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class PalindromeHighlight implements VisitorI {
	private Results out;
	private Palindrome p;
	
	/**
	 * Constructor for PalindromeHighlight Visitor
	 * @param r Results instance to append to and print from
	 */
	public PalindromeHighlight(Results r) {
		out = r;
		out.writeToScreen("Creating PalindromeHighlight", MyLogger.DebugLevel.CONSTRUCTOR);
		p = new Palindrome(out);
	}
	
	/**
	 * Capitalize all instances of palindromes in tree
	 * @param tree Tree to search for palindromes
	 */
	public void visit(TreeBuilder tree){
		Node head = tree.getHead();
		p.palindromeSearch(head);
	}
}
