/**************************************************************************
* @Author: Arya Dixit   @Date: 04/05/2021   
* 
* @File Name: AreaAndVolumeSphereCalculator<Arya>.java
*
* @Program Description: 
*  This program uses Math.PI in its formulas to calculate the surface area
*  and volume of a sphere with the radius that the user can input.
*
***************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class AreaAndVolumeSphereCalculator<Arya> {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   double surfacearea = 0.000;
   double volume = 0.000;
   int radius = 0;
   double volumeconstant = 4.0/3.0;
   
   Scanner input = new Scanner (System.in);

   // --- User Input
   
   System.out.println("Please enter a radius value: ");
   radius = input.nextInt();

   // --- Program Execution
   
   surfacearea = Math.PI*4*radius*radius;
   volume = Math.PI*volumeconstant*radius*radius*radius;
      
   // --- Program Output

   System.out.printf("A sphere with radius %d has \nsurface area %.3f squared cm and volume %.3f cubic cm.",radius,surfacearea,volume);   
   
   } // close main ()
   
} // close class AreaAndVolumeSphereCalculator<Arya>

