import java.util.Arrays;

public class School {
    // Class variable to keep track of the last assigned roll number
    private static int lastRollNumber = 101;

    private String rollNo;
    private String name;
    private String address;
    private String branch;
    private int[] marks;
    private double percentage;
    private String grade;

    public School(String name, String address, String branch, int[] marks) {
        lastRollNumber++;
        this.rollNo = "ABC" + lastRollNumber + "2019";
        this.name = name;
        this.address = address;
        this.branch = branch;
        this.marks = marks;
        this.percentage = calculatePercentage();
        this.grade = calculateGrade();
    }

    private double calculatePercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    private String calculateGrade() {
        double percentage = this.percentage;
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public String getRollNo() {
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

    public int[] getMarks() {
        return marks;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        School student1 = new School("John Doe", "123 Main St", "Science", new int[] { 90, 85, 95, 80 });
        School student2 = new School("Jane Doe", "456 Oak Ave", "Commerce", new int[] { 80, 75, 70, 85 });

        System.out.println("Roll No: " + student1.getRollNo());
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Branch: " + student1.getBranch());
        System.out.println("Marks: " + Arrays.toString(student1.getMarks()));
        System.out.println("Percentage: " + student1.getPercentage());
        System.out.println("Grade: " + student1.getGrade());

        System.out.println("Roll No: " + student2.getRollNo());
        System.out.println("Name: " + student2.getName());
        System.out.println("Address: " + student2.getAddress());
        System.out.println("Branch: " + student2.getBranch());
        System.out.println("Marks: " + Arrays.toString(student2.getMarks()));
        System.out.println("Percentage: " + student2.getPercentage());
        System.out.println("Grade: " + student2.getGrade());
    }
}
