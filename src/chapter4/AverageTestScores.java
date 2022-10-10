package chapter4;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 3;
        int numberOfTests = 3;
        Scanner scanner = new Scanner(System.in);

        //Process all students
        for (int i = 1; i < numberOfStudents + 1; i++) {
            double total = 0;

            for (int j = 1; j < numberOfTests + 1; j++) {
                System.out.println("What is the mark of student N" + i + " for the test N" + j + " ?");

                int mark = scanner.nextInt();
                total = total + mark;
            }

            double average = total / numberOfTests;
            System.out.println("Average mark for student N" + i + " is " + average);
        }

        scanner.close();
    }
}

