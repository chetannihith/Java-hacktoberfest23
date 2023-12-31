


/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findPeak(MountainArray arr)
    {
        int start=0;
        int end=arr.length()-1;
        int mid=0;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(arr.get(mid)<arr.get(mid+1))
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return end;
    }
    public int binarySearchLeft(MountainArray arr,int target,int start,int end)
    {
        int low=start;
        int high=end;
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr.get(mid)==target)
            {
                return mid;
            }
            else if(arr.get(mid)<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }

    public int binarySearchRight(MountainArray arr,int target,int start,int end)
    {
        int low=start;
        int high=end;
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr.get(mid)==target)
            {
                return mid;
            }
            else if(arr.get(mid)<target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex=findPeak(mountainArr);
        int minIndex=binarySearchLeft(mountainArr,target,0,peakIndex);
        int maxIndex=binarySearchRight(mountainArr,target,peakIndex+1,mountainArr.length()-1);
        if(minIndex!=-1)
        {
            return minIndex;
        }
        else if(maxIndex!=-1)
        {
            return maxIndex;
        }
        else
        {
            return -1;
        }
    
    }
}