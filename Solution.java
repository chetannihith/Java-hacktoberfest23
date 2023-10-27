import java.util.Scanner;

class School {
    private int numStudents;
    private Student[] students;

    public School(int numStudents) {
        this.numStudents = numStudents;
        students = new Student[numStudents];
    }

    public void enterStudentInfo() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = input.nextInt();
            input.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Address: ");
            String address = input.nextLine();

            System.out.print("Branch: ");
            String branch = input.nextLine();

            double[] marks = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter Marks for Subject " + (j + 1) + ": ");
                marks[j] = input.nextDouble();
            }

            double percentage = calculatePercentage(marks);
            char grade = calculateGrade(percentage);

            students[i] = new Student(rollNo, name, address, branch, marks, percentage, grade);
        }
    }

    public void printStudentInfo(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                System.out.println("Student Information:");
                System.out.println("Roll No: " + student.getRollNo());
                System.out.println("Name: " + student.getName());
                System.out.println("Address: " + student.getAddress());
                System.out.println("Branch: " + student.getBranch());
                System.out.println("Marks: " + student.getMarksAsString());
                System.out.println("Percentage: " + student.getPercentage() + "%");
                System.out.println("Grade: " + student.getGrade());
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }

    private double calculatePercentage(double[] marks) {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / 4;
    }

    private char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        School school = new School(numStudents);
        school.enterStudentInfo();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print Student Information");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter the Roll No of the student you want to print: ");
                int rollNo = input.nextInt();
                school.printStudentInfo(rollNo);
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

class Student {
    private int rollNo;
    private String name;
    private String address;
    private String branch;
    private double[] marks;
    private double percentage;
    private char grade;

    public Student(int rollNo, String name, String address, String branch, double[] marks, double percentage, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.branch = branch;
        this.marks = marks;
        this.percentage = percentage;
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBranch() {
        return branch;
    }

    public double[] getMarks() {
        return marks;
    }

    public double getPercentage() {
        return percentage;
    }

    public char getGrade() {
        return grade;
    }

    public String getMarksAsString() {
        StringBuilder marksStr = new StringBuilder();
        for (double mark : marks) {
            marksStr.append(mark).append(", ");
        }
        return marksStr.toString().replaceAll(", $", ""); // Remove the trailing comma and space
    }
}
