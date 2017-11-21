package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Prime {
	private Results out;
	
	/**
	 * Constructor for Prime
	 * @param r Results instance to print to file
	 */
	public Prime(Results r) {
		out = r;
		out.writeToScreen("Creating Prime", MyLogger.DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * Check to see if String length is prime
	 * @param str, String to check
	 * @return String with or without -PRIME appended
	 * https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
	 */
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
	
	/**
	 * Traverse tree to search for prime length Strings
	 * @param n Node to check and use for traversal
	 */
	public void primeSearch(Node n) {
		if (n != null) {
			String word = isPrime(n.getWord());
			n.setWord(word);
			primeSearch(n.getLeft());
			primeSearch(n.getRight());
		}
	}
}
