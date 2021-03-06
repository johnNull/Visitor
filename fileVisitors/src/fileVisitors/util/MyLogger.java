package fileVisitors.util;

public class MyLogger{

    /*DEBUG_VALUE=4 [Print to stdout everytime a constructor is called]
      DEBUG_VALUE=3 [Print to stdout everytime a palindrome is found]
      DEBUG_VALUE=2 [Print to stdout everytime a word is read from the input file]
      DEBUG_VALUE=1 [Print to stdout everytime a word with prime length is found]
      DEBUG_VALUE=0 [No output should be printed from the application to stdout. It is ok to write to the output file though" ]
    */

    public static enum DebugLevel {RELEASE, PRIME, READ_WORD, PALINDROME, CONSTRUCTOR
                                   };

    private static DebugLevel debugLevel;

	/**
	 * Take in an int and assign debugLevel accordingly.
	 * @param levelIn integer corresponding to DebugLevel
	 */
    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	  	case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	  	case 3: debugLevel = DebugLevel.PALINDROME; break;
		case 2: debugLevel = DebugLevel.READ_WORD; break;
		case 1: debugLevel = DebugLevel.PRIME; break;
	  	case 0: debugLevel = DebugLevel.RELEASE; break;
	}
    }
	/**
	 * Set debugLevel directly from enum.
	 * @param levelIn DebugLevel to log with
	 */
    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

 	/** 
	 * Write message if debugLevel is the same as input.
	 * @param message text to be printed to stdout
	 * @param levelIn specifies at what DebugLevel to print the message.
	 */
    public static void writeMessage (String  message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    /**
	 * @return String
	 */
    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
