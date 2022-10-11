package chapter5;

/**
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
//можно ли называт переменные в аргументах и параметрах методов одинаково? да
// Какие здесь бест-практис? стобы было удобно читать и понимать
//Преподка говорит и так и так можно. правильно

import java.util.Scanner;

public class InstantCreditCheck {

    //Initialize what we know and what we'll use in mer than 1 classes
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean isUserQualified = isUserQualified(salary, creditScore);

        //Notify the user
        notifyUser(isUserQualified);
    }

    public static double getSalary() {
        System.out.println("Enter the candidate's salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter the candidate's credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        } else
            return false;
    }

    public static void notifyUser(boolean isUserQualified) {
        if (isUserQualified) {
            System.out.println("Credit have been approved");
        } else
            System.out.println("Credit have been declined");
    }
}