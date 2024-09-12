package chapter4;

public class FindTheLargestNumber {
    public static int largestNumber(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
}
