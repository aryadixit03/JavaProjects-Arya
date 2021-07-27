/***********************************************************************
* @Author: Arya Dixit   @Date: 24/04/2021   
* 
* @File Name: FahrenheitToCelsius<Arya>.java
*
* @Program Description: 
*  This program uses a Scanner object so that you can input a value for 
*  the temperature outside in Fahrenheit and the program should then
*  calculate the temperature in Celsius.
*
************************************************************************/

  
import java.util.Scanner; // import the scanner class from the java library

class FahrenheitToCelsius<Arya> {
   public static void main (String [] args) {
  
   // --- Variable Declaration and Initialization
   
   double fahrenheit = 0.0;
   double celsius = 0.0;
   double multiplicationconstant = 5.0/9.0;
   
   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.

   // --- User Input
   
   System.out.println("Please enter a temperature in Fahrenheit to convert to Celsius: ");
   fahrenheit = uI.nextDouble(); 
   
   // --- Program Execution

   celsius = ((multiplicationconstant)*(fahrenheit-32));

   // --- Program Output
   
   System.out.printf("The temperature %.1f Degrees F in Celsius is %.1f Degrees C.",fahrenheit,celsius);
   
   } // close main ()
   
} // close class FahrenheitToCelsius<Arya>