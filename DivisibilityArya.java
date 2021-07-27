/***********************************************************************
* @Author: Arya Dixit   @Date: 18/05/2021   
* 
* @File Name: DivisibilityArya.java
*
* @Program Description: 
*  This program uses short circuit. It allows the user to input a 
*  divisor and a dividend, and it tells you if the dividend is 
*  divisible by the divisor.
*
************************************************************************/

import java.util.Scanner; // import the scanner class from the java library

class DivisibilityArya {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int dividend;
   int divisor;
   
   Scanner uI = new Scanner (System.in);

   // --- User Input
   
   System.out.println("Please enter a dividend: ");
   dividend = uI.nextInt();
   
   System.out.println("Please enter a divisor: ");
   divisor = uI.nextInt();

   // --- Program Execution and Program Output
   
   if (dividend%divisor == 0) {
      System.out.printf("%d is divisible by %d.",dividend,divisor);
   }
   else if (divisor == 0) {
   System.out.printf("%d is not divisible by %d.",dividend,divisor);
   }
   else {
   System.out.printf("%d is divisible by %d.",dividend,divisor);
   }
   
   } // close main ()
   
} // close class DivisibilityArya

