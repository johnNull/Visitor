package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class TreePrinter {
	private Results out;

	public TreePrinter(Results r) {
		out = r;
		out.writeToScreen("Creating TreePrinter", MyLogger.DebugLevel.CONSTRUCTOR);
	}

	public void printTree(Node n) {
		if (n != null) {
			printTree(n.getLeft());
			String output = n.getWord() + "\n";
			out.append(output);
			printTree(n.getRight());
		}
	}
}