package fileVisitors.util;

import fileVisitors.util.MyLogger.DebugLevel;

public interface StdoutDisplayInterface {
	public void writeToScreen(String s, DebugLevel l);
}
