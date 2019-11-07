import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BasicTest {
    @Test
    public void test_assert_sorting_outcome_is_correct() {
        Integer[] numbers = new Integer[]{12, 18, 3, 7, 87, 44, 63, 50};

        Quicksort.sort(numbers, 0, numbers.length - 1);

        assertEquals(Arrays.toString(numbers), "[3, 7, 12, 18, 44, 50, 63, 87]");
    }

    @Test
    public void test_check_if_negative_value_is_handled_correctly() {
        Integer[] numbers = new Integer[]{12, 18, 3, 7, 87, 44, 63, -50};

        Quicksort.sort(numbers, 0, numbers.length - 1);

        assertEquals(Arrays.toString(numbers), "[-50, 3, 7, 12, 18, 44, 63, 87]");
    }

    @Test
    public void test_handles_empty_array_correctly() {
        Integer[] numbers = new Integer[]{};

        Quicksort.sort(numbers, 0, numbers.length - 1);

        assertEquals(numbers.length, 0);
        assertEquals(Arrays.toString(numbers), "[]");
    }

    @Test
    public void test_handles_duplicated_values_correctly() {
        Integer[] numbers = new Integer[]{7, 0, 0, 99, 51};

        Quicksort.sort(numbers, 0, numbers.length - 1);

        assertEquals(Arrays.toString(numbers), "[0, 0, 7, 51, 99]");
    }

    @Test
    public <T extends Comparable<T>> void test_returns_correct_median_of_three() {
        Integer[] numbers = new Integer[]{7, 0, 0, 99, 51, 100};

        assertEquals(Quicksort.getMedianOfThree(numbers[0], numbers[3], numbers[5]), numbers[3]);
    }
}