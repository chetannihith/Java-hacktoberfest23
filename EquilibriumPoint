import java.util.Scanner;
/**
 * Solution for the Equilibrium point problem from GeeksforGeeks.org
 * <https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1>
 */
public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int ar[] = new int[sc.nextInt()];
        System.out.println("Enter the array : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("Enter element %d : ",i+1);
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            int sum1 = 0, sum2 = 0;
            for(int j = 0; j < i; j++)
            {
                sum1 = sum1 + ar[j];
            }
            for(int k = i+1; k < ar.length; k++)
            {
                sum2 = sum2 + ar[k];
            }
            if(sum1 == sum2)
            {
                System.out.println("Your array : ");
                for (int elem : ar) {
                    System.out.print(elem+"  ");
                }
                System.out.println("\nEquilibrium Point = "+(i+1));
                break;
            }
        }
        sc.close();
    }
}
