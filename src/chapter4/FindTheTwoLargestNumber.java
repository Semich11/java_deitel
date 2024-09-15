package chapter4;

import java.util.Arrays;

public class FindTheTwoLargestNumber {

    public static int[] twoLargestNumber(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = 0;
        int[] returnArray = new int[2];
        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                returnArray[0] = secondLargest;
                largest = number;
                returnArray[1] = largest;
            }
            else if (number > secondLargest) {
                secondLargest = number;
                returnArray[0] = secondLargest;
            }

        }
        return returnArray;
    }
}
