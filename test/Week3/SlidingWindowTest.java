package Week3;

import Week3.Day8.SlidingWindow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SlidingWindowTest {

    @Test
    public void kLargest_returnsKLargestElementsInSortedOrder() {
        int[] arr = {1, 5, 6, 9, 3, 2};
        int k = 3;
        int[] expected = {5, 6, 9};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }

    @Test
    public void kLargest_withSingleElement_returnsThatElement() {
        int[] arr = {42};
        int k = 1;
        int[] expected = {42};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }

    @Test
    public void kLargest_withAllElements_returnsAllElementsSorted() {
        int[] arr = {3, 1, 4, 1, 5};
        int k = 5;
        int[] expected = {1, 1, 3, 4, 5};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }

    @Test
    public void kLargest_withNegativeNumbers_returnsKLargest() {
        int[] arr = {-5, -1, -9, -3, 0, 2};
        int k = 3;
        int[] expected = {-1, 0, 2};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }

    @Test
    public void kLargest_withDuplicates_handlesCorrectly() {
        int[] arr = {5, 5, 5, 1, 2, 3};
        int k = 4;
        int[] expected = {3, 5, 5, 5};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }

    @Test
    public void kLargest_withKEqualsOne_returnsLargestElement() {
        int[] arr = {10, 20, 5, 15, 30};
        int k = 1;
        int[] expected = {30};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }

    @Test
    public void kLargest_withSortedArray_returnsLastKElements() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int[] expected = {3, 4, 5};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }

    @Test
    public void kLargest_withReverseSortedArray_returnsKLargest() {
        int[] arr = {5, 4, 3, 2, 1};
        int k = 2;
        int[] expected = {4, 5};
        assertArrayEquals(expected, SlidingWindow.kLargest(arr, k));
    }
}
