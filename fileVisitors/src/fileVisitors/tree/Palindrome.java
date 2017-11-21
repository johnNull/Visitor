package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Palindrome {
	private Results out;
	
	public Palindrome(Results r) {
		out = r;
		out.writeToScreen("Creating Palindrome", MyLogger.DebugLevel.CONSTRUCTOR);
	}
	
	public boolean isPalindrome(String word) {
		if (word.length() > 3) {
			boolean pal = true;
			for (int i = 0; i <= word.length() / 2; i++) {
				if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(word.length() - 1 - i))) {
					pal = false;
					break;
				}
			}	
			return pal;
		} else {
			return false;
		}
	}
	
	public void palindromeSearch(Node n) {
		if (n != null) {
			if (isPalindrome(n.getWord())) {
				out.writeToScreen("Palindrome Found - " + n.getWord(), MyLogger.DebugLevel.PALINDROME);
				n.setWord(n.getWord().toUpperCase());
			}
			palindromeSearch(n.getLeft());
			palindromeSearch(n.getRight());
		}
	}
}