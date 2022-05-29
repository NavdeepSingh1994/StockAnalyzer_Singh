package stockanalyzer.ctrl;



import stockanalyzer.ui.YahooException;
import yahooApi.YahooFinance;
import yahooApi.beans.QuoteResponse;
import yahooApi.beans.Result;
import yahooApi.beans.YahooResponse;

import java.util.*;

public class Controller {

	List<String> Tickers = new ArrayList<>();
	Calendar calendar = null;

	public void process(String ticker) throws YahooException {

		YahooFinance yahooFinance = new YahooFinance();
		List<String> tickers = Arrays.asList(ticker);
		YahooResponse response = yahooFinance.getCurrentData(tickers);
		QuoteResponse quotes = response.getQuoteResponse();
		final String[] longName = new String[1];

		System.out.println("Start process");
		quotes.getResult().stream().forEach(quote -> longName[0] = quote.getLongName());
		quotes.getResult().stream().forEach(quote -> System.out.println(quote.getLongName() + " " + quote.getBid()));

		calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_WEEK, -11);
		Tickers.add(ticker);

		System.out.println("\nThe history:");

		Result highprice = gethighprice(quotes);

		System.out.println("Name: " + highprice.getLongName() + "\nLast highest price: " + highprice.getBid());

		System.out.println( "Avarege price: " + getAveragePrice(quotes) + "\n");

		System.out.println("The number of records in your shares");

		System.out.println( "Records : " + getAmountShares(quotes));

	}

	public Result gethighprice(QuoteResponse quotes) throws YahooException {
		Result maxPrice;

		try {
			maxPrice = quotes.getResult().stream().max(Comparator.comparing(Result::getAsk)).get();
		} catch (NoSuchElementException e) {
			throw new YahooException("Object was not found!");
		}
		return maxPrice;
	}

	public double getAveragePrice(QuoteResponse quotes) throws YahooException {
		double avgPrice = 0;
		try {
			avgPrice = quotes.getResult().stream().mapToDouble(Result::getBid).average().getAsDouble();
		} catch (Exception e) {

			throw new YahooException("Object was not found!");
		}
		return avgPrice;
	}
	public double getAmountShares(QuoteResponse quotes) throws YahooException
	{
		double amountofShares;
		try {
			amountofShares = (double) quotes.getResult().stream().count();

		} catch (NoSuchElementException e) {

			throw new YahooException("Object didnt found it ");

		}
		return amountofShares;
	}
}