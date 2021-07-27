/***********************************************************************
* @Author: Arya Dixit   @Date: 24/04/2021   
* 
* @File Name: CubeCalculator<Arya>.java
*
* @Program Description: 
*  This program uses a Scanner object so that you can input an integer 
*  number between 1 and 10 and then your program should calculate the 
*  cube of that number.
*
************************************************************************/

  
import java.util.Scanner; // import the scanner class from the java library

class CubeCalculator<Arya> {
   public static void main (String [] args) {
  
   // --- Variable Declaration and Initialization
   
   int number = 0;
   int numbercubed = 0;
   
   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.

   // --- User Input
   
   System.out.println("Please enter an integer number between 1 and 10, inclusively. ");
   number = uI.nextInt();    
  
   // --- Program Execution
      
   numbercubed = number*number*number;

   // --- Program Output
   
   System.out.printf("The cube of %d is %d.",number,numbercubed);
   
   } // close main ()
   
} // close class CubeCalculator<Arya>