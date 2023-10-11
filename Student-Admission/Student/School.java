public class School {
    private int rollNo;
    private String name;
    private String address;
    private String branch;
    private double[] marks; // Marks in 4 subjects
    private double percentage;
    private char grade;

    public School(int rollNo, String name, String address, String branch, double[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.branch = branch;
        this.marks = marks;
        calculatePercentageAndGrade();
    }

    private void calculatePercentageAndGrade() {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        percentage = totalMarks / 4.0;

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

    public void displayStudentInformation() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Branch: " + branch);
        System.out.println("Marks in 4 Subjects: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
