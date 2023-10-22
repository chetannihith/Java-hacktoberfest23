//Here I implement the binary search, with both approch iterative approach and recursive approach.



public class BinarySearch {
    // Iterative Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, right); // Search in the right half
            } else {
                return binarySearchRecursive(arr, target, left, mid - 1); // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        int recursiveResult = binarySearchRecursive(arr, target, 0, arr.length - 1);
        if (recursiveResult != -1) {
            System.out.println("Element found at index (recursive): " + recursiveResult);
        } else {
            System.out.println("Element not found in the array (recursive).");
        }
    }
}
