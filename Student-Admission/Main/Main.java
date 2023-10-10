package Main;

import java.util.Scanner;

import Student.Student;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();
        
        System.out.print("Enter Student Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Student Phone Number: ");
        String phoneNumber = scanner.nextLine();

        Student student = new Student(name,age,course,email,phoneNumber);
        System.out.println("Student Admission Details Added");

        student.showStudentDetails();
    }
        
    
}
