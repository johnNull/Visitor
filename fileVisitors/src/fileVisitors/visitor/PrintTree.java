package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.store.Results;

public class PrintTree implements VisitorI {
	Results r;
	
	public PrintTree(Results out){
		r = out;
	}

	public void visit(TreeBuilder tree){
		tree.printTree();
		r.writeSchedulesToFile();
	}	
}
