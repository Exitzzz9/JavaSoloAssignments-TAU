package individual_assignments;
/*
allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over,
and then a 15% tax on the subtotal.
I want you to create separate methods to calculate the tax,
to calculate the overage fees, and to calculate and print the final total.
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    static double predefinedTax = 0.15;
    static double predefinedCharge = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double basePlan = enterBaseCost();
        int min = enterMinutes();
        double fee = chargeMinutes(min);
        double taxAdded = calculateTax(basePlan, fee);
        calculateFinalCharge(basePlan, fee, taxAdded);
    }
    public static double enterBaseCost () {
        System.out.println("Enter base cost of the plan: ");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }
    public static int enterMinutes() {
        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double chargeMinutes(int minutes) {
        double charge = minutes * predefinedCharge;
        return charge;
    }
    public static double calculateTax(double baseCost, double charge) {
        double tax = (baseCost + charge) * predefinedTax;
        return tax;
    }
    public static void calculateFinalCharge (double baseCost, double charge, double tax) {
        double finalCharge = baseCost + charge + tax;
        System.out.println("The final cost is " + finalCharge);
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", charge));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalCharge));

    }
}
