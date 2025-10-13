/*
 * a program for tossing 3 coins; nickel, dime and quater with the values assigned.
 * creating an object for the each of the coins assigning the values and type 
 * while tossing the coins we will add the value of the coin that gets heads onto the variable amount.
 * 
 */
public class Tossing {
	public int side;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * creating the variable for the total,
		 * also creating 3 objects for the three different type if coins
		 * coins with null type and double data type values
		 */
		double amount = 0;
		Coin nickel = new Coin(.05, null);
		Coin dime = new Coin(0.1,null);
		Coin quater = new Coin(0.25,null);
		/*
		 * using the while loop, we are going to toss each coin once,
		 * if the coin gets heads after the toss then we add its value into the total
		 * we will do that for all the three coins.
		 */
		while(amount<1) {
			
			nickel.toss();
			int nside = nickel.sideUp();
			if(nside==0) {
				System.out.println("Nickel has been added!");
				amount = amount + 0.05;
			}
			dime.toss();
			int dside = dime.sideUp(); 
			if(dside==0) {
				System.out.println("Dime has been added!");
				amount = amount + 0.1;
			}
			quater.toss();
			int qside = quater.sideUp();
			if(qside==0) {
				System.out.println("Quater has been added!");
				amount = amount + 0.25;
			}
		}//end of while
		// a print statement to show what we got after the loop.
		System.out.println("Final Amount = "+amount);

	}

}//end of class
/*Sample Output
 * Dime has been added!
Quater has been added!
Nickel has been added!
Dime has been added!
Quater has been added!
Dime has been added!
Quater has been added!
Final Amount = 1.1
 * 
 */
