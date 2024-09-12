package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheLargestNumberTest {
    @Test
    public void testFindTheLargestNumberExist() {
        int[] arr = {};
        int largestNumber = FindTheLargestNumber.largestNumber(arr);
    }

    @Test
    public void testIfTheLargestNumberIs10() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int largestNumber = FindTheLargestNumber.largestNumber(arr);
        assertEquals(10, largestNumber);
    }
}
