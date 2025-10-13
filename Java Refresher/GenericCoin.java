/*
 * creating a class for tossing a coin and getting which side do we get.
 * by using the random function we will generate a random number between 0 and 1
 * if the number we get is later assigned to the side variable and will be returned by the sideUp function.
 */
import java.util.Random;
public class GenericCoin implements CoinInterface {
	
	public int side;
/*
 * The toss function will be using the random number generation and will be assigned to a local variable x 
 * that which be used to assign the side value.
 * @param None
 */
	public void toss() {
		Random rand = new Random();
		int x = rand.nextInt(0, 2);
		//System.out.println(x);
		if(x==0) {
			side=0;
		}
		else if(x==1) {
			side=1;
		}
	}
	/*
	 * a constructor for the class 
	 * @param None
	 */

	public GenericCoin() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * a method for getting the side that we get.
	 * @param None
	 */
	public int sideUp() {
		return side;
	}
	

}
