package chapter4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TaxCalculatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yourIncome = 0.0;
        try{
            System.out.println("Enter your yearly income: ");
            yourIncome = input.nextDouble();
        }
        catch(InputMismatchException e){
            System.err.printf("Exception: %s\n", e);
            System.out.println("You input the wrong value, run the program again");
            System.exit(1);
        }
        TaxCalculator taxCalculator = new TaxCalculator();
        double totalTax = taxCalculator.calculate(yourIncome);
        System.out.println("Your total tax is " + totalTax);
    }
}
