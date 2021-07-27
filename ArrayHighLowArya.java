/***********************************************************************
* @Author: Arya Dixit   @Date: 10/04/2021   
* 
* @File Name: ArrayHighLowArya.java
*
* @Program Description: 
*  This program allows the user to input the length of the array, and
*  the output will display an array of integers that length and display
*  the highest and lowest number of it. 
*
************************************************************************/
import java.util.Random; // imports the class that allows program to generate random numbers
import java.util.Scanner; // import the scanner class from the java library

class ArrayHighLowArya {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.

   int size = 0;
   int large, small;

   // --- User Input
   
   // do {

   System.out.println("Please enter your desired length for the array:");
   size = uI.nextInt(); // allows user to input an integer for the size of their array
   
   // --- Program Execution
   
   int [] array = new int [size]; // creates an array that is the length that the user inputs
   
   System.out.println("\nThe numbers in this array are: ");
   for (int i = 0; i < array.length; i++) { 
      array [i] = new Random().nextInt(); // creates an array of integers till 100 that is the inputted length long
      System.out.println(array[i]); // prints the numbers in the array
   }
   
   large=small=array[0]; // ensures that the large and small variables include all elements (elements 0 to x) in the array    
  
   for(int i=1; i<size; i++) {
      if(array[i]>large) // checks if the element in the array is greater than the number "large"
        large=array[i]; // sets the "large" variable equal to the newest biggest element 
      if(array[i]<small) // checks if the element in the array is less than the number "small"
         small=array[i]; //sets the "small" variable equal to the newest smallest element
   }
   
   System.out.println("\nThe smallest number in this array is " + small );
   System.out.println("The largest number in this array is " + large );
   
   //} while (uI.hasNextInt()) ;
   
   //System.out.println("You did not enter an integer for the array length. Please re-enter one: ");
   
   } // close main ()
   
} // close class ArrayHighLowArya
