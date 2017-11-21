package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class TreePrinter {
	private Results out;

	/**
	 * Constructor for TreePrinter
	 * @param r Results instance to append to
	 */
	public TreePrinter(Results r) {
		out = r;
		out.writeToScreen("Creating TreePrinter", MyLogger.DebugLevel.CONSTRUCTOR);
	}

	/**
	 * Append Node words to Results instance
	 * @param n Node to grab word from
	 */
	public void printTree(Node n) {
		if (n != null) {
			printTree(n.getLeft());
			String output = n.getWord() + "\n";
			out.append(output);
			printTree(n.getRight());
		}
	}
}
