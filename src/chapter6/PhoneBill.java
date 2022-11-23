package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private double numberOfAllottedMinutes;
    private double numberOfUsedMinutes;
    private double costOfOneAverageMinute;
    private double taxPercent;

    //default constructor:
    public PhoneBill() {
        id = 0;
        baseCost = 0;
        numberOfAllottedMinutes = 0;
        numberOfUsedMinutes = 0;
        costOfOneAverageMinute = 0;
        taxPercent = 0;

    }

    //constructor that accepts the ID only:
    public PhoneBill(int id) {
        this.id = id;
        baseCost = 0;
        numberOfAllottedMinutes = 0;
        numberOfUsedMinutes = 0;
        costOfOneAverageMinute = 0;
        taxPercent = 0;
    }

    //constructor that accepts all fields:
    public PhoneBill(int id, double baseCost, double numberOfAllottedMinutes, double numberOfUsedMinutes,
                     double costOfOneAverageMinute, double taxPercent) {
        this.id = id;
        this.baseCost = baseCost;
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
        this.numberOfUsedMinutes = numberOfUsedMinutes;
        this.costOfOneAverageMinute = costOfOneAverageMinute;
        this.taxPercent = taxPercent;
    }

    //getters:

    public double getBaseCost() {
        return baseCost;
    }

    public double getNumberOfAllottedMinutes() {
        return numberOfAllottedMinutes;
    }

    public double getNumberOfUsedMinutes() {
        return numberOfUsedMinutes;
    }

    public double getCostOfOneAverageMinute() {
        return costOfOneAverageMinute;
    }

    public double getTaxPercent() {
        return taxPercent;
    }


    //calculations:
    public double countPaymentForOverageMinutes(double numberOfAllottedMinutes, double numberOfUsedMinutes,
                                                double costOfOneAverageMinute) {
        double numberOfOverageMinutes;
        if (numberOfAllottedMinutes - numberOfUsedMinutes < 0) {
            numberOfOverageMinutes = numberOfUsedMinutes - numberOfAllottedMinutes;
        } else {
            numberOfOverageMinutes = 0;
        }
        return numberOfOverageMinutes * costOfOneAverageMinute;
    }

    public double countOfTax(double planCost, double paymentForOverageMinutes, double taxPercent) {
        return (planCost + paymentForOverageMinutes) * taxPercent;
    }

    public double countTheTotal(double planCost, double paymentForOverageMinutes, double amountOfTax) {
        return planCost + paymentForOverageMinutes + amountOfTax;
    }

    //print the bill
    public void printTheBill(double planCost, double paymentForOverageMinutes,
                             double amountOfTax, double taxPercent, double total) {
        System.out.println("                    THE BILL\n" +
                "----------------------------------------------" + "\n" +
                "The plan costs $" + planCost + "\n" +
                "Payment for overage minutes is $" + paymentForOverageMinutes + "\n" +
                "       One overage minute costs $" + costOfOneAverageMinute + "\n" +
                "Tax is $" + amountOfTax + "\n" +
                "       Tax per sent is " + taxPercent * 100 + "%" + "\n" +
                "----------------------------------------------" + "\n" +
                "                               TOTAL $" + total);
    }
}
