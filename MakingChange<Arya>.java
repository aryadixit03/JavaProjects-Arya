/***********************************************************************
* @Author: Arya Dixit   @Date: 14/05/2021   
*
* @File Name: MakingChange<Arya>.java
*
* @Program Description: 
*  This program will allow the user to input a product amount between 2 
*  cents and a dollar, and it will tell the user how much change they are 
*  getting back from their dollar, and how it will be returned in coins. 
*
************************************************************************/

import java.util.Scanner; // import the scanner class from the java library

class MakingChange<Arya> {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int amount = 0;
   int change = 0;
   
   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard

   // --- User Input
   
   System.out.println("You have 1 dollar.");
   System.out.println("Please enter a product amount between 2 cents and 1 dollar as an integer in order to calculate your change.");
   System.out.print("For example, enter 25 for 25 cents or 1 for a dollar. ");
   amount = uI.nextInt(); // This will return what is in the scanner object to the variable amount. If input is empty it will wait for user input.

   // --- Program Execution and Program Output
   
   if (amount == 1) {
      System.out.println("You get no change. Your item cost a dollar.");
   }
   
   else if (amount >= 2 && amount <= 99) {
      change = 100 - amount; // This will determine the amount of change you will receive in cents
      System.out.printf("Your change is %d cents and you will get back: \n%d quarter(s) \n%d dime(s) \n%d nickel(s) \n%d penny(s)",change,change/25,change%25/10,change%25%10/5,change%25%10%5/1);
   } // Through using the modulus operator, this line determines the number of each coin that you will get as changee
   
   else {
      System.out.println("Your product cost is out of range.");
   }

   } // close main ()
   
} // close class MakingChange<Arya>