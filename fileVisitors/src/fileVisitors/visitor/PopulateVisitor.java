package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.util.FileProcessor;
import fileVisitors.store.Results;

public class PopulateVisitor implements VisitorI {
	private FileProcessor in;
	private Results out;
	
	public PopulateVisitor(FileProcessor fp, Results r) {
		in = fp;
		out = r;
	}
	
	public void visit(TreeBuilder tree){
		String word = in.readWord();
		while (word != null) {
			tree.populate(word);
			word = in.readWord();
		}
	}
	
}
