//input a matrix. find number x. print indices of x.
import java.util.*;
public class class46 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements of matrix of size "+r+" x "+c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Search number: ");
        int x=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==x){
                    System.out.println("Number "+x+" is at ("+(i+1)+","+(j+1)+")");
                }
            }
        }
    }
}
