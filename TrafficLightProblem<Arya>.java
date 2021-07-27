/***********************************************************************
* @Author: Arya Dixit   @Date: 18/05/2021   
* 
* @File Name: TrafficLightProblem<Arya>.java
*
* @Program Description: 
*  This program simulates a traffic intersection where you cannot take 
*  rights on a red light on Monday to Friday, and you cannot take lefts 
*  on Saturday and Sunday. The user can input if there is an advance 
*  light (aka protected left light), a green light, if there is 
*  oncoming traffic, and the day of the week in number form (1-7 = Sunday 
*  to Saturday), and the program tells the user whether they can take a 
*  right, a left, go straight, or if they must stop. 
*
************************************************************************/

import java.util.Scanner; // import the scanner class from the java library

class TrafficLightProblem<Arya> {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   // Variables for input
   boolean greenLight;
   boolean oncomingTraffic;
   boolean advanceLight;
   int day;
   
   // Variables for output
   boolean left = true; 
   boolean right = true;
   boolean straight = true;
   boolean stop = true;
   
   //Scanner Variable
   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard

   // --- User Input
   
   System.out.println("This program is a Traffic Intersection Simulation. \nYou cannot take rights on a red light on Monday to Friday, and you cannot take lefts on Saturday and Sunday. \nPlease enter 'true' or 'false' to the following questions, which will ask whether there is an \nAdvance Light (aka protected left), a Green Light, and Oncoming Traffic, \nto see if you can go straight, turn right/left, or if you must stop your car.\n");
   
   System.out.print("Advance Light (write true or false) = ");
   advanceLight = uI.nextBoolean(); // This will return what is in the scanner object to the variable advanceLight. If input is empty it will wait for user input.
   
   System.out.print("Green Light (write true or false)  = ");
   greenLight = uI.nextBoolean(); // This will return what is in the scanner object to the variable greenLight. If input is empty it will wait for user input.

   System.out.print("Oncoming Traffic (write true or false) = ");
   oncomingTraffic = uI.nextBoolean(); // This will return what is in the scanner object to the variable oncomingTraffic. If input is empty it will wait for user input.

   System.out.print("The day of the week is (from 1-7, 1 being Sunday) = ");
   day = uI.nextInt(); // This will return what is in the scanner object to the variable day. If input is empty it will wait for user input.

   // --- Program Execution
   
   // execution if day inputted is a weekday
   if (day >= 1 && day <= 5) { //checks if the day inputted is between the 2nd and 6th day of the week (monday to friday), inclusive.

      if (greenLight == true) { // checks if greenLight variable is true (on a weekday)
         stop = false; 
         right = true; 
         straight = true; 
      } else { // checks if greenLight variable is false (aka if there is a red light) (on a weekday)
         stop = true;
         right = false;
         straight = false;
      }
      
      if (advanceLight == true || (greenLight == true && oncomingTraffic == false)) { // checks if advanceLight variable is true, or if greenLight variable is true and oncomingTraffic variable is false.  (on a weekday)
         stop = false;
         left = true;
      } else { // checks if advanceLight variable is false Or if greenLight variable is false and if oncomingTraffic variable is true. (on a weekday)
         stop = true; 
         left = false;
      }   

   // execution if day inputted is a weekend
   } else if (day == 6 || day == 7) { // checks if the day inputted is the first or last day of the week, meaning if it is Saturday or Sunday. 
   left = false; // sets that left is always false because lefts can never be made on a weekend
   
      if (greenLight == true) { // checks if greenLight variable is true (on a weekend)
         stop = false;
         right = true;
         straight = true;
      } else { // checks if greenLight variable is false (on a weekend)
         stop = true;
         right = false;
         straight = false; 
      } 

  // execution if day inputted is neither a weekday nor a weekend
  } else { 
   System.out.println("This number does not correlate to a day of the week. Try again."); // tells the user that their day of the week is non-existant if they input a number that is less than 1 or greater than 7. 
   } 

   // --- Program Output
   
   System.out.println("==================================="); //prints the border
   System.out.printf("You can make a left = %s \n",left);
   System.out.printf("You can make a right = %s \n",right);
   System.out.printf("You can go straight = %s \n",straight);
   System.out.printf("You must stop = %s",stop);
   
   } // close main ()
   
} // close class TrafficLightProblem<Arya>