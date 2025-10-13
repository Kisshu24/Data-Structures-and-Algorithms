public class Coin extends GenericCoin {
	private double value;
	private String type;
	/*
	 * Creating a coin class for making the different coin objects
	 * @param value: is used to assign a value for the object
	 * @param type: will be used to assign the name of the coin.
	 */
	public Coin(double value, String type) {
		super();
		this.value = value;
		this.type = type;
	}
	/*
	 * Creating a method to get the value assigned to the coin object.
	 * @param None
	 */
	public double getValue() {
		return value;
	}
	/*
	 * Creating a method for the name of the coin object
	 * @param None
	 */
	public String getType() {
		return type;
	}

}// end of class
