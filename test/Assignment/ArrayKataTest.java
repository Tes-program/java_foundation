package Assignment;

import Day3.Assignment.ArrayKata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayKataTest {

    @Test
    public void maximumIn_returnsLargestNumber() {
        int[] numbers = {3, 1, 4, 1, 5};
        assertEquals(5, ArrayKata.maximumIn(numbers));
    }

    @Test
    public void minimumIn_returnsSmallestNumber() {
        int[] numbers = {3, 1, 4, 1, 5};
        assertEquals(1, ArrayKata.minimumIn(numbers));
    }

    @Test
    public void sumOf_returnsSumOfAllNumbers() {
        int[] numbers = {3, 1, 4, 1, 5};
        assertEquals(14, ArrayKata.sumOf(numbers));
    }

    @Test
    public void sumOfEvenNumbersIn_returnsSumOfEvenNumbers() {
        int[] numbers = {3, 1, 4, 1, 5, 6};
        assertEquals(10, ArrayKata.sumOfEvenNumbersIn(numbers));
    }

    @Test
    public void sumOfOddNumbersIn_returnsSumOfOddNumbers() {
        int[] numbers = {3, 1, 4, 1, 5, 6};
        assertEquals(10, ArrayKata.sumOfOddNumbersIn(numbers));
    }

    @Test
    public void maximumAndMinimumOf_returnsMinAndMax() {
        int[] numbers = {3, 1, 4, 1, 5};
        int[] result = {1, 5};
        assertArrayEquals(result, ArrayKata.maximumAndMinimumOf(numbers));
    }

    @Test
    public void noOfOddNumbersIn_returnsCountOfOddNumbers() {
        int[] numbers = {3, 1, 4, 1, 5, 6};
        assertEquals(4, ArrayKata.noOfOddNumbersIn(numbers));
    }

    @Test
    public void noOfEvenNumbersIn_returnsCountOfEvenNumbers() {
        int[] numbers = {3, 1, 4, 1, 5, 6};
        assertEquals(2, ArrayKata.noOfEvenNumbersIn(numbers));
    }

    @Test
    public void evenNumbersIn_returnsOnlyEvenNumbers() {
        int[] numbers = {3, 1, 4, 1, 5, 6};
        int[] expected = {4, 6};
        assertArrayEquals(expected, ArrayKata.evenNumbersIn(numbers));
    }

    @Test
    public void oddNumbersIn_returnsOnlyOddNumbers() {
        int[] numbers = {3, 1, 4, 1, 5, 6};
        int[] expected = {3, 1, 1, 5};
        assertArrayEquals(expected, ArrayKata.oddNumbersIn(numbers));
    }

    @Test
    public void squareNumbersIn_returnsOnlySquareNumbers() {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 25, 16, 7};
        int[] expected = {1, 4, 1, 9, 25, 16};
        assertArrayEquals(expected, ArrayKata.squareNumbersIn(numbers));
    }
}