package DSA;

//Here is the link to the question
//https://leetcode.com/problems/first-missing-positive/

//Given an unsorted integer array nums, return the smallest missing positive integer.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

//Easy approach using cyclic sort.
//Approach:-
//We are gonna apply cycle sort, but we will ignore negative elements, 
//because positive element is asked in the question. 
//Also, we will ignore all those elements who values are greater than the size of the array. 
//In this way, the first element in the array which is not present in its correct position (index), will be the answer.

//Cycle Sort:-
//When we are given numbers from 1 to N (not necessarily exactly from 1 to N) we use cycle sort.
//It sorts the entire array in one single pass.
//The basic idea behind cycle sort is the sorted array will contain elements on their correct index.
//For eg. - elements from 1 to 5 will be on index 0 to 4 in the sorted array.
//Advantages are :- It sorts the array in-place and does not require additional memory for temporary variables.


public class FirstMissingPositive_LeetcodeHard {
    public static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(nums[i]>=nums.length || nums[i]<=0 || nums[i]==nums[correctIndex])
            {
                i++;
            }
            else
            {
                swap(nums,i,correctIndex);
            }
        }

        if(nums.length==1)
        {
            if(nums[0]==1)
                return 2;
            else
                return 1;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]<=0 || j!=nums[j]-1)
            {
                return j+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {

        //Test cases:-
        //Test case 1:-
        //Input: nums = [1,2,0]
        //Output: 3
        //Explanation: The numbers in the range [1,2] are all in the array.

        //Test case 2:-
        //Input: nums = [3,4,-1,1]
        //Output: 2
        //Explanation: 1 is in the array but 2 is missing.

        int []nums={3,4,-1,1};  //running test case 2. You can change the values of nums array to check for another test case.
        System.out.println(firstMissingPositive(nums));
    }
}
