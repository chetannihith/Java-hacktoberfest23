
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("My name is " + name);
    }
}

interface Employee {
    void work();
}

class Teacher extends Person implements Employee {
    Teacher(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " is teaching.");
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

class AdministrativeStaff extends Person implements Employee {
    AdministrativeStaff(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " is managing administrative tasks.");
    }
}


public class HybridInheritanceExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        Student student = new Student("Alice");
        AdministrativeStaff staff = new AdministrativeStaff("John Doe");

        teacher.introduce();  // Inherited from Person
        teacher.work();       // Defined in Teacher

        student.introduce();  // Inherited from Person
        student.study();      // Defined in Student

        staff.introduce();    // Inherited from Person
        staff.work();         // Defined in AdministrativeStaff
    }
}