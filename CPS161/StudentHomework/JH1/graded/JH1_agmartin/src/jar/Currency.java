package jar;

public class Currency
{
	private static final Coin DOLLAR  = new Coin(100, "Dollar");
	private static final Coin QUARTER = new Coin(25,  "Quarter");
	private static final Coin DIME    = new Coin(10,  "Dime");
	private static final Coin NICKLE  = new Coin(5,   "Nickle");
	private static final Coin PENNY   = new Coin(1,   "Penny", "Pennies");
	
	private static final Coin[] US_COINS = { QUARTER, DIME, NICKLE, PENNY };
	private static final Coin[] US_ALL   = { DOLLAR, QUARTER, DIME, NICKLE, PENNY };
		
	public static final Currency US = new Currency(US_COINS, US_ALL, "cents", '$');
	
	private Coin[] coins;
	private Coin[] all;
	private String unit;
	private char symbol;
	
	/**
	 * Creates a currency from an array of coins.
	 * 
	 * @param coins The coins of the currency.
	 * @param all The coins and bills of the currency.
	 * @param unit The unit of the coin's value.
	 * @param symbol The symbol in front of the value.
	 */
	public Currency(Coin[] coins, Coin[] all, String unit, char symbol)
	{
		this.coins = coins;
		this.all = all;
		this.unit = unit;
		this.symbol = symbol;
	}
	
	/**
	 * @return The array of coins in the currency.
	 */
	public Coin[] getCoins()
	{
		return this.coins;
	}
	
	/**
	 * @return The array of coins in the currency.
	 */
	public Coin[] getAll()
	{
		return this.all;
	}
	
	/**
	 * @return The unit of the coins.
	 */
	public String getUnit()
	{
		return this.unit;
	}
	
	/**
	 * @return The symbol to be used in front of the value.
	 */
	public char getSymbol()
	{
		return this.symbol;
	}
}
