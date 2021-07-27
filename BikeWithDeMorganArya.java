/*************************************************************************
* @Author: Arya Dixit   @Date: 13/05/2021   
* 
* @File Name: BikeWithDeMorganArya.java
*
* @Program Description: 
* This program lets you know whether or not you can bike with "DeMorgan",
* and/or bike at night, based on whether you have a bike, helmet, or 
* light with you. You must have a bike and helmet to bike with DeMorgan,
* and you must have a bike, helmet, and light to bike at night. The
* program uses DeMorgan's Law. 
*   
**************************************************************************/

import java.util.Scanner;

class BikeWithDeMorganArya {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   Scanner userInput = new Scanner(System.in);
   boolean hasBike;
   boolean hasHelmet;
   boolean hasLight;
   boolean cannotBike;
   boolean cannotBikeDeMorgan;

   // --- User Input
   System.out.println("Do you have a bike? Enter true or false: ");
   hasBike = userInput.nextBoolean();
   System.out.println("Do you have a helmet? Enter true or false: ");
   hasHelmet = userInput.nextBoolean();
   System.out.println("Do you have a helmet or bike light? Enter true or false: ");
   hasLight = userInput.nextBoolean();
   
   // ---Negating an And statement
   cannotBike = !(hasBike && hasHelmet && hasLight);
   cannotBikeDeMorgan = !hasBike || !hasHelmet || !hasLight;

   // --- Program Execution

   // --- Program Output
   if (cannotBike){
      System.out.println("You may not bike at night.");
   }else{
      System.out.println("You may bike at night!");
   }
   if (cannotBikeDeMorgan){
      System.out.println("You may not bike with De Morgan.");
   }else{
      System.out.println("You may bike with De Morgan!");
   }
   
   } // close main ()
   
} // close class BikeWithDeMorganArya