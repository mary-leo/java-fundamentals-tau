package chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorOOPHomework {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBillCalculatorOOPHomework calculator = new PhoneBillCalculatorOOPHomework();
        PhoneBill phoneBill = calculator.initializeTheBill();

        //calculations
        double paymentForOverageMinutes = phoneBill.countPaymentForOverageMinutes(phoneBill.getNumberOfAllottedMinutes(),
                phoneBill.getNumberOfUsedMinutes(), phoneBill.getCostOfOneAverageMinute());
        double amountOfTax = phoneBill.countOfTax(phoneBill.getBaseCost(), paymentForOverageMinutes,
                phoneBill.getTaxPercent());
        double total = phoneBill.countTheTotal(phoneBill.getBaseCost(), paymentForOverageMinutes, amountOfTax);

        //print:
        phoneBill.printTheBill(phoneBill.getBaseCost(), paymentForOverageMinutes, amountOfTax,
                phoneBill.getTaxPercent(), total);

        calculator.scanner.close();
    }

    //initialization (enter the variables):
    public PhoneBill initializeTheBill() {

        System.out.println("Enter the id of your bill:");
        int id = scanner.nextInt();

        System.out.println("Enter the plan cost:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter the number of allotted minutes:");
        double numberOfAllottedMinutes = scanner.nextDouble();

        System.out.println("Enter the number of used minutes:");
        double numberOfUsedMinutes = scanner.nextDouble();

        System.out.println("Enter the tax per cent:");
        double taxPercent = scanner.nextDouble();

        System.out.println("Enter the cost of 1 average minute:");
        double costOfOneAverageMinute = scanner.nextDouble();

        return new PhoneBill(id, baseCost, numberOfAllottedMinutes, numberOfUsedMinutes,
                costOfOneAverageMinute, taxPercent);
    }
}
