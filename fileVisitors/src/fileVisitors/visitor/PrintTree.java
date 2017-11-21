package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.tree.Node;
import fileVisitors.tree.TreePrinter;
import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class PrintTree implements VisitorI {
	private Results out;
	private TreePrinter tp;
	
	/**
	 * Constructor for PrintTree Visitor
	 * @param out Results instance to append print to
	 */
	public PrintTree(Results r){
		out = r;
		out.writeToScreen("Creating PrintTree", MyLogger.DebugLevel.CONSTRUCTOR);
		tp = new TreePrinter(out);
	}

	/**
	 * Print the tree to Results output file
	 * @param tree Tree to print
	 */
	public void visit(TreeBuilder tree){
		Node head = tree.getHead();
		tp.printTree(head);
		out.writeSchedulesToFile();
	}
}
