package DSA;

/*
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
Return true if there is a 132 pattern in nums, otherwise, return false.

Test Case I:
Input: nums = [1,2,3,4]
Output: false
Explanation: There is no 132 pattern in the sequence.

Test Case II:
Input: nums = [3,1,4,2]
Output: true
Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
 */

import java.util.*;

public class Pattern132{
    private static boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3)
            return false;
        Deque<Integer> decreasingStack = new ArrayDeque<>(n);
        int maxThirdElement = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int currentNumber = nums[i];
            if (currentNumber < maxThirdElement)
                return true;  
            while (!decreasingStack.isEmpty() && decreasingStack.peek() < currentNumber) {
                maxThirdElement = decreasingStack.pop();
            }
            decreasingStack.push(currentNumber);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        boolean result = find132pattern(nums);
        if(result){
            System.out.println("The 132 pattern exixts in an Array");
        }else{
            System.out.println("The 132 pattern does not exixts in an Array");
        }
        sc.close();
    }
}