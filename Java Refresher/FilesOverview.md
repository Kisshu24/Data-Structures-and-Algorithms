# Files Overview
## Coin.java:
 ### An Object file that we will be using to create a object coin, like Quater, Nickel, Dime and Penny. This class extends to the GenericCoin.java file
## CoinInterface.java: 
### An Interface for the Coin class containing all the methods abd variables that we are going to use in the coin class.   This class is implemented by the GenericCoin.java file
## GenericCoin: 
### A file containing the methods that we are going to use in our FiftyToss.java and Tossing.java file. This file Implements the CoinInterface.java file
## FiftyToss: 
### As the name suggest, this class will have the object GenericCoin and we will be tossing that coin 50 times and saving which sides comes to the top and counting its frequency. Then at the end it displays how many heads and how mant tails did we get.
## Tossing: 
### In this Class we are going to create 3 distint object namely Quater, Dime, Nickel. Using these 3 objects we are going to toss them each one and see if any among them have given us heads, if its heads then we add that value to our total and display which coin has been added. our task is to keep tossing these coin objects till we reached the amount that is 1 or more, once that amount is reached we stop. and display the total at the end.
