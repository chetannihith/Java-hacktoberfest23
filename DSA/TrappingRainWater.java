package DSA;

/**
 * Trapping Rainwater Problem - https://leetcode.com/problems/trapping-rain-water/
 * Given n non-negative integers representing an elevation map where the width of
 * each bar is 1, compute how much water it can trap after raining.
 * Time Complexity - O(n)
 */
public class TrappingRainWater {

    public int trap(int[] height) {

        int l[] = new int[height.length];
        int r[] = new int[height.length];

        l[l.length-1] = height[height.length-1];

        for(int i=l.length-2;i>=0;i--){

            l[i] = Math.max(height[i], l[i+1]);
        }

        r[0] = height[0];

        for(int i=1;i<r.length;i++){

            r[i] = Math.max(height[i], r[i-1]);
        }

        int sum = 0;

        for(int i=0;i<height.length;i++){

            sum = sum + Math.min(l[i], r[i]) - height[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater.trap(height));
    }
}
