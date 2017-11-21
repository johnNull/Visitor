package fileVisitors.visitor;

import fileVisitors.tree.TreeBuilder;
import fileVisitors.tree.Node;
import fileVisitors.tree.Prime;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;
import fileVisitors.store.Results;

public class PrimeLength implements VisitorI {
	private Results out;
	private Prime p;
	
	public PrimeLength(Results r) {
		out = r;
		out.writeToScreen("Creating PrimeLength", MyLogger.DebugLevel.CONSTRUCTOR);
		p = new Prime(out);
	}
	
	public void visit(TreeBuilder tree){
		Node head = tree.getHead();
		primeSearch(head);
	}
	
	public void primeSearch(Node n) {
		if (n != null) {
			String word = p.isPrime(n.getWord());
			n.setWord(word);
			primeSearch(n.getLeft());
			primeSearch(n.getRight());
		}
	}
}
