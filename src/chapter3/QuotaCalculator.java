package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 * short - неполный, недостаточный
       COMMON PLAN:
  //Initialize values we know

  //Get unknown values

  //Make a decision on the path to take - Output
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if (sales >= quota) {
            System.out.println("Congratulations! You made tha plan of sales, You earned the 250$ bonus!");
        } else {
            int salesShort = quota - sales;
            System.out.println("Sorry, you didn't make your quota. You were " + salesShort + " sales short.");
        }
    }
}
