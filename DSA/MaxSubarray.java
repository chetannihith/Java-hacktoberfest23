public class MaxSubarray {

    public static int MaxSubarraySum(int[] array) {
        int maxEnding = array[0];
        int maxSoFar = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEnding = Math.max(array[i], maxEnding + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }

        return maxSoFar;
    }

    public static int[] MaxSubarrayIndices(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxEndingHere + array[i]) {
                maxEndingHere = array[i];
                tempStart = i;
            } else {
                maxEndingHere += array[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        return new int[]{start, end};
    }

    public static void displayMaxSubarray(int[] array, int start, int end) {
        System.out.print("Maximum Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] array = {-8, 6, -2, 4, -7, 1, 7, -9, 10};
        int maxSum = MaxSubarraySum(array);
        int[] subarrayIndices = MaxSubarrayIndices(array);

        System.out.println("Maximum Subarray Sum: " + maxSum);
        displayMaxSubarray(array, subarrayIndices[0], subarrayIndices[1]);
    }
}
