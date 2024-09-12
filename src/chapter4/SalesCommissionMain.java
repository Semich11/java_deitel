package chapter4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SalesCommissionMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalValue = 0.0;

        try {
            double value = 0.0;

            boolean flag = true;

            while (flag) {
                totalValue += value;
                System.out.print("Enter merchandise price or -1 to quit and get the commission: ");
                value = input.nextDouble();

                if (value < -1) {
                    System.out.println("Merchandise price cannot be negative \nStart over again");
                    System.exit(0);

                }

                if (value == -1) {
                    flag = false;
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You must enter a valid integer(number).");
            System.err.printf("Exception error: %s\n", e);
            System.exit(1);
        }
        double salesPersonEarning = SalesCommission.salesPersonEarning(totalValue);
        System.out.println(salesPersonEarning);
    }
}
