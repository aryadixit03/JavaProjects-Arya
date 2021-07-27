/***********************************************************************
* @Author: Arya Dixit   @Date: 04/05/2021   
* 
* @File Name: SquareRootCalculator<Arya>.java
*
* @Program Description: 
*  This program uses Math.sqrt in its formula to calculate the square
*  root of an integer between 1 and 100 that the user can input.
*
************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class SquareRootCalculator<Arya> {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int number = 0;
   
   Scanner input = new Scanner (System.in);

   // --- User Input
   
   System.out.println("Please enter an integer between 0 and 100: ");
   number = input.nextInt();

   // --- Program Execution
   
   // --- Program Output

   System.out.printf("The square root of %d is %.2f.",number,Math.sqrt(number));   
   
   } // close main ()
   
} // close class SquareRootCalculator<Arya>

