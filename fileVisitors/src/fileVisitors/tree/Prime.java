package fileVisitors.tree;

import fileVisitors.store.Results;
import fileVisitors.util.MyLogger;
import fileVisitors.util.MyLogger.DebugLevel;

public class Prime {
	private Results out;
	
	public Prime(Results r) {
		out = r;
	}
	
	public String isPrime(String str) {
		String word = str;
		boolean flag = true;
		double num = word.length();
		if(num == 2)
			word += "-PRIME";
		if(num % 2 == 0)
			flag = false;
		for(int i = 3; i * i <= num; i += 2)
			if(num % i == 0)
				flag = false;
		if(flag)
				word += "-PRIME";
		return word;
	}
}