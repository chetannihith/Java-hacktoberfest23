import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {

  // Function to find maximum element in every sliding window of size k
  public static List<Integer> maxSlidingWindow(int[] nums, int k) {
    List<Integer> result = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return result;
    }

    Deque<Integer> deque = new LinkedList<>();

    for (int i = 0; i < nums.length; i++) {
      if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
        deque.pollFirst();
      }
      while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
        deque.pollLast();
      }
      deque.offerLast(i);
      if (i >= k - 1) {
        result.add(nums[deque.peekFirst()]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
    int k = 3;

    List<Integer> result = maxSlidingWindow(nums, k);
    System.out.println("Maximum elements in each sliding window of size " + k + ": " + result);
  }
}
