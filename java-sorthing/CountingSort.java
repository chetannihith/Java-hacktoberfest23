import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        // Find the maximum value in the array
        int max = Arrays.stream(array).max().getAsInt();
        
        // Create a count array
        int[] count = new int[max + 1];

        // Store the count of each number
        for (int num : array) {
            count[num]++;
        }

        // Build the output array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(array));

        countingSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
