package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.store.Results;

public class PalindromeHighlight implements VisitorI {
	
	/**
	 * Capitalize all instances of palindromes in tree
	 * @param tree Tree to search for palindromes
	 */
	public void visit(TreeBuilder tree){
		tree.palindrome();
	}
	
}
