//eligible for vote or not,, functions
import java.util.*;
public class class42 {
    public static void ageCheck(int a){
        if(a>18){
            System.out.println("You are eligible to vote!");
        }else{
            System.out.println("Sorry, you are not eligible to vote!");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int a=sc.nextInt();
        ageCheck(a);
    }
}
