/*************************************************************************
* @Author: Arya Dixit   @Date: 28/05/2021   
* 
* @File Name: RockPaperScissorsArya.java
*
* @Program Description: 
*  This program plays rock paper scissors and the match ends when either the 
*  user or the computer wins 2 more games/points that the other, and the user 
*  can decide if they want to play another match. In other words, it is a 
*  best out of 3 Rock Paper Scissors game. 
*
******************************************************************************/

import java.lang.Math;  // import the math class from the java library
import java.util.Scanner; // import the scanner class from the java library

class RockPaperScissorsArya {
   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
   int userWins = 0; // number of times the user has won
   int compWins = 0; // number of times the computer has won
   int play = 0; // user input
   int comp = 0; // computer input
   int gamesPlayed = 0; // number of games played in a match
   
   String again = "";
   
   boolean playAgain;
   
   String userName = " ";

   Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.

   // --- User Input, Program Execution, and Program Output
   
   System.out.printf( "Welcome to Rock Paper Scissors. \nYou will be competing against the computer. \nTo play, rock beats scissors, scissors beats paper, and paper beats rock. \nThe value 1 is Rock, 2 is Paper, and 3 is Scissors. \nPlease input one of these integers to play one of them, and if you win, you win a game and get a point. \nYou must win by two games/points to win a match, and a tie does not count as a round. \nGood luck!\n");
   
   System.out.println("\nPlease enter your full name: ");
   userName = uI.nextLine(); //allows user to input name
   System.out.printf("\nHi %s!",userName);
      
   do { 
    
      do {
      
         System.out.printf("\nPlease enter 1 2 or 3 (aka Rock, Paper, or Scissors): ");
            while (!uI.hasNextInt()) //checks if the input is an integer
            { 
               System.out.println("You did not enter an integer as a play. Please play again."); // checks if user put a valid input
               uI.next(); // moves the scanner input into the next token
            } 
      
         play = uI.nextInt(); // takes user input for user play 
         if (play < 1 || play > 3) { // checks if number inputted is not a play that corresponds to rock paper or scissors
            System.out.println("That number is not 1, 2, or 3, therefore does not correspond to Rock, Paper, or Scissors. Please play again.");
            
         } else { // checks if number IS 1 2 or 3 
            comp = (int)(Math.random()*3+1); // generates random number between 1 and 3
            System.out.println("The computer plays: "+comp); // displays what the computer plays
         }
         
        // Execution and Output Where User Wins
         if ((comp == 1 && play == 2) || (comp == 2 && play == 3) || (comp == 3 && play == 1) ) {
               userWins ++;
               gamesPlayed ++;
               System.out.printf("\nYou win the point! \n");
        // Execution and Output Where User Loses
         } else if ((comp == 1 && play == 3) || (comp == 2 && play == 1) || (comp == 3 && play == 2) ) {
               compWins ++;
               gamesPlayed ++; // adds to the total game count
               System.out.printf("\nThe computer wins the point. \n");
         // Execution and Output Where User is Tied
         } else if (comp == play) { // if tie occurs, game count does not change
               System.out.printf("\nYou tied! Therefore no one gets a point and this does not count as a Game Played. \n");
         }
      
         if (compWins - userWins >= 2) { // if the computer wins by 2 
              System.out.println("\nSorry, but the computer wins this match because they won more games/points than you.");
              System.out.printf("\nYour Final Score: "+userWins+"\nThe Computer's Final Score: "+compWins+"\nTotal Games Played in this Match: "+gamesPlayed+"\n");
         } else if (userWins - compWins >= 2) { // if the user wins by two
              System.out.println("\nCongrats! You won this match because you won more games/points than the computer!.");
              System.out.printf("\nYour Final Score: "+userWins+"\nThe Computer's Final Score: "+compWins+"\nTotal Games Played in this Match: "+gamesPlayed+"\n");
         }
         
      
      } while ( (compWins - userWins < 2) && (userWins - compWins < 2) ); // repeats loop if no one has won by 2.
  
     //  Program asks user if they want to repeat the game
     
      System.out.println("\nDo you want to play again?");
      again = uI.next(); // allows user to input yes or no to play again
      
      while ( !again.equals("no") && !again.equals("yes") ) { // checks if the user did not input the word yes or no
      System.out.println("You did not enter yes or no. Please enter yes or no to indicate if you want to play again or not.");
      again = uI.next();
      }
      
      if (again.equalsIgnoreCase("yes")) { // if the user enters yes to play again (any letter cases allowed)
         userWins = 0; // resets user points to 0
         compWins = 0; // resets computer points to 0
         gamesPlayed = 0; // resets number of games played in a match to 0
         playAgain = true; 
      } else if (again.equalsIgnoreCase("no")) { //if the user enters no to play again (any letter cases allowed)
         System.out.println("Thanks for playing! Good-bye.");
         System.exit(0); // exits program
      } 
         
               
   } while (playAgain = true); // continues the loop if the user wants to play again (aka if they answer yes)
   
  while (playAgain = false) { // if the user does not want to play again, the program ends and exits
       System.exit(0);
  }

 } // close main ()
   
} // close class RockPaperScissorsArya

