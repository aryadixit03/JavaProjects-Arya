/***********************************************************************
* @Author: Arya Dixit   @Date: 24/04/2021   
* 
* @File Name: TaxCalculator<Arya>.java
*
* @Program Description: 
*  This program uses a Scanner object so that you can input the cost 
*  of an item and the program should then display the appropriate tax amount 
*  in dollars and cents and then display the total cost of the item.
*
************************************************************************/
  
import java.util.Scanner; // import the scanner class from the java library

class TaxCalculator<Arya> {
   public static void main (String [] args) {
  
   // --- Variable Declaration and Initialization
   
   double price = 0.0;
   double tax = 0.0;
   double totalcost = 0.0;
   
   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.

   // --- User Input
   
   System.out.println("Please enter the cost of the item: ");
   price = uI.nextDouble(); 
   
   // --- Program Execution

   tax = price*0.13;
   totalcost = tax+price;

   // --- Program Output
   
   System.out.printf("The tax on an item that costs $%.2f is $%.2f and thus, its total cost is $%.2f.",price,tax,totalcost);
   
   } // close main ()
   
} // close class TaxCalculator<Arya>