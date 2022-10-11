package chapter3;

/**
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]) {

        //Initialize values we know GET THE TEST SCORE
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();


        //Get unknown values DETERMINE THE LETTER GRADE
        char grade;

        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        //Make a decision on the path to take - Output
        System.out.println("Your grade is " + grade);
    }
}
