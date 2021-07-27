/***********************************************************************
* @Author: Arya Dixit   @Date: 04/05/2021   
* 
* @File Name: AreaOfCircleCalculator<Arya>.java
*
* @Program Description: 
*  This program uses Math.PI in its formulas to calculate the area
*  of a circle with the radius that the user can input.
*
************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class AreaOfCircleCalculator<Arya> {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   double area = 0.00;
   double radius = 0.00;
   
   Scanner input = new Scanner (System.in);

   // --- User Input
   
   System.out.println("Please enter a radius value: ");
   radius = input.nextDouble();

   // --- Program Execution
   
   area = Math.PI*radius*radius;
      
   // --- Program Output

   System.out.printf("Area of circle with radius %.2f equals %.2f units squared.",radius,area);   

   
   } // close main ()
   
} // close class AreaOfCircleCalculator<Arya>

