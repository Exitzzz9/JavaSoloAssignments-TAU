package individual_assignments;
/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 */

import java.util.Random;

public class RollDieGame {
    public static void main(String[] args) {

        int numOfAttempts = 5;
        int boardSpace = 20;
        int space = 0;
        int boardSpaceLeft = 0;


        for (int i = 0; i < numOfAttempts; i++ ) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            space += die;
            boardSpaceLeft = boardSpace - space;
            System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + space + " and have " + boardSpaceLeft + " more to go.");
        }

        if (boardSpaceLeft > boardSpace || boardSpaceLeft < boardSpace) {
            System.out.println("You've lost!");
        }
        else {
            System.out.println("You've won!");
        }
    }
}
