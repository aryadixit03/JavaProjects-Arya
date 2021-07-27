/***********************************************************************
* @Author: Arya Dixit   @Date: 11/05/2021   
*
* @File Name: RollTheDiceArya.java
*
* @Program Description: 
*  This program instructs the user to roll a real dice and input the
*  value they roll into the computer. If the number the user rolls matches 
*  the number the computer's Random Number Generator (the number it 
*  will generate is between 1 and 6), then the user wins. 
*
************************************************************************/

import java.lang.Math;  // import the math class from the java library
import java.util.Scanner;  // import the scanner class from the java library
import java.util.Random;

class RollTheDiceArya {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int x = 0;
   
   int rand = 0;
   
   Scanner uI = new Scanner (System.in);

   // --- User Input
   
   System.out.println("Please roll a dice and enter the value you get.");
   System.out.println("If your roll number matches the random number generator, you win!");
   x = uI.nextInt();
   
   System.out.println("The random number generator generated number "+(int)(Math.random()*6+1)+".");
   
   if (x == rand) {
   
   System.out.println("You win!");
   
   }
   
   else if (x != rand) {
   
   System.out.println("You did not win.");
   
   }
   
   // --- Program Execution

   // --- Program Output
   
   } // close main ()
   
} // close class RollTheDiceArya
