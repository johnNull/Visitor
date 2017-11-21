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
		out.writeToScreen("Creating TreeBuilder", MyLogger.DebugLevel.CONSTRUCTOR);
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
	 * Get the head of the tree
	 */
	public Node getHead() {
		return head;
	}
	
	/**
	 * Allow Visitors to alter this structure
	 * @param visitor Visitor to alter tree elements 
	 */
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
}
