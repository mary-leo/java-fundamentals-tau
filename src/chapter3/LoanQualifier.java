package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        //Initialize values we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get unknown values
        System.out.println("How much the candidate earns?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years employee works in own place?");
        double yearsEmployed = scanner.nextDouble();
        scanner.close();

        //Make a decision on the path to take - Output

        if (salary >= requiredSalary) {
            if (yearsEmployed >= requiredYearsEmployed) {
                System.out.println("The loan approved");
            } else {
                System.out.println("The loan is not approved. The candidate must have " +
                        "worked at owns current job at least " + requiredYearsEmployed + " years");
            }
        } else {
            if (yearsEmployed >= requiredYearsEmployed) {
                System.out.println("The loan is not approved. The candidate must have earned" +
                        " at least " + requiredSalary + " $ per year");
            } else {
                System.out.println("The loan is not approved. The candidate must have earned" +
                        " at least " + requiredSalary + " $ per year and worked at owns current job at least " +
                        requiredYearsEmployed + " years");
            }
        }
    }
}
