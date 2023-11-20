package individual_assignments;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {

        // Get the unknown
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like? ");
        double penniesInput = scanner.nextDouble();
        System.out.println("How many nickels would you like? ");
        double nickelsInput = scanner.nextDouble();
        System.out.println("How many dimes would you like? ");
        double dimesInput = scanner.nextDouble();
        System.out.println("How many quarters would you like? ");
        double quartersInput = scanner.nextDouble();

        // The calculation
        double penniesInDollar = penniesInput * 0.01;
        double nickelsInDollar = nickelsInput * 0.05;
        double dimesInDollar = dimesInput * 0.10;
        double quartersInDollar = quartersInput * 0.25;
        int dollar = 1;
        double total = penniesInDollar + nickelsInDollar + dimesInDollar + quartersInDollar;

        /*
        If it's more than one dollar, then you need to tell
        them that it's more than one dollar and how much they went over.

        If it's less than one dollar, tell them how much they went under.
         */
        if (total > dollar) {
            double extraAmount = total - dollar;
            System.out.println("It was more than $1 by " + extraAmount);
        }
        else if (total < dollar) {
            double minusAmount = dollar - total;
            System.out.println("It was less than $1 by " + minusAmount);
        }
        else {
            System.out.print("Yay!You won!");
        }

    }
}

