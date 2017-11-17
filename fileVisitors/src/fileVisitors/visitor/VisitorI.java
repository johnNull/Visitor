package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;

public interface VisitorI {
	public TreeBuilder visit(TreeBuilder tree);
}
