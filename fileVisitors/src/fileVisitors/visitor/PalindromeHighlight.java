package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.store.Results;

public class PalindromeHighlight implements VisitorI {
	private Results out;
	
	public PalindromeHighlight(Results r) {
		out = r;
	}
	
	public void visit(TreeBuilder tree){
		tree.palindrome();
	}
	
}
