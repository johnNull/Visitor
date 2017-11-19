package fileVisitors.driver;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.visitor.*;
import fileVisitors.util.*;
import fileVisitors.store.Results;

public class Driver {
	
	public static void main(String[] args) {
		Results r = new Results(args[1]);
		FileProcessor fp = new FileProcessor(args[0], r);
		TreeBuilder tree = new TreeBuilder(r);
		PopulateVisitor pop = new PopulateVisitor(fp, r);
		PrintTree printer = new PrintTree();
		PalindromeHighlight pal = new PalindromeHighlight(r);
		PrimeLength pl = new PrimeLength();
		tree.accept(pop);
		tree.accept(pal);
		tree.accept(pl);
		tree.accept(printer);
	}
	
}
