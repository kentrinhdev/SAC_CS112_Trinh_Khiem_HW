/**
* Khiem Trinh
* Professor Durendal
* CS112 Section 88195
* Tuesday 7 PM
* Week 7 Homework - RockPaperScissors GUI with RandomNumber Class
* Rules: Rock beats Scissors / Scissors beats Paper / Paper beats Rock
*/

import javax.swing.JOptionPane;

public class rps
{
       public static void main(String[] args)
       {
                            // 1 = Rock, 2 = Paper, 3 = Scissors

                            // Rock smashes Scissors: 1 beats 3 and 1 loses to 2.
                            // If cpu plays 1=Rock, and player plays 1=Rock then it's a draw.
                            // If cpu plays 1=Rock, and player plays 2=Paper then Player wins.
                            // If cpu plays 1=Rock, and player plays 3=Scissors then CPU wins.

                            // Scissors cuts Paper: 3 beats 2 and 3 loses to 1.
                            // If cpu plays 2=Paper, and player plays 1=Rock then CPU wins.
                            // If cpu plays 2=Paper, and player plays 2=Paper then it's a draw.
                            // If cpu plays 2=Paper, and player plays 3=Scissors then Player wins.            

                            // Paper covers Rock: 2 beats 1 and 2 loses to 3.
                            // If cpu plays 3=Scissors, and player plays 1=Rock then Player wins.
                            // If cpu plays 3=Scissors, and player plays 2=Paper then CPU wins.
                            // If cpu plays 3=Scissors, and player plays 3=Scissors then it's a draw.

                            RandomNumber cpuInt = new RandomNumber();

                            int count = 0;
                            int winCount = 0;
                            int loseCount = 0;
                            int drawCount = 0;
                            String computerMove = "";
                            int playerInt = 1;
                            String playerMove = "";
                            String answer = "";

                            do
                            {
                                   do
                                   {
                                         count++;
                                         cpuInt.setANumber();

                                         if (cpuInt.getANumber() == 1)
                                         {
                                                computerMove = "Rock";
                                                JOptionPane.showMessageDialog( null, "Round " + count );
                                                JOptionPane.showMessageDialog( null, "The computer's move is " + computerMove );
                                         }
                                         else if (cpuInt.getANumber() == 2)
                                         {
                                                computerMove = "Paper";
                                                JOptionPane.showMessageDialog( null, "Round " + count );
                                                JOptionPane.showMessageDialog( null, "The computer's move is " + computerMove );
                                         }
                                         else if (cpuInt.getANumber() == 3)
                                         {
                                                computerMove = "Scissors";
                                                JOptionPane.showMessageDialog( null, "Round " + count );
                                                JOptionPane.showMessageDialog( null, "The computer's move is " + computerMove );
                                         }

// Player Move --------------------------------------------------------------------------------------------------                                       

                                         playerMove = JOptionPane.showInputDialog( "Enter you move. 1 = Rock or 2 = Paper or 3 = Scissors: " );
                                         playerInt = Integer.parseInt(playerMove);

                                         if (playerInt == 1)
                                         {
                                           playerInt = 1;
                                                JOptionPane.showMessageDialog( null, "Your move is Rock." );
                                         }
                                         else if (playerInt == 2)
                                         {
                                            playerInt = 2;
                                                JOptionPane.showMessageDialog( null, "Your move is Paper." );
                                         }
                                         else if (playerInt == 3)
                                         {
                                            playerInt = 3;
                                                JOptionPane.showMessageDialog( null, "Your move is Scissors." );
                                         }

// CPU Plays Rock --------------------------------------------------------------------------------------------------

                                         if (cpuInt.getANumber() == 1 && playerInt == 1)
                                         {
                                            JOptionPane.showMessageDialog( null, "Rock matches " + computerMove + ". It's a draw.\n" );
                                            drawCount++;
                                         }
                                         else if (cpuInt.getANumber() == 1 && playerInt == 2)
                                         {
                                            JOptionPane.showMessageDialog( null, "Paper covers " + computerMove + ". You Win!\n" );
                                            winCount++;
                                         }                  
                                         else if (cpuInt.getANumber() == 1 && playerInt == 3)
                                         {
                                            JOptionPane.showMessageDialog( null, computerMove + " smashes Scissors. The CPU Wins!\n" );
                                            loseCount++;
                                         }    

// CPU Plays Paper --------------------------------------------------------------------------------------------------

                                         if (cpuInt.getANumber() == 2 && playerInt == 1)
                                         {
                                            JOptionPane.showMessageDialog( null, computerMove + " covers Rock. The CPU Wins!\n" );
                                            loseCount++;
                                         }
                                         else if (cpuInt.getANumber() == 2 && playerInt == 2)
                                         {
                                            JOptionPane.showMessageDialog( null, "Paper matches " + computerMove + ". It's a draw.\n" );
                                            drawCount++;
                                         }                  
                                         else if (cpuInt.getANumber() == 2 && playerInt == 3)
                                         {
                                            JOptionPane.showMessageDialog( null, "Scissors cut " + computerMove + ". You Win!\n" );
                                            winCount++;
                                         }

// CPU Plays Scissors ------------------------------------------------------------------------------------------------

                                         if (cpuInt.getANumber() == 3 && playerInt == 1)
                                         {
                                            JOptionPane.showMessageDialog( null, "Rock smashes Scissors. You Win!\n" );
                                            winCount++;
                                         }
                                         else if (cpuInt.getANumber() == 3 && playerInt == 2)
                                         {
                                            JOptionPane.showMessageDialog( null, computerMove + " cut Paper. The CPU Wins!\n" );
                                            loseCount++;
                                         }                  
                                         else if (cpuInt.getANumber() == 3 && playerInt == 3)
                                         {
                                            JOptionPane.showMessageDialog( null, "Scissors match Scissors. It's a draw.\n" );
                                            drawCount++;
                                         }

                                   } // end inside loop

                                         while (playerInt != cpuInt.getANumber());
                                                JOptionPane.showMessageDialog( null, "Your move matches the computer's move. There is no winner." );            
                                                answer = JOptionPane.showInputDialog( "Do you want to play again? Enter Y or N: " );
                            } // end outside loop   

                            while(answer.equalsIgnoreCase("Y"));
                            JOptionPane.showMessageDialog( null, "Total Rounds:  " + count +
                                                                  "\nTotal Score:\n    Win = " + winCount + "\n    Lose = " + loseCount + "\n    Draw = " + drawCount);
                            JOptionPane.showMessageDialog( null, "Thank you for playing Rock-Paper-Scissors. Good-Bye!" );

       } //main
} //class