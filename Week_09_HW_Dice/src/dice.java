/**
* Khiem Trinh
* Professor Durendal
* CS112 Section 88195
* Tuesday 7 PM
* Week 9 Homework - Dice
*/

public class dice
{     
        public static void main(String[] args)
        {
        // A variable that will refer to the dice.
        PairOfDice dice;
        // Number of times the dice have been rolled.
        int rollCount;    
     
        // Create the PairOfDice object.
        dice = new PairOfDice();  
        rollCount = 0;
           
        // Roll the dice until they come up snake eyes.
           
           do
           {
               dice.Throw();
               System.out.println("The dice come up " + dice.getDie1() + " and " + dice.getDie2() + ".");
               rollCount++;
           }
           
           while (dice.getTotal() != 2);
           
           dice.Throw();
           System.out.println("\nThe current value of dice #1 is " + dice.getDie1() + ".");
           System.out.println("The current value of dice #2 is " + dice.getDie2() + ".");
           // Report the number of rolls.
           System.out.print("It took " + rollCount + " rolls to get Snake Eyes!");

           
        } // end main     
}  // end class dice