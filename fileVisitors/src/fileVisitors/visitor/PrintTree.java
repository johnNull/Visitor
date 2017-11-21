package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.store.Results;

public class PrintTree implements VisitorI {
	Results r;
	
	/**
	 * Constructor for PrintTree Visitor
	 * @param out Results instance to append print to
	 */
	public PrintTree(Results out){
		r = out;
	}

	/**
	 * Print the tree to Results output file
	 * @param tree Tree to print
	 */
	public void visit(TreeBuilder tree){
		tree.printTree();
		r.writeSchedulesToFile();
	}	
}
