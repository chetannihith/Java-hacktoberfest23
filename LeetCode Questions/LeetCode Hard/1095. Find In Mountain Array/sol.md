Description of the question:-
(This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

Approach :-
we have to find the element in the Mountain array.
We are also given that duplicate elements can also be present.
So for doing this, first we will find out the Peak element or the Mountain element in the array.
Then, we will apply binary search in the left side and right side of the peak element.
And then if we find the element in both the halves, return the indice of left half.
If not found in left half, return the indice of right half,
Else return -1 as we didn't find the target element.

Complexity:- 
Time complexity:
O(logn) same as binary search.