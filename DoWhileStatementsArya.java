/***********************************************************************
* @Author: Arya Dixit   @Date: 24/05/2021   
*
* @File Name: DoWhileStatementsArya.java
*
* @Program Description: 
*  This program allows the user to pick an option from the given menu
*  and the program will "run" that option. It uses do while statements.
*
************************************************************************/

import java.util.Scanner; // import the scanner class from the java library

class DoWhileStatementsArya {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int intMyNum = 0;
   String strMyFileName = ""; 

   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.

   // --- User Input, Program Execution, and Program Output
   
   do { 
   
      System.out.printf("\n====MENU --- PLEASE SELECT ONE --------------------\n"); // menu header
      System.out.printf("1. Load/Open a file .... \n2. Save a file to disk ... \n3. Sort Names Alphabetically \n4. Exit Program \n"); // menu options
      while (!uI.hasNextInt()) //checks if the input is an integer
         { 
         System.out.println("You did not enter an option from the menu. Please select an option from the menu.");
         uI.next(); // moves scanner input into the next token
         } 
   
      intMyNum = uI.nextInt(); // takes user input for menu option 
      if (intMyNum < 1 || intMyNum > 4) // checks if number inputted is not from the menu options
         System.out.println("Please select an option from the menu.");
      else if (intMyNum == 1 || intMyNum == 2) { // checks if number inputted is 1 or 2
         System.out.println("Please enter a file name: ");
         do {
            strMyFileName = uI.next(); // takes user input for file name 
               if (strMyFileName.length() > 10) //checks if the file name is greater than 10 characters long
                  System.out.printf("The file name %s is too long. Please try again. \n",strMyFileName);
               else if (intMyNum == 1) // checks if the number inputted is 1
                  System.out.printf("Opening %s\n ",strMyFileName);
               else // checks if the number inputted is 2 (aka not 1 from options 1 and 2)
                  System.out.printf("Saving %s\n",strMyFileName);   
   
         } while ((strMyFileName.length() > 10)  || strMyFileName.length() < 1); //checks if the file name is not within 1 to 10 characters inclusive, and if that is true, this loop restarts and will retake user input
         
      } else if (intMyNum == 3) // checks if number inputted is 3
         System.out.printf("Sorting Alphabetically\n");
   
      else if (intMyNum == 4) // checks if number inputted is 4
         System.out.println("Good - Bye");
   
   } while (intMyNum < 1 || intMyNum > 4 || intMyNum != 4); //checks if the number inputted is not between 1 and 4 inclusive, or if it is not 4, and if that is true, this entire loop restarts and will retake user input
   
   } // close main ()
   
} // close class DoWhileStatementsArya