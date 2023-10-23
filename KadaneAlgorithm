import java.util.Scanner;
/**
 * Solution for the Kadane's algorithm problem from GeeksforGeeks.org
 * <https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1>
 */
public class KadaneAlgorithm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int ar[]=new int[sc.nextInt()];
        for(int i = 0; i < ar.length; i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
        int sum = ar[0],sumAlt = 0;
        for(int i = 1; i < ar.length; i++)
        {
            if(ar[i] > 0)
            {
                sum += ar[i];
                continue;
            }
            else
            {
                for (int j = i+1; j < ar.length; j++)
                {
                    sumAlt += ar[j]; 
                }
            }
            if(sumAlt > -(ar[i]))
            {
                sum += sumAlt;
            }
            break;
        }
        System.out.println("Max subarray sum is "+sum);
        sc.close();
    } 
}
