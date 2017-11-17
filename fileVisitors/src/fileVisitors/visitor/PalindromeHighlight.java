package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.store.Results;

public class PalindromeHighlight implements VisitorI {
	private Results out;
	
	public PalindromeHighlight(Results r) {
		out = r;
	}
	
	public TreeBuilder visit(TreeBuilder tree){
		TreeBuilder temp = tree;
		temp.palindrome();
		return temp;
	}
	
}
