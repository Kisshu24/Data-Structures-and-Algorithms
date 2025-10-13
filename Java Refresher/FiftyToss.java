/*
 * Here is a program for tossing two different coins 50 times.
 */
public class FiftyToss {
	public static void main(String[] args) {
		/*
		 * creating the counts variable for heads count and tails count for the coin number 1
		 */
		int heads1 = 0;
		int tails1 = 0;
		/*
		 * creating the side variable to let us know which side is up after tossing.
		 */
		int side1;
		/*
		 * creating a loop for tossing a coin for 50 times,
		 * counting the number of times the coin has landed on the heads.
		 */
		for(int i = 0; i < 51; i++) {
			/*
			 * using the GenericCoin class to create a new object genericCoin.
			 * tossing the first coin using the object created and then getting the result
			 * saving the result on the heads1 variable if it comes up as heads
			 * and also for the tails1 variable if we get tails.
			 */
			GenericCoin genericCoin = new GenericCoin();
			genericCoin.toss();
			side1 = genericCoin.sideUp();
			if (side1==0) {
				heads1=heads1+1;
			}//end of if
			else {
				tails1=tails1+1;
			}// end of else
		}// end of for
		/*
		 * printing the total number of heads we got after running the loop above.
		 */
		System.out.println("Total numbers of Heads in coin 1 = "+heads1);
		
		/*
		 * creating the counts variables for heads count, tails count 
		 * and the side variable for getting the side 
		 */
		int heads2 = 0;
		int tails2 = 0;
		int side2;
		/*
		 * using the loop we are going to toss the newly created object 50 times
		 * after tossing, we are going to save the result into its respected variable.
		 * if the result is heads then we add to the heads2 variable
		 * similarly if the result is tails, we add 1 to the tails2 variable. 
		 */
		for(int i = 0; i < 51; i++) {
			new GenericCoin();
			GenericCoin genericCoin2 = new GenericCoin();
			genericCoin2.toss();
			side2 = genericCoin2.sideUp();
			if (side2==0) {
				heads2=heads2+1;
			}//end of if
			else {
				tails2=tails2+1;
			}// end of else
		}// end of for
		
		/*
		 * printing the total number of heads in coin 2 for showing what the result is.
		 */
		System.out.println("Total numbers of Heads in coin 2 = "+heads2);
		/*
		 * a small if block comparing the numbers of heads for both coin1 and coin2 
		 * printing the results based on which coin had the most number of heads.
		 */
		if(heads1>heads2) {
			System.out.println("Coin 1 had more Heads than Coin 2!");
		}
		else if(heads2>heads1) {
			System.out.println("Coin 2 had more Heads than Coin 1!");
		}
		else
		{
			System.out.println("Both of the coins had the same number of Heads!");
		}
	}// end of main
}// end of class

/*
 * Sample output:
 * 	Total numbers of Heads in coin 1 = 17
 *	Total numbers of Heads in coin 2 = 25
 *	Coin 2 had more Heads than Coin 1!
 */

