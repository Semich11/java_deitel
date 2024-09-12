package chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindTheLargestNumberMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int[] arr = new int[10];
        while (counter < 10) {

            try {
                System.out.print("Enter a number: ");
                int number = input.nextInt();
                arr[counter] = number;
                counter++;

            } catch (InputMismatchException e) {
                System.err.printf("Exception occurred: %s\n", e);
                input.nextLine();
                System.out.println("You must input only integer(number)");
            }

            int largestNumber = FindTheLargestNumber.largestNumber(arr);
            System.out.println("Largest number is: " + largestNumber);
        }
    }
}
