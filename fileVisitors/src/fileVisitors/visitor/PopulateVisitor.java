package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.util.FileProcessor;
import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class PopulateVisitor implements VisitorI {
	private FileProcessor in;
	private Results out;
	
	/**
	 * Constructor for PopulateVisitor Visitor
	 * @param fp FileProcessor to get input
	 */
	public PopulateVisitor(FileProcessor fp, Results r) {
		in = fp;
		out = r;
		out.writeToScreen("Creating PopulateVisitor", MyLogger.DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * Fills the tree with nodes from file
	 * @param tree Tree to fill
	 */
	public void visit(TreeBuilder tree){
		String word = in.readWord();
		while (word != null) {
			tree.populate(word);
			word = in.readWord();
		}
	}
	
}
