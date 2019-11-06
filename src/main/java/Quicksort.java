public class Quicksort {
    /**
     * Sort
     *
     * @param array unsorted array
     * @param a start
     * @param b end
     * @param <T> comparable
     */
    public static <T extends Comparable<T>> void sort(T[] array, int a, int b) {
        if (a < b) {
            int i = a;
            int j = b;
            int middle = (i + j) / 2;
            T pivot = getMedianOfThree(array[i], array[middle], array[j]);

            while (i <= j) {
                while (array[i].compareTo(pivot) < 0)
                    i++;
                while (pivot.compareTo(array[j]) < 0)
                    j--;
                if (i <= j) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    i++;
                    j--;
                }
            }

            sort(array, a, j);
            sort(array, i, b);
        }
    }

    /**
     * Get median of three
     *
     * @param first
     * @param middle
     * @param last
     * @param <T>
     * @return the median
     */
    private static <T extends Comparable<T>> T getMedianOfThree(T first, T middle, T last) {
        if (first.compareTo(middle) > 0) {
            if (middle.compareTo(last) > 0) {
                return middle;
            } else if (first.compareTo(last) > 0) {
                return last;
            }
            return first;
        } else {
            if (first.compareTo(last) > 0) {
                return first;
            } else if (middle.compareTo(last) > 0) {
                return last;
            }
            return middle;
        }
    }
}
