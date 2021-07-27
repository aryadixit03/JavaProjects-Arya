/*******************************************************************************
* @Author: Arya Dixit   @Date: 24/04/2021   
* 
* @File Name: CircumferenceCalculator<Arya>.java
*
* @Program Description: 
*  This program uses a Scanner object so that you can input a radius 
*  of a circle and the program will tell you the circumference of a circle with
*  that inputted radius, rounded to 2 decimal points. 
*
********************************************************************************/

  
import java.util.Scanner; // import the scanner class from the java library

class CircumferenceCalculator<Arya> {
   public static void main (String [] args) {
  
   // --- Variable Declaration and Initialization
   
   double radius = 0.0;
   double pi = 3.1415926535;
   double circumference = 0.0;
   
   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.

   // --- User Input
   
   System.out.println("Please enter the radius of the circle: ");
   radius = uI.nextDouble(); 
   
   // --- Program Execution

   circumference = 2*pi*radius;

   // --- Program Output
   
   System.out.printf("The Circumference of a circle with radius %.1f is %.2f.",radius,circumference);
   
   } // close main ()
   
} // close class CircumferenceCalculator<Arya>