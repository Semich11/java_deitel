package chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GasMileageMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles = 0;
        int gallons = 0;

//        System.out.print("Enter miles driven or -1: ");
//        int milesDriven = input.nextInt();
//
//        System.out.print("Enter gallon used or -1: ");
//        int gallonsUsed = input.nextInt();

        boolean sentinelValue = true;
        int milesDriven = 0;
        int gallonsUsed = 0;

        while(sentinelValue){
            try {
                miles += milesDriven;
                gallons += gallonsUsed;


                System.out.print("Enter miles driven or -1: ");
                milesDriven = input.nextInt();
                if (milesDriven == -1) break;

                System.out.print("Enter gallon used or -1: ");
                gallonsUsed = input.nextInt();

                if (gallonsUsed == -1 || milesDriven == -1) {
                    sentinelValue = false;
                }
            }
            catch (InputMismatchException e){
                System.err.printf("Exception %s%n", e);
                input.nextLine();
                System.out.printf("You must enter Integer, please try again.%n%n");
            }
            catch (ArithmeticException e){
                System.err.printf("Exception %s%n", e);
                System.out.printf("Zero is an invalid denominator. please try again.%n%n");
            }
        }
        System.out.println(milesDriven + " : " + gallonsUsed);

        GasMileage gasMileage = new GasMileage();
        gasMileage.calculateMileage(miles,gallons);
        double totalMileage = gasMileage.getOverAllGasMileage();
        System.out.println(totalMileage);
    }
}
