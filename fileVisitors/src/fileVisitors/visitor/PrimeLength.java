package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;

public class PrimeLength implements VisitorI {
	public void visit(TreeBuilder tree){
		tree.primeLength();
	}
}
