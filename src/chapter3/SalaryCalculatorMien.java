package chapter3;

/*
If statement. My decision without if statement
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculatorMien {
    public static void main(String[] args) {

        //Initialize known values
        int salary = 1000;
        int bonus = 250;

        //Get values for the unknown
        System.out.println("How many sales did you make?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        System.out.println("How many weeks did you work?");
        int weeks = scanner.nextInt();
        scanner.close();

        //My decision without if statement
        int totalSalary = weeks * salary + bonus * (sales / 10);
        System.out.println("Your salary is " + totalSalary + "$");
    }
}
