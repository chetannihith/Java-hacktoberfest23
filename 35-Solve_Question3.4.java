import java.util.Scanner;

class School {
    private int[] rollNo;
    private String[] name;
    private String[] address;
    private String[] branch;
    private double[][] marks;
    private double[] percentage;
    private char[] grade;
    private int numberOfStudents;

    public School(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        rollNo = new int[numberOfStudents];
        name = new String[numberOfStudents];
        address = new String[numberOfStudents];
        branch = new String[numberOfStudents];
        marks = new double[numberOfStudents][4]; // Assuming 4 subjects
        percentage = new double[numberOfStudents];
        grade = new char[numberOfStudents];
    }

    public void enterStudentInformation() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter information for Student " + (i + 1) + ":");
            
            System.out.print("Roll No: ");
            rollNo[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            System.out.print("Name: ");
            name[i] = scanner.nextLine();
            
            System.out.print("Address: ");
            address[i] = scanner.nextLine();
            
            System.out.print("Branch: ");
            branch[i] = scanner.nextLine();
            
            System.out.print("Marks in 4 subjects (space-separated): ");
            for (int j = 0; j < 4; j++) {
                marks[i][j] = scanner.nextDouble();
            }
            
            // Calculate percentage and grade here based on the marks (you can add the logic)
            
            System.out.println("Information entered for Student " + (i + 1) + " successfully.");
        }
    }

    public void printStudentInformation(int rollNoToPrint) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (rollNo[i] == rollNoToPrint) {
                System.out.println("Student Information for Roll No " + rollNo[i] + ":");
                System.out.println("Name: " + name[i]);
                System.out.println("Address: " + address[i]);
                System.out.println("Branch: " + branch[i]);
                System.out.print("Marks: ");
                for (int j = 0; j < 4; j++) {
                    System.out.print(marks[i][j] + " ");
                }
                System.out.println();
                System.out.println("Percentage: " + percentage[i]);
                System.out.println("Grade: " + grade[i]);
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNoToPrint + " not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        School school = new School(numberOfStudents);
        school.enterStudentInformation();

        System.out.print("Enter the Roll No of the student to print information: ");
        int rollNoToPrint = scanner.nextInt();
        school.printStudentInformation(rollNoToPrint);
    }
}
