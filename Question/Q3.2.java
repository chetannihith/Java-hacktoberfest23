import java.util.*;
class School
{
    int roll;
    String name,address,branch;
    double percentage;
    int marks[]=new int[4];
    char grade;
    
    School(String name, String address, String branch, int marks[])
    {
        this.name=name;
        this.address=address;
        this.branch=branch;
        this.marks=marks;
    }
    
    void calculatePercentage()
    {
        for(int i=0;i<4;i++)
        {
            percentage+=(double)(marks[i]);
            percentage=(percentage/4)*100;
        }
    }
    
    char calculateGrade()
    {
        if(percentage>=85)
        {
            grade='A';
        }
        else if(percentage>=75)
        {
            grade='B';
        }
        else if(percentage>=60)
        {
            grade='C';
        }
        else if(percentage>=45)
        {
            grade='D';
        }
        else
        {
            grade='E';
        }
        return grade;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of students");
	    int n=sc.nextInt();
	    char grade[]=new char[n];
	    for(int i=1;i<=n;i++)
	    {
	        System.out.println("Enter the name, marks secured in 4 subjects, branch, address of the student "+(i));
	        String name=sc.next();
	        int a[]=new int[4];
	        for(int i1=0;i1<4;i1++)
	        {
	            a[i1]=sc.nextInt();
	        }
	        String branch=sc.next();
	        String address=sc.next();
	        School nm=new School(name,address,branch,a);
	        nm.calculatePercentage();
	        grade[i-1]=nm.calculateGrade();
	    }
	    System.out.println("The grades of the students are as follows");
	    for(int i=0;i<n;i++)
	    {
	        if(grade[i]=='E')
	        {
	            System.out.println("The student is failed");
	        }
	        else
	        {
	            System.out.println("Grade of student "+(i+1)+" is "+grade[i]);
	        }
	    }
	}
}
