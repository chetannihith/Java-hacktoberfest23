class MaxSumCirArray {
    public static int maxSubarraySumCircular(int[] nums) {
    int total=0;
    
    int maxCheck=nums[0], temp1=0;
    int minCheck=nums[0], temp2=0;
    
    for(int i:nums) {
        total+=i;
        temp1=Math.max(i,temp1+i);
        maxCheck=Math.max(temp1,maxCheck);
        temp2=Math.min(i,temp2+i);
        minCheck=Math.min(temp2,minCheck);
    }
    return maxCheck>0 ? Math.max(total-minCheck,maxCheck):maxCheck;
   }

    public static void main(String[] args) {
        int []nums={1,-2,3,-2};
        int sum=maxSubarraySumCircular(nums);
        System.out.println(sum);
    }
}