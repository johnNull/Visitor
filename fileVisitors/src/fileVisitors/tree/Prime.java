package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Prime {
	private Results out;
	
	public Prime(Results r) {
		out = r;
		out.writeToScreen("Creating Prime", MyLogger.DebugLevel.CONSTRUCTOR);
	}
	
	public String isPrime(String str) {
		String word = str;
		boolean flag = true;
		double num = word.length();
		if(num == 2) {
			out.writeToScreen("Prime Length Found - " + str, MyLogger.DebugLevel.PRIME);
			word += "-PRIME";
		}
		if(num % 2 == 0)
			flag = false;
		for(int i = 3; i * i <= num; i += 2)
			if(num % i == 0)
				flag = false;
		if(flag) {
			out.writeToScreen("Prime Length Found - " + str, MyLogger.DebugLevel.PRIME);
			word += "-PRIME";
		}
		return word;
	}
	
	public void primeSearch(Node n) {
		if (n != null) {
			String word = isPrime(n.getWord());
			n.setWord(word);
			primeSearch(n.getLeft());
			primeSearch(n.getRight());
		}
	}
}