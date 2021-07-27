/***********************************************************************
* @Author: Arya Dixit   @Date: 10/06/2021   
* 
* @File Name: FlowToJavaArya.java
*
* @Program Description: 
*  This program allows the user to enter the percentage grade they 
*  received and lets them know the level they received as according to
*  the Ontario education curriculum. 
*
************************************************************************/

import java.util.Scanner; // import the scanner class from the java library

class FlowToJavaArya {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int x = 0;
   int y = 0;
   
   Scanner uI = new Scanner (System.in);

   // --- User Input
   
   System.out.println("Please enter the last grade you got on an assignment.");
   x = uI.nextInt();
   
   if (x > 49 && x < 60) {
   
      System.out.println("You received a level 1.");
      
   }
      
   else if (x > 59 && x < 70) {
      
      System.out.println("You received a level 2.");
      
   }
      
   else if (x > 69 && x < 80) {
      
      System.out.println("You received a level 3.");
      
   } 
      
   else if (x > 79 && x < 101) {
      
      System.out.println("You received a level 4.");
      
   }
      
   else {
   
      System.out.println("You failed.");
   
   }

   // --- Program Execution

   // --- Program Output
   
   } // close main ()
   
} // close class FlowToJavaArya
