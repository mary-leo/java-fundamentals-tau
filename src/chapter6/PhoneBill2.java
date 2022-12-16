package chapter6;

public class PhoneBill2 {
    int id;
    double baseCoast;
    int allottedMinutes;
    int usedMinutes;


    //default constructor:
    public PhoneBill2() {
        id = 0;
        baseCoast = 10;
        allottedMinutes = 60;
        usedMinutes = 0;
    }

    //id-constructor:
    public PhoneBill2(int id) {
        this.id = id;
        baseCoast = 10;
        allottedMinutes = 60;
        usedMinutes = 0;
    }

    //all-parameters-constructor:
    public PhoneBill2(int id, double baseCoast, int allottedMinutes, int usedMinutes) {
        this.id = id;
        this.baseCoast = baseCoast;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    //getters and setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCoast() {
        return baseCoast;
    }

    public void setBaseCoast(double baseCoast) {
        this.baseCoast = baseCoast;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    //Calculations: overage, tax, total + print

    //Calculation of overage:
    public double calculationOverage() {
        if (usedMinutes <= allottedMinutes) {
            return 0;
        }
        double costOfOneAverageMinute = 0.2;
        return (usedMinutes - allottedMinutes) * costOfOneAverageMinute;
    }

    //Calculation of tax:
    public double calculationTax() {
        double taxRate = 0.13;
        return (baseCoast + calculationOverage()) * taxRate;
    }

    //Calculation of total:
    public double calculationTotal() {
        return baseCoast + calculationOverage() + calculationTax();
    }

    //Print the bill:
    public void printTheBill() {
        System.out.println("THE BILL");
        System.out.println("ID: " + id);
        System.out.println("Base cost: $" + baseCoast);
        System.out.println("Overage Fee: $ " + calculationOverage());
        System.out.println("Tax fee: $ " + calculationTax());
        System.out.println("TOTAL: $ " + calculationTotal());
        System.out.println("-----------------------");
    }
}
