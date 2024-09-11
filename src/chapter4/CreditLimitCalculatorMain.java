package chapter4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CreditLimitCalculatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber = 0;
        int beginningBalance = 0;
        int itemsCharged = 0;
        int credits = 0;
        int allowedCreditLimits = 0;
        try {
            System.out.print("Enter account number: ");
            accountNumber = input.nextInt();

            System.out.print("Enter beginning balance: ");
            beginningBalance = input.nextInt();

            System.out.print("Enter itemsCharged ");
            itemsCharged = input.nextInt();

            System.out.print("Enter credits: ");
            credits = input.nextInt();

            System.out.print("Enter allowedCreditLimits: ");
            allowedCreditLimits = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.printf("Exception error: %s\n", e);
            input.nextLine();
            System.out.println("You must input a Integer(number)");
        }
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(accountNumber, beginningBalance, itemsCharged, credits, allowedCreditLimits);
        double newBalance = creditLimitCalculator.getNewBalance();
        if (newBalance > allowedCreditLimits) {
            System.out.printf("New Balance: %.2f %s", newBalance, "Credit limit not exceeded.");
        }
        else{
            System.out.printf("New Balance: %.2f %s", newBalance, "Credit limit exceeded.");
        }

//        int newBalance = beginningBalance + itemsCharged - credits;
//        System.out.printf("This is the new balance %d%n", newBalance);
    }
}
