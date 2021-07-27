/**************************************************************************
* @Author: Arya Dixit   @Date: 04/05/2021   
* 
* @File Name: AmountEarnedOnInvestment<Arya>.java
*
* @Program Description: 
*  This program uses Math.pow in its formula to calculate the final amount
*  earned on an initial investment that the user inputs. The investment is
*  compounded annually, and the user also inputs the number of years and 
*  interest rate percentage. 
*
***************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class AmountEarnedOnInvestment<Arya> {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   double principal = 0.00;
   int interestrate = 0;
   int years = 0;
   double amount = 0.00;
   double formula = 0.0000;
   
   String unit = "%/a";
   
   Scanner input = new Scanner (System.in);

   // --- User Input
   
   System.out.println("Enter the initial principal amount: ");
   principal = input.nextDouble();
   
   System.out.println("Enter the annual interest rate: ");
   interestrate = input.nextInt();
   
   System.out.println("Enter the number of years of your investment: ");
   years = input.nextInt();

   // --- Program Execution
   
   formula = (1+(interestrate/100d));
   amount = (principal)*(Math.pow(formula,years));
      
   // --- Program Output

   System.out.printf("$%.2f invested at %d %s for %d years is $%.2f.",principal,interestrate,unit,years,amount);   
   
   } // close main ()
   
} // close class AmountEarnedOnInvestment<Arya>

