package Student;


public class Student {
    String name;
    int age;
    String course;
    String email;
    String phoneNumber;

   

    public Student(String name, int age, String course, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void showStudentDetails() {
        System.out.println("Name: " +name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course );
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println();
    }
}
