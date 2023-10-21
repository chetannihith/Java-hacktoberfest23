// You have n coins and you want to build a staircase with these coins. 
// The staircase consists of k rows where the ith row has exactly i coins. 
// The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.

// Example 1:

// Input: n = 5
// Output: 2
// Explanation: Because the 3rd row is incomplete, we return 2.

// Example 2:

// Input: n = 8
// Output: 3
// Explanation: Because the 4th row is incomplete, we return 3.

// problem: [link](https://leetcode.com/problems/arranging-coins/)


 /* first of all we will accept the no of coins from the users.
  Then we will pass into the arrangeCoins functions.
  We have to build a stair like the top most stair should only have one coin 
  and the bottom most stair should have n coins.
  so first we will delete one coin from the user entered coins and we will build the first stair.
  for the second stair we will delete two coins and increase the stair no to two.
  we will continue like this till the user has less no of coins than no of stair required to build.
 */
import java.util.Scanner;

class ArrangingCoin {
 
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Please enter the number of coins");
        int n=sn.nextInt();
       int ans= arrangeCoins(n);
       System.out.println("The stair obtained by arraning coins is :"+ ans);
    }
    
    public static  int arrangeCoins(int n) 
    {
        int stair=0;
        int count=1;
        while(n>=count)
        {
            n=n-count;
            stair++;
            count++;
        }
        return stair;

    }
}







