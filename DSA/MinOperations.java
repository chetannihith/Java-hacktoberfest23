package DSA;

/*
Minimum Number of Operations to Make Array Continuous
You are given an integer array nums. In one operation, you can replace any element in nums with any integer.
nums is considered continuous if both of the following conditions are fulfilled:
-> All elements in nums are unique.
-> The difference between the maximum element and the minimum element in nums equals nums.length - 1.
-> For example, nums = [4, 2, 5, 3] is continuous, but nums = [1, 2, 3, 5, 6] is not continuous.
Return the minimum number of operations to make nums continuous.
Test Case I:
Input: nums = [4,2,5,3]
Output: 0
Explanation: nums is already continuous.
Test Case II:
Input: nums = [1,2,3,5,6]
Output: 1
Explanation: One possible solution is to change the last element to 4.
The resulting array is [1,2,3,5,4], which is continuous.
Test Case III:
Input: nums = [1,10,100,1000]
Output: 3
Explanation: One possible solution is to:
- Change the second element to 2.
- Change the third element to 3.
- Change the fourth element to 4.
The resulting array is [1,2,3,4], which is continuous.
 
Constraints:
1 <= nums.length <= 10^5
1 <= nums[i] <= 10^9
 */

 import java.util.*;

 public class MinOperations{
 
     private static int minOperations(int[] nums) {
         int n = nums.length;
         int ans = n;
 
         HashSet<Integer> unique = new HashSet<>();
         for (int num : nums) {
             unique.add(num);
         }
 
         int[] newNums = new int[unique.size()];
         int index = 0;
 
         for (int num : unique) {
             newNums[index++] = num;
         }
 
         Arrays.sort(newNums);
 
         for (int i = 0; i < newNums.length; i++) {
             int left = newNums[i];
             int right = left + n - 1;
             int j = binarySearch(newNums, right);
             int count = j - i;
             ans = Math.min(ans, n - count);
         }
 
         return ans;
     }
 
     private static int binarySearch(int[] newNums, int target) {
         int left = 0;
         int right = newNums.length;
 
         while (left < right) {
             int mid = (left + right) / 2;
             if (target < newNums[mid]) {
                 right = mid;
             } else {
                 left = mid + 1;
             }
         }
 
         return left;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array: ");
         int n = sc.nextInt();
         int[] nums = new int[n];
         System.out.println("Enter the elements of array: ");
         for(int i=0; i<n; i++){
             nums[i] = sc.nextInt();
         }
         int res = minOperations(nums);
         System.out.println("Minimum number of operations to make array continuous: " + res);
         sc.close();
     }
 }