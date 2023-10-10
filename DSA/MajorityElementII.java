package DSA;

/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Test Case I:
Input: nums = [3,2,3]
Output: [3]

Test Case II:
Input: nums = [1]
Output: [1]

Test Case III:
Input: nums = [1,2]
Output: [1,2] */


import java.util.*;

public class MajorityElementII {
    private static List<Integer> majorityHelper(int[] nums) {
        int dec = nums.length / 3;
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int k: map.keySet()){
            if(map.get(k) > dec){
                res.add(k);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        List<Integer> res = majorityHelper(nums);
        System.out.println("List of elements appearing more than " + n/3 + " times is: " + res);
        sc.close();
    }
}

