//https://github.com/NavdeepSingh1994/StockAnalyzer.git

import stockanalyzer.ui.UserInterface;
import stockanalyzer.ui.YahooException;

public class MCP {

	public static void main(String args[]) throws YahooException {
		UserInterface ui = new UserInterface();
		ui.start();
	}
}