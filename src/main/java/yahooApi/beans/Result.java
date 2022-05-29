package yahooApi.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "language", "region", "quoteType", "quoteSourceName", "currency", "exchangeDataDelayedBy",
        "market", "marketState", "exchange", "priceHint", "postMarketChangePercent", "postMarketTime",
        "twoHundredDayAverage", "twoHundredDayAverageChange", "twoHundredDayAverageChangePercent", "marketCap",
        "forwardPE", "priceToBook", "esgPopulated", "tradeable", "earningsTimestampEnd", "trailingAnnualDividendRate",
        "trailingAnnualDividendYield", "epsTrailingTwelveMonths", "epsForward", "shortName", "sourceInterval",
        "exchangeTimezoneName", "exchangeTimezoneShortName", "gmtOffSetMilliseconds", "regularMarketPrice",
        "regularMarketTime", "regularMarketChange", "regularMarketOpen", "regularMarketDayHigh", "regularMarketDayLow",
        "regularMarketVolume", "sharesOutstanding", "bookValue", "fiftyDayAverage", "fiftyDayAverageChange",
        "fiftyDayAverageChangePercent", "postMarketPrice", "postMarketChange", "regularMarketChangePercent",
        "regularMarketDayRange", "regularMarketPreviousClose", "bid", "ask", "bidSize", "askSize", "messageBoardId",
        "fullExchangeName", "longName", "financialCurrency", "averageDailyVolume3Month", "averageDailyVolume10Day",
        "fiftyTwoWeekLowChange", "fiftyTwoWeekLowChangePercent", "fiftyTwoWeekRange", "fiftyTwoWeekHighChange",
        "fiftyTwoWeekHighChangePercent", "fiftyTwoWeekLow", "fiftyTwoWeekHigh", "dividendDate", "earningsTimestamp",
        "earningsTimestampStart", "trailingPE", "symbol" })

public class Result {

    @JsonProperty("language")
    private String language;

    @JsonProperty("region")
    private String region;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("quoteSourceName")
    private String quoteSourceName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("exchangeDataDelayedBy")
    private Long exchangeDataDelayedBy;
    @JsonProperty("market")
    private String market;
    @JsonProperty("marketState")
    private String marketState;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("priceHint")
    private Long priceHint;
    @JsonProperty("postMarketChangePercent")
    private Double postMarketChangePercent;
    @JsonProperty("postMarketTime")
    private Long postMarketTime;
    @JsonProperty("twoHundredDayAverage")
    private Double twoHundredDayAverage;
    @JsonProperty("twoHundredDayAverageChange")
    private Double twoHundredDayAverageChange;
    @JsonProperty("twoHundredDayAverageChangePercent")
    private Double twoHundredDayAverageChangePercent;
    @JsonProperty("marketCap")
    private Long marketCap;
    @JsonProperty("forwardPE")
    private Double forwardPE;
    @JsonProperty("priceToBook")
    private Double priceToBook;
    @JsonProperty("esgPopulated")
    private Boolean esgPopulated;
    @JsonProperty("tradeable")
    private Boolean tradeable;
    @JsonProperty("earningsTimestampEnd")
    private Long earningsTimestampEnd;
    @JsonProperty("trailingAnnualDividendRate")
    private Double trailingAnnualDividendRate;
    @JsonProperty("trailingAnnualDividendYield")
    private Double trailingAnnualDividendYield;
    @JsonProperty("epsTrailingTwelveMonths")
    private Double epsTrailingTwelveMonths;
    @JsonProperty("epsForward")
    private Double epsForward;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("sourceInterval")
    private Long sourceInterval;
    @JsonProperty("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @JsonProperty("exchangeTimezoneShortName")
    private String exchangeTimezoneShortName;
    @JsonProperty("gmtOffSetMilliseconds")
    private Long gmtOffSetMilliseconds;
    @JsonProperty("regularMarketPrice")
    private Double regularMarketPrice;
    @JsonProperty("regularMarketTime")
    private Long regularMarketTime;
    @JsonProperty("regularMarketChange")
    private Double regularMarketChange;
    @JsonProperty("regularMarketOpen")
    private Double regularMarketOpen;
    @JsonProperty("regularMarketDayHigh")
    private Double regularMarketDayHigh;
    @JsonProperty("regularMarketDayLow")
    private Double regularMarketDayLow;
    @JsonProperty("regularMarketVolume")
    private Long regularMarketVolume;
    @JsonProperty("sharesOutstanding")
    private Long sharesOutstanding;
    @JsonProperty("bookValue")
    private Double bookValue;
    @JsonProperty("fiftyDayAverage")
    private Double fiftyDayAverage;
    @JsonProperty("fiftyDayAverageChange")
    private Double fiftyDayAverageChange;
    @JsonProperty("fiftyDayAverageChangePercent")
    private Double fiftyDayAverageChangePercent;
    @JsonProperty("postMarketPrice")
    private Double postMarketPrice;
    @JsonProperty("postMarketChange")
    private Double postMarketChange;
    @JsonProperty("regularMarketChangePercent")
    private Double regularMarketChangePercent;
    @JsonProperty("regularMarketDayRange")
    private String regularMarketDayRange;
    @JsonProperty("regularMarketPreviousClose")
    private Double regularMarketPreviousClose;
    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("ask")
    private Double ask;
    @JsonProperty("bidSize")
    private Long bidSize;
    @JsonProperty("askSize")
    private Long askSize;
    @JsonProperty("messageBoardId")
    private String messageBoardId;
    @JsonProperty("fullExchangeName")
    private String fullExchangeName;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("financialCurrency")
    private String financialCurrency;
    @JsonProperty("averageDailyVolume3Month")
    private Long averageDailyVolume3Month;
    @JsonProperty("averageDailyVolume10Day")
    private Long averageDailyVolume10Day;
    @JsonProperty("fiftyTwoWeekLowChange")
    private Double fiftyTwoWeekLowChange;
    @JsonProperty("fiftyTwoWeekLowChangePercent")
    private Double fiftyTwoWeekLowChangePercent;
    @JsonProperty("fiftyTwoWeekRange")
    private String fiftyTwoWeekRange;
    @JsonProperty("fiftyTwoWeekHighChange")
    private Double fiftyTwoWeekHighChange;
    @JsonProperty("fiftyTwoWeekHighChangePercent")
    private Double fiftyTwoWeekHighChangePercent;
    @JsonProperty("fiftyTwoWeekLow")
    private Double fiftyTwoWeekLow;
    @JsonProperty("fiftyTwoWeekHigh")
    private Double fiftyTwoWeekHigh;
    @JsonProperty("dividendDate")
    private Long dividendDate;
    @JsonProperty("earningsTimestamp")
    private Long earningsTimestamp;
    @JsonProperty("earningsTimestampStart")
    private Long earningsTimestampStart;
    @JsonProperty("trailingPE")
    private Double trailingPE;
    @JsonProperty("symbol")
    private String symbol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("quoteSourceName")
    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    @JsonProperty("quoteSourceName")
    public void setQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public Long getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public void setExchangeDataDelayedBy(Long exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    @JsonProperty("market")
    public String getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
    }

    @JsonProperty("marketState")
    public String getMarketState() {
        return marketState;
    }

    @JsonProperty("marketState")
    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("priceHint")
    public Long getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(Long priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("postMarketChangePercent")
    public Double getPostMarketChangePercent() {
        return postMarketChangePercent;
    }

    @JsonProperty("postMarketChangePercent")
    public void setPostMarketChangePercent(Double postMarketChangePercent) {
        this.postMarketChangePercent = postMarketChangePercent;
    }

    @JsonProperty("postMarketTime")
    public Long getPostMarketTime() {
        return postMarketTime;
    }

    @JsonProperty("postMarketTime")
    public void setPostMarketTime(Long postMarketTime) {
        this.postMarketTime = postMarketTime;
    }

    @JsonProperty("twoHundredDayAverage")
    public Double getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    @JsonProperty("twoHundredDayAverage")
    public void setTwoHundredDayAverage(Double twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    @JsonProperty("twoHundredDayAverageChange")
    public Double getTwoHundredDayAverageChange() {
        return twoHundredDayAverageChange;
    }

    @JsonProperty("twoHundredDayAverageChange")
    public void setTwoHundredDayAverageChange(Double twoHundredDayAverageChange) {
        this.twoHundredDayAverageChange = twoHundredDayAverageChange;
    }

    @JsonProperty("twoHundredDayAverageChangePercent")
    public Double getTwoHundredDayAverageChangePercent() {
        return twoHundredDayAverageChangePercent;
    }

    @JsonProperty("twoHundredDayAverageChangePercent")
    public void setTwoHundredDayAverageChangePercent(Double twoHundredDayAverageChangePercent) {
        this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
    }

    @JsonProperty("marketCap")
    public Long getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("forwardPE")
    public Double getForwardPE() {
        return forwardPE;
    }

    @JsonProperty("forwardPE")
    public void setForwardPE(Double forwardPE) {
        this.forwardPE = forwardPE;
    }

    @JsonProperty("priceToBook")
    public Double getPriceToBook() {
        return priceToBook;
    }

    @JsonProperty("priceToBook")
    public void setPriceToBook(Double priceToBook) {
        this.priceToBook = priceToBook;
    }

    @JsonProperty("esgPopulated")
    public Boolean getEsgPopulated() {
        return esgPopulated;
    }

    @JsonProperty("esgPopulated")
    public void setEsgPopulated(Boolean esgPopulated) {
        this.esgPopulated = esgPopulated;
    }

    @JsonProperty("tradeable")
    public Boolean getTradeable() {
        return tradeable;
    }

    @JsonProperty("tradeable")
    public void setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
    }

    @JsonProperty("earningsTimestampEnd")
    public Long getEarningsTimestampEnd() {
        return earningsTimestampEnd;
    }

    @JsonProperty("earningsTimestampEnd")
    public void setEarningsTimestampEnd(Long earningsTimestampEnd) {
        this.earningsTimestampEnd = earningsTimestampEnd;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public Double getTrailingAnnualDividendRate() {
        return trailingAnnualDividendRate;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public void setTrailingAnnualDividendRate(Double trailingAnnualDividendRate) {
        this.trailingAnnualDividendRate = trailingAnnualDividendRate;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public Double getTrailingAnnualDividendYield() {
        return trailingAnnualDividendYield;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public void setTrailingAnnualDividendYield(Double trailingAnnualDividendYield) {
        this.trailingAnnualDividendYield = trailingAnnualDividendYield;
    }

    @JsonProperty("epsTrailingTwelveMonths")
    public Double getEpsTrailingTwelveMonths() {
        return epsTrailingTwelveMonths;
    }

    @JsonProperty("epsTrailingTwelveMonths")
    public void setEpsTrailingTwelveMonths(Double epsTrailingTwelveMonths) {
        this.epsTrailingTwelveMonths = epsTrailingTwelveMonths;
    }

    @JsonProperty("epsForward")
    public Double getEpsForward() {
        return epsForward;
    }

    @JsonProperty("epsForward")
    public void setEpsForward(Double epsForward) {
        this.epsForward = epsForward;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("sourceInterval")
    public Long getSourceInterval() {
        return sourceInterval;
    }

    @JsonProperty("sourceInterval")
    public void setSourceInterval(Long sourceInterval) {
        this.sourceInterval = sourceInterval;
    }

    @JsonProperty("exchangeTimezoneName")
    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneName")
    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public String getExchangeTimezoneShortName() {
        return exchangeTimezoneShortName;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
        this.exchangeTimezoneShortName = exchangeTimezoneShortName;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public Long getGmtOffSetMilliseconds() {
        return gmtOffSetMilliseconds;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public void setGmtOffSetMilliseconds(Long gmtOffSetMilliseconds) {
        this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
    }

    @JsonProperty("regularMarketPrice")
    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @JsonProperty("regularMarketTime")
    public Long getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(Long regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    @JsonProperty("regularMarketChange")
    public Double getRegularMarketChange() {
        return regularMarketChange;
    }

    @JsonProperty("regularMarketChange")
    public void setRegularMarketChange(Double regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    @JsonProperty("regularMarketOpen")
    public Double getRegularMarketOpen() {
        return regularMarketOpen;
    }

    @JsonProperty("regularMarketOpen")
    public void setRegularMarketOpen(Double regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    @JsonProperty("regularMarketDayHigh")
    public Double getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayHigh")
    public void setRegularMarketDayHigh(Double regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayLow")
    public Double getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    @JsonProperty("regularMarketDayLow")
    public void setRegularMarketDayLow(Double regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    @JsonProperty("regularMarketVolume")
    public Long getRegularMarketVolume() {
        return regularMarketVolume;
    }

    @JsonProperty("regularMarketVolume")
    public void setRegularMarketVolume(Long regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    @JsonProperty("sharesOutstanding")
    public Long getSharesOutstanding() {
        return sharesOutstanding;
    }

    @JsonProperty("sharesOutstanding")
    public void setSharesOutstanding(Long sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    @JsonProperty("bookValue")
    public Double getBookValue() {
        return bookValue;
    }

    @JsonProperty("bookValue")
    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    @JsonProperty("fiftyDayAverage")
    public Double getFiftyDayAverage() {
        return fiftyDayAverage;
    }

    @JsonProperty("fiftyDayAverage")
    public void setFiftyDayAverage(Double fiftyDayAverage) {
        this.fiftyDayAverage = fiftyDayAverage;
    }

    @JsonProperty("fiftyDayAverageChange")
    public Double getFiftyDayAverageChange() {
        return fiftyDayAverageChange;
    }

    @JsonProperty("fiftyDayAverageChange")
    public void setFiftyDayAverageChange(Double fiftyDayAverageChange) {
        this.fiftyDayAverageChange = fiftyDayAverageChange;
    }

    @JsonProperty("fiftyDayAverageChangePercent")
    public Double getFiftyDayAverageChangePercent() {
        return fiftyDayAverageChangePercent;
    }

    @JsonProperty("fiftyDayAverageChangePercent")
    public void setFiftyDayAverageChangePercent(Double fiftyDayAverageChangePercent) {
        this.fiftyDayAverageChangePercent = fiftyDayAverageChangePercent;
    }

    @JsonProperty("postMarketPrice")
    public Double getPostMarketPrice() {
        return postMarketPrice;
    }

    @JsonProperty("postMarketPrice")
    public void setPostMarketPrice(Double postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
    }

    @JsonProperty("postMarketChange")
    public Double getPostMarketChange() {
        return postMarketChange;
    }

    @JsonProperty("postMarketChange")
    public void setPostMarketChange(Double postMarketChange) {
        this.postMarketChange = postMarketChange;
    }

    @JsonProperty("regularMarketChangePercent")
    public Double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    @JsonProperty("regularMarketChangePercent")
    public void setRegularMarketChangePercent(Double regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    @JsonProperty("regularMarketDayRange")
    public String getRegularMarketDayRange() {
        return regularMarketDayRange;
    }

    @JsonProperty("regularMarketDayRange")
    public void setRegularMarketDayRange(String regularMarketDayRange) {
        this.regularMarketDayRange = regularMarketDayRange;
    }

    @JsonProperty("regularMarketPreviousClose")
    public Double getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    @JsonProperty("regularMarketPreviousClose")
    public void setRegularMarketPreviousClose(Double regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    @JsonProperty("bid")
    public Double getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(Double bid) {
        this.bid = bid;
    }

    @JsonProperty("ask")
    public Double getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(Double ask) {
        this.ask = ask;
    }

    @JsonProperty("bidSize")
    public Long getBidSize() {
        return bidSize;
    }

    @JsonProperty("bidSize")
    public void setBidSize(Long bidSize) {
        this.bidSize = bidSize;
    }

    @JsonProperty("askSize")
    public Long getAskSize() {
        return askSize;
    }

    @JsonProperty("askSize")
    public void setAskSize(Long askSize) {
        this.askSize = askSize;
    }

    @JsonProperty("messageBoardId")
    public String getMessageBoardId() {
        return messageBoardId;
    }

    @JsonProperty("messageBoardId")
    public void setMessageBoardId(String messageBoardId) {
        this.messageBoardId = messageBoardId;
    }

    @JsonProperty("fullExchangeName")
    public String getFullExchangeName() {
        return fullExchangeName;
    }

    @JsonProperty("fullExchangeName")
    public void setFullExchangeName(String fullExchangeName) {
        this.fullExchangeName = fullExchangeName;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("financialCurrency")
    public String getFinancialCurrency() {
        return financialCurrency;
    }

    @JsonProperty("financialCurrency")
    public void setFinancialCurrency(String financialCurrency) {
        this.financialCurrency = financialCurrency;
    }

    @JsonProperty("averageDailyVolume3Month")
    public Long getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume3Month")
    public void setAverageDailyVolume3Month(Long averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume10Day")
    public Long getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    @JsonProperty("averageDailyVolume10Day")
    public void setAverageDailyVolume10Day(Long averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public Double getFiftyTwoWeekLowChange() {
        return fiftyTwoWeekLowChange;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public void setFiftyTwoWeekLowChange(Double fiftyTwoWeekLowChange) {
        this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public Double getFiftyTwoWeekLowChangePercent() {
        return fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public void setFiftyTwoWeekLowChangePercent(Double fiftyTwoWeekLowChangePercent) {
        this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public String getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public void setFiftyTwoWeekRange(String fiftyTwoWeekRange) {
        this.fiftyTwoWeekRange = fiftyTwoWeekRange;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public Double getFiftyTwoWeekHighChange() {
        return fiftyTwoWeekHighChange;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public void setFiftyTwoWeekHighChange(Double fiftyTwoWeekHighChange) {
        this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public Double getFiftyTwoWeekHighChangePercent() {
        return fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public void setFiftyTwoWeekHighChangePercent(Double fiftyTwoWeekHighChangePercent) {
        this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public Double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public Double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    @JsonProperty("dividendDate")
    public Long getDividendDate() {
        return dividendDate;
    }

    @JsonProperty("dividendDate")
    public void setDividendDate(Long dividendDate) {
        this.dividendDate = dividendDate;
    }

    @JsonProperty("earningsTimestamp")
    public Long getEarningsTimestamp() {
        return earningsTimestamp;
    }

    @JsonProperty("earningsTimestamp")
    public void setEarningsTimestamp(Long earningsTimestamp) {
        this.earningsTimestamp = earningsTimestamp;
    }

    @JsonProperty("earningsTimestampStart")
    public Long getEarningsTimestampStart() {
        return earningsTimestampStart;
    }

    @JsonProperty("earningsTimestampStart")
    public void setEarningsTimestampStart(Long earningsTimestampStart) {
        this.earningsTimestampStart = earningsTimestampStart;
    }

    @JsonProperty("trailingPE")
    public Double getTrailingPE() {
        return trailingPE;
    }

    @JsonProperty("trailingPE")
    public void setTrailingPE(Double trailingPE) {
        this.trailingPE = trailingPE;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
