package fileVisitors.driver;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.visitor.VisitorI;
import fileVisitors.visitor.PopulateVisitor;
import fileVisitors.visitor.PrintTree;
import fileVisitors.visitor.PalindromeHighlight;
import fileVisitors.visitor.PrimeLength;
import fileVisitors.util.FileProcessor;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;
import fileVisitors.store.Results;

public class Driver {
	
	public static void main(String[] args) {
		if(args == null || args.length != 3){
				System.out.println(args.length);
				throw new IllegalArgumentException("Three arguments are required, input.txt, output.txt, and debug level");}
		else{
			try{
				int debug = Integer.parseInt(args[2]);
				if(debug >= 0 && debug <= 4)
					MyLogger.setDebugValue(Integer.parseInt(args[2]));	
				else
					throw new IllegalArgumentException("Debug level must be 0-4");
			}
			catch(Exception e){
				System.err.println("Incorrect debug level format");
				e.printStackTrace(System.out);
			}
			Results r = new Results(args[1]);
			FileProcessor fp = new FileProcessor(args[0], r);
			TreeBuilder tree = new TreeBuilder(r);
			VisitorI pop = new PopulateVisitor(fp, r);
			VisitorI printer = new PrintTree(r);
			VisitorI pal = new PalindromeHighlight(r);
			VisitorI pl = new PrimeLength(r);
			tree.accept(pop);
			tree.accept(pal);
			tree.accept(pl);
			tree.accept(printer);
		}
	}
	
}
