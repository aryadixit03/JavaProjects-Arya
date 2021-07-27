/***************************************************
* @Author: Arya Dixit   @Date: 10/04/2021
* 
* @File Name: GradeAverageCalculator<Arya>.java
*
* @Program Description
* This program lets the user input their % mark for
* 3 tests and the output displays their average 
* rounded to 2 decimal points.  
*
****************************************************/

import javax.swing.JOptionPane;
import javax.swing.JFrame;

class GradeAverageCalculator<Arya> { //begin class
   public static void main (String [] arg) {//begin main() method
   
   //--Variable Declaration and Initialization
      String test1 = JOptionPane.showInputDialog("Please input mark for test 1:");
      String test2 = JOptionPane.showInputDialog("Please input mark for test 2:");
      String test3 = JOptionPane.showInputDialog("Please input mark for test 3:");
   //--Conversions--
   //use of the wrapper class Integer to convert a string to int
      int num1=Integer.parseInt(test1);
      int num2=Integer.parseInt(test2);
      int num3=Integer.parseint(test3);
      
   //-- Dialog box creation and solution display--
      JFrame frame = new JFrame();
      JOptionPane.showInternalMessageDialog(frame.getContentPane());
         String.format("Average=%.2F",(num1+num2+num3)/3.0);
         
   }// end main() method
}// end GradeAverageCalculator<Arya>