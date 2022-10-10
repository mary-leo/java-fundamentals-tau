package chapter4;

//The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
//Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on
//the game board. Here’s the code to do this ((import is java.util.Random):
//                  Random
//        Random random = new Random();
//        int die = random.nextInt(6) + 1;

//After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
//Repeat this 4 additional times, for 5 rolls in total.
//However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
//If they are greater than or less than 20 spaces exactly, they lose.
//Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.

import java.util.Random;

public class RollTheDieHomework {
    public static void main(String[] args) {


        //Initialize
        int numberOfSpaces = 20;
        int maxNumberOfRolls = 5;


        //Game
        System.out.println("You are welcome!");
        int space = 0;
        for (int i = 0; i < maxNumberOfRolls; i++) {

            Random random = new Random();
            int die = random.nextInt(6) + 1;
            space = space + die;

            //rolls 1-4th:
            if (i != maxNumberOfRolls - 1) {
                if (space == numberOfSpaces) {
                    System.out.println("Roll N" + (i + 1) + ": You've rolled a " + die + ". You advanced to space "
                            + space + " Congrats! You win!");
                    break;
                } else if (space > numberOfSpaces) {
                    System.out.println("Roll N" + (i + 1) + ": You've rolled a " + die + ". You're out of space. " +
                            "You lose(");
                    break;
                } else {
                    System.out.println("Roll N" + (i + 1) + ": You've rolled a " + die + ". You advanced to space "
                            + space + " and have " + (numberOfSpaces - space) + " more to go.");
                }
            }

            //rolls 5th:
            if (i == maxNumberOfRolls - 1) {
                if (space == numberOfSpaces) {
                    System.out.println("Roll N" + (i + 1) + ": You've rolled a " + die + ". You advanced to space "
                            + space + "! Congrats! You win!");
                } else if (space > numberOfSpaces) {
                    System.out.println("Roll N" + (i + 1) + ": You've rolled a " + die + ". You're out of space. You lose(");
                } else {
                    System.out.println("Roll N" + (i + 1) + ": You've rolled a " + die + ". You're on space "
                            + space + ". You lose(");
                }
            }
        }
    }
}