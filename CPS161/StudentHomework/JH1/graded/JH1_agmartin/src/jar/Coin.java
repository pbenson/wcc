package jar;

public class Coin
{
	
	private int value;
	private String name;
	private String plural;
	private int number;
	
	/**
	 * Creates a new Coin object with a name, plural name, and value.
	 * 
	 * @param value The value of the coin
	 * @param name The name of the coin
	 * @param plural The plural name of the coin
	 */
	public Coin(int value, String name, String plural)
	{
		this.value = value;
		this.name = name;
		this.plural = plural;
		this.number = 0;
	}

	/**
	 * Creates a new Coin object with a name and value.
	 * 
	 * @param value The value of the coin
	 * @param name The name of the coin
	 */
	public Coin(int value, String name)
	{
		this.value = value;
		this.name = name;
		this.number = 0;
		this.plural = name+"s";
	}
	
	/**
	 * @param number The number of coins to add.
	 */
	public void add(int number)
	{
		this.number += number;
	}
	
	/**
	 * @return The value of this type of coin.
	 */
	public int getValue()
	{
		return this.value;
	}
	
	/**
	 * @return The coin's name.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * @return The plural form of the coin's name.
	 */
	public String getPlural()
	{
		return this.plural;
	}
	
	/**
	 * @return The combined value of all of this type of coin.
	 */
	public int getTotalValue()
	{
		return this.value * this.number;
	}
}
