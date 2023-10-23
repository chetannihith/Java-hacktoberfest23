import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{       public static void main(String[] args) {
        int[] myarray = {21,43,23,54,75,13,5,8,25,10};  
        int key,location=0;   
        Scanner sc = new Scanner(System.in);  
        System.out.println("The input array is");
        for(int i=0;i<10;i++){
            System.out.print(myarray[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Enter key");  
        key = sc.nextInt();  
        for(int i = 0; i<10; i++)  
        {  
            if(myarray[i]==key)  
            {  
                location = i+1;  break;  
            }  
            else  
                location = 0;   
        }  
        if(location != 0)  
        {  
            System.out.println("key found at location " + location);  
        }  
        else  
            System.out.println("Key not found");  
    }  
}
