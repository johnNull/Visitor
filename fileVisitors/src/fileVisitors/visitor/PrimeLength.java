package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.tree.Node;
import fileVisitors.tree.Prime;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;
import fileVisitors.store.Results;

public class PrimeLength implements VisitorI {
	private Results out;
	private Prime p;
	
	/**
	 * Constructor for PrimeLength visitor
	 * @param r Results instance to append to and print from
	 */
	public PrimeLength(Results r) {
		out = r;
		out.writeToScreen("Creating PrimeLength", MyLogger.DebugLevel.CONSTRUCTOR);
		p = new Prime(out);
	}
	
	/**
	 * Append -PRIME to all prime length words in Nodes
	 * @param tree TreeBuilder to check
	 */
	public void visit(TreeBuilder tree){
		Node head = tree.getHead();
		p.primeSearch(head);
	}
}
