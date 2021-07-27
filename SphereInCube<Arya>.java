/***********************************************************************
* @Author: Arya Dixit   @Date: 07/05/2021   
* 
* @File Name: SphereInCube<Arya>.java
*
* @Program Description: 
*  This program allows the user to input the length of a cube in which
*  there is a sphere inside, and the program outputs the volume of the 
*  cube, the volume of the sphere, and the volume of the cube minus the
*  sphere inside of it.  
*
************************************************************************/

import java.lang.Math; // import the math class from the java library
import java.util.Scanner; // import the scanner class from the java library

class SphereInCube<Arya> {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int length = 0;
   double volumeSphere = 0.00;
   double volumeCube = 0.00;
   double vCubeWithoutSphere = 0.00;
  
   double radius = 0.00;
   double sphereConstant = 4.0/3.0;
   
   Scanner input = new Scanner (System.in); // Creates the scanner object called input that will accept input from the keyboard

   // --- User Input
   
   System.out.print("Please enter the length of one side of the cube: ");
   length = input.nextInt(); // This will return what is in the scanner object to the variable firstname. If input is empty it will wait for user input.

   // --- Program Execution
   
   radius = length/2d;
   volumeSphere = (sphereConstant)*(Math.PI)*(Math.pow(radius,3));
   volumeCube = Math.pow(length,3);
   vCubeWithoutSphere = volumeCube - volumeSphere;

   // --- Program Output
   
   System.out.printf("The volume of a sphere with a diameter of %d is %.2f units^3.\n",length,volumeSphere);
   System.out.printf("The volume of a cube with a side length of %d is %.2f units^3.\n",length,volumeCube);
   System.out.printf("The volume of the cube minus the displaced volume of the sphere is %.2f units^3.",vCubeWithoutSphere);
   
   } // close main ()
   
} // close class SphereInCube<Arya>