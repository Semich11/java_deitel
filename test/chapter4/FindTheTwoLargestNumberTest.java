package chapter4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheTwoLargestNumberTest {
    @Test
    @DisplayName("Test That Find The Two Largest Number Exist")
    public void TestThatFindTheTwoLargestNumberExist() {
        int[] arr = {1,2,3,4,5};
        int[] theTwoLargestNumber = FindTheTwoLargestNumber.twoLargestNumber(arr);
    }

    @Test
    @DisplayName("Test That Find The Two Largest Number Return Expected Array")
    public void TestThatFindTheTwoLargestNumberReturnExpectedArray() {
        int[] arr = {1,5,3,7,2,6,0};
        int[] expected = {6,7};
        int[] theTwoLargestNumber = FindTheTwoLargestNumber.twoLargestNumber(arr);
        assertArrayEquals(new int[] {6,7}, theTwoLargestNumber);
    }
}
