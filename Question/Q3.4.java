import java.util.*;
class School
{
    String name,address,type_of_account;
    double balance;
    School()
    {
    }
    
    School(String name, String address, String type_of_account, double balance)
    {
        this.name = name;
        this.address = address;
        this.type_of_account = type_of_account;
        this.balance = balance;
    }
    
    void display(School data)
    {
        System.out.println("The name is "+data.name);
        System.out.println("The address is "+data.address);
        System.out.println("The type of account is "+data.type_of_account);
        System.out.println("The balance is "+data.balance);
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of students");
	    int n = sc.nextInt();
	    School arr[] = new School[n];
	    for(int i = 1; i <= n; i++)
	    {
	        System.out.println("Enter the name, address, type of account and balance of the student "+(i));
	        String name = sc.next();
	        String address = sc.next();
	        String type_of_account = sc.next();
	        double balance = sc.nextDouble();
	        arr[i-1] = new School(name,address,type_of_account,balance);
	    }
	    System.out.println("Enter the name of the student whose information to be displayed");
	    String find_name = sc.next();
	    School nm=new School();
	    int flag=0;
	    for(int i=0;i<n;i++)
	    {
	        if(find_name.equals(arr[i].name))
	        {
	            nm.display(arr[i]);
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    {
	        System.out.println("The name which you have entered is not found in the database");
	    }
	}
}
