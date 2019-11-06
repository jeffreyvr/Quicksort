import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        (new Main()).example();
    }

    /**
     * An example of quick sort.
     */
    public void example() {
        Integer[] numbers = { 12, 18, 3, 7, 87, 44, 63, 50 };

        System.out.println("Un-sorted: " + Arrays.toString(numbers));

        // Do the sorting
        Quicksort.<Integer>sort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}