package chapter3;

/** HOMEWORK CONCLUSION OF 3RD CHAPTER
The objective of the game is to enter enough change to equal exactly $1!
Create a program that asks a user to enter the quantities for the following coins:
pennies, nickels, dimes, and quarters. Your program should count up the value of
all the change. If it's exactly $1, they win! If it's more than $1, tell them by
how much they went over. If it's less than $1, tell them by how much they went under.
 */

import java.util.Scanner;

public class DollarGameHomework {

    public static void main(String[] args) {

        //Initialize values we know
        System.out.println("The objective of the game is to enter enough change to equal exactly $1!\n" +
                "This program  asks you to enter the quantities for the following coins:\n" +
                "pennies, nickels, dimes, and quarters. The program should count up the value of\n" +
                "all the change. If it's exactly $1, you win!\n" +
                "Please, enter how much pennies you want to collect:");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();

        System.out.println("Please, enter how much nickels you want to collect:");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Please, enter how much dimes you want to collect:");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Please, enter how much quarters you want to collect:");
        int numberOfQuarters = scanner.nextInt();
        scanner.close();

        //Get unknown values
        int totalPennies = numberOfPennies + 5 * numberOfNickels + 10 * numberOfDimes + 25 * numberOfQuarters;
        int dollar = 100;
        String message;

        //Make a decision on the path to take - Output
        if (totalPennies == dollar) {
            System.out.println("You win!");
        } else if (totalPennies > dollar) {
            System.out.println("You lose. You collected " + totalPennies / dollar + " dollars and " +
                    (totalPennies % dollar) + " pennies more than you needed");
        } else {
            System.out.println("YO]ou lose. You collected " + (dollar - totalPennies) + " pennies less than you needed");
        }
    }
}
