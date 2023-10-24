import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String address;
    private String branch;
    private double[] marks = new double[4];
    private double percentage;
    private char grade;

   
    public Student(int rollNo, String name, String address, String branch, double[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.branch = branch;
        this.marks = marks;
        calculatePercentage();
        calculateGrade();
    }

  
    private void calculatePercentage() {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        percentage = totalMarks / 4;
    }

    private void calculateGrade() {
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }


    public void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Branch: " + branch);
        System.out.println("Marks in 4 Subjects: " + marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3]);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        Student[] students = new Student[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Branch: ");
            String branch = scanner.nextLine();
            double[] marks = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter Marks for Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextDouble();
            }
            students[i] = new Student(rollNo, name, address, branch, marks);
        }
        
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println();
        }
        
        scanner.close();
    }
}
