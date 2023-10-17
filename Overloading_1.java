package hacktoberfest;

class Student {
	// Class data members
    private String rollno;
    private String name;
    private int marks;
    private String address;

    // Default constructor (non-parameterized)
    public Student() {
        this.rollno = "Not Assigned";
        this.name = "Unknown";
        this.marks = 0;
        this.address = "Not Available";
    }

    // Parameterized constructor with name and rollno as parameters
    public Student(String name, String rollno) {
        getData(name, rollno);
    }

    // Parameterized constructor with name, rollno, marks, and address as parameters
    public Student(String name, String rollno, int marks, String address) {
        getData(name, rollno, marks, address);
    }

    // Method-1 to set name and rollno
    public void getData(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    // Method-2 to set name, rollno, marks, and address
    public void getData(String name, String rollno, int marks, String address) {
        getData(name, rollno); // Previous method reused to set name and rollno
        this.marks = marks;
        this.address = address;
    }

    // Method-3 to print the student's details
    public void getData() {
        System.out.println("Roll no.: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Address: " + address);
    }
}

public class Overloading_1 {

	public static void main(String[] args) {
        // Three student objects
        Student stud1 = new Student();
        Student stud2 = new Student("Tony", "S3000");
        Student stud3 = new Student("Steve", "R1945", 97, "New York");

        // Printing details of the student objects
        System.out.println("Student-1 Details -");
        stud1.getData();
        System.out.println();

        System.out.println("Student-2 Details -");
        stud2.getData();
        System.out.println();

        System.out.println("Student-3 Details -");
        stud3.getData();
    }

}
