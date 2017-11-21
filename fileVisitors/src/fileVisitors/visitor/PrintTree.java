package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.tree.Node;
import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class PrintTree implements VisitorI {
	private Results out;
	
	/**
	 * Constructor for PrintTree Visitor
	 * @param out Results instance to append print to
	 */
	public PrintTree(Results r){
		out = r;
		out.writeToScreen("Creating PrintTree", MyLogger.DebugLevel.CONSTRUCTOR);
	}

	/**
	 * Print the tree to Results output file
	 * @param tree Tree to print
	 */
	public void visit(TreeBuilder tree){
		Node head = tree.getHead();
		printTree(head);
		out.writeSchedulesToFile();
	}

	public void printTree(Node n) {
		if (n != null) {
			printTree(n.getLeft());
			String output = n.getWord() + "\n";
			out.append(output);
			printTree(n.getRight());
		}
	}
}
