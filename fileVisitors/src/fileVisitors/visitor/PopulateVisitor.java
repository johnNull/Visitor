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
	
	public TreeBuilder visit(TreeBuilder tree){
		TreeBuilder temp = tree;
		String word = in.readWord();
		while (word != null) {
			temp.populate(word);
			word = in.readWord();
		}
		return temp;
	}
	
}
