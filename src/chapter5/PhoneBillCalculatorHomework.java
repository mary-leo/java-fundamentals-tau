package chapter5;

/**
*         Calculate the final total of someone's cell phone bill.
*        Allow the operator to input the plan fee and the number of overage minutes.
*        Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
*        Create separate methods to calculate the tax, overage fees, and final total.
*        Print the itemized bill.
 */

import java.util.Scanner;

public class PhoneBillCalculatorHomework {
    static Scanner scanner = new Scanner(System.in);
    static double costOfOneAverageMinute = 0.25;
    static double taxPersent = 0.15;

    public static void main(String[] args) {

        double planCost = enterThePlanCost();
        double numberOfOverageMinutes = enterNumberOfOverageMinutes();
        scanner.close();

        double paymentForOverageMinutes = countPaymentForOverageMinutes(numberOfOverageMinutes);
        double amountOfTax = countOfTax(planCost, paymentForOverageMinutes);
        double total = countTheTotal(planCost, paymentForOverageMinutes, amountOfTax);

        printTheBill(planCost, numberOfOverageMinutes, paymentForOverageMinutes, amountOfTax, total);
    }

    public static double enterThePlanCost() {
        System.out.println("Enter the plan cost:");
        return scanner.nextDouble();
    }

    public static double enterNumberOfOverageMinutes() {
        System.out.println("Enter number of overage minutes:");
        return scanner.nextDouble();
    }

    public static double countPaymentForOverageMinutes(double numberOfOverageMinutes) {
        return numberOfOverageMinutes * costOfOneAverageMinute;
    }

    public static double countOfTax(double planCost, double paymentForOverageMinutes) {
        return (planCost + paymentForOverageMinutes) * taxPersent;
    }

    public static double countTheTotal(double planCost, double paymentForOverageMinutes, double amountOfTax) {
        return planCost + paymentForOverageMinutes + amountOfTax;
    }

    public static void printTheBill(double planCost, double numberOfOverageMinutes,
                                    double paymentForOverageMinutes, double amountOfTax, double total) {
        System.out.println("                    THE BILL\n" +
                "----------------------------------------------" + "\n" +
                "The plan costs $" + planCost + "\n" +
                "Payment for overage minutes is $" + paymentForOverageMinutes + "\n" +
                "       The number of overage minutes is: " + numberOfOverageMinutes + "\n" +
                "       One overage minute costs $" + costOfOneAverageMinute + "\n" +
                "Tax is $" + amountOfTax + "\n" +
                "       Tax per sent is " + taxPersent * 100 + "%" + "\n" +
                "----------------------------------------------" + "\n" +
                "                               TOTAL $" + total);
    }
}
