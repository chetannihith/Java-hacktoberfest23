# What is mean by an Inheritance ?
- **Inheritance** is a fundamental concept in object-oriented programming where one class (the subclass or derived class) **inherits the attributes and methods of another class** (the superclass or base class). 

- It allows you to create new classes that are based on existing classes, promoting code reuse and the creation of more specialized classes.

### Example: Inheritance in Java 

In above diagram, **Vehicle** is the **superclass**, and **Car** is the **subclass**. The Car class inherits attributes and methods from the Vehicle class.

```java

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }

    void stop() {
        System.out.println(brand + " is stopping.");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void drive() {
        System.out.println(brand + " is driving.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();  // Inherited from Vehicle
        myCar.drive();  // Defined in Car
        myCar.stop();   // Inherited from Vehicle
    }
}

```

- In above example, the **Car** class inherits from the **Vehicle** class. It has access to the **brand, start(), and stop()** methods from the Vehicle class, in addition to its own **drive()** method. When we create an instance of **Car** and call its methods, it demonstrates how inheritance allows the reuse of code and the creation of specialized classes.

- Inheritance in object-oriented programming **allows you to create new classes by inheriting attributes and methods from existing classes, promoting code reuse and a hierarchical structure of classes**.

### There are different types of inheritance which are supported by java :

#### 1. Single Inheritance.
#### 2. Multilevel Inheritance.
#### 3. Hierarchical Inheritance.
#### 4. Multiple Inheritance (through Interfaces).
#### 5. Hybrid (Combination of any two types of inheritance).

### 1. Single Inheritance :

- Single inheritance is one of the fundamental concepts of object-oriented programming (OOP). 

- It refers to the **inheritance relationship where a subclass (derived class) inherits attributes and methods from a single superclass (base class)**. 

- In other words, **a class can have only one direct parent class from which it inherits.** 

#### Explanation of Single Inheritance :

- In single inheritance, a class (the subclass) is derived from only one parent class (the superclass).

- The subclass inherits the attributes and methods of the superclass.

- The subclass can add its own attributes and methods or override the inherited methods to customize its behavior.

- Single inheritance promotes a hierarchical structure, where each class represents a more specialized entity.

#### Example of Single Inheritance:

Suppose we have two classes, **Animal** as the superclass and **Dog** as the subclass. The **Dog** class will inherit attributes and methods from the **Animal** class.


```java

class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void eat() {
        System.out.println(species + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String species) {
        super(species); // Call the superclass constructor
    }

    void bark() {
        System.out.println(species + " is barking.");
    }
}

```

#### In above example 

- **Animal** is the superclass, and **Dog** is the subclass.

- The **Animal** class defines the **species** attribute and an **eat()** method.

- The **Dog** class extends **Animal** using the **extends** keyword, indicating that it inherits from the **Animal** class.

- The **Dog** class adds its own method, **bark()**, in addition to the inherited **eat()** method.

### usage

```java

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Canine");
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Defined in Dog
    }
}

```

- In above usage example, an instance of the **Dog** class, **myDog**, is created. It inherits the **eat()** method from the **Animal** class and defines its own method, **bark()**. 

- When we call these methods on **myDog**.

- This demonstrates **single inheritance in action.**

### Summary:

Single inheritance is a simple and widely used form of inheritance in OOP. **It allows classes to create a hierarchical structure by inheriting attributes and methods from a single superclass**. Subclasses can then extend or customize their behavior while maintaining a relationship with the superclass.

### Try it Yourself :

- **Real-World Scenario:** Inheritance can be seen in the relationship between a **Vehicle** class and its subclasses like **Car** or **Bike**.

### 2. Multilevel Inheritance.

- Multilevel inheritance is another inheritance concept in object-oriented programming.

- In multilevel inheritance, **a subclass (derived class) inherits from a superclass (base class), and then another class inherits from this derived class**. 

- This creates a chain or hierarchy of classes.

#### Explanation of Multilevel Inheritance:

- In multilevel inheritance, a class (the subclass) inherits from a parent class (the superclass), and then another class (the sub-subclass) inherits from this derived class.

- The sub-subclass inherits attributes and methods from both the superclass and the immediate superclass.

- The sub-subclass can add its own attributes and methods, extend functionality, or override inherited methods.

- Multilevel inheritance allows you to represent a hierarchical structure of classes with varying levels of specialization.

#### Example of Multilevel Inheritance:

- Suppose we have three classes **Grandparent, Parent, and Child**. **Child** inheriting from **Parent** and **parent** inherits from **Grandparent**.

```java

class Grandparent {
    void familyName() {
        System.out.println("Family name is Smith.");
    }
}

class Parent extends Grandparent {
    void parentName() {
        System.out.println("Parent's name is John.");
    }
}

class Child extends Parent {
    void childName() {
        System.out.println("Child's name is Alice.");
    }
}

```

#### In above example:

- **Grandparent** is the superclass, and **Parent** is a subclass of **Grandparent**. Parent inherits the **familyName()** method.

- **Child** is a subclass of **Parent**. It inherits both the **familyName()** and **parentName()** methods.

- The Child class adds its own method **childName()**.

### usage 

```java

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child alice = new Child();
        alice.familyName();  // Inherited from Grandparent
        alice.parentName();  // Inherited from Parent
        alice.childName();   // Defined in Child
    }
}

```

- In above usage example, an instance of the **Child** class, **alice** is created. 

- It inherits methods from both the **Grandparent** and **Parent** classes, while also defining its own method. 

- This demonstrates **multilevel inheritance** in action.

#### Summary:

**Multilevel inheritance** creates a chain or hierarchy of classes, where each subclass inherits from a parent class. This concept allows you to represent a complex hierarchical structure of classes, promoting code reuse and specialization. Subclasses inherit attributes and methods from multiple levels in the hierarchy.

### Try it Yourself :

```scss

       Person (Name, DOB, Contact)
          |
       Employee (Employee ID, Department, Salary)
          |
       Teacher (Subject)
          |
       Student (Student ID, Enrolled Courses)

```

- In above educational institution scenario, **multilevel inheritance** provides a natural way to model the various roles and responsibilities of individuals, promoting code reusability and maintainability.

### 3. Hierarchical Inheritance :

- Hierarchical inheritance is another important concept in object-oriented programming. 

- In hierarchical inheritance, **multiple subclasses inherit from the same superclass**, creating a **hierarchy of classes where several specialized classes share attributes and methods from a common ancestor**. 

#### Explanation of Hierarchical Inheritance:

- In hierarchical inheritance, multiple subclasses inherit from a single parent class (superclass).

- All subclasses share common attributes and methods inherited from the superclass.

- Each subclass can add its own attributes and methods or override inherited methods to specialize its functionality.

- Hierarchical inheritance is useful when several classes have shared characteristics but diverge in certain aspects.

#### Example of Hierarchical Inheritance:

- Consider a scenario in a **banking application** where we want to model different types of **bank accounts** like **SavingsAccount, CheckingAccount, and LoanAccount**. These account types share some common attributes and behaviors but also have specific characteristics.

```java

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Additional methods for checking accounts, e.g., writing checks
}

class LoanAccount extends BankAccount {
    private double loanInterestRate;

    LoanAccount(String accountNumber, double initialBalance, double loanInterestRate) {
        super(accountNumber, initialBalance);
        this.loanInterestRate = loanInterestRate;
    }

    // Additional methods for loan accounts, e.g., calculating interest
}

```

#### In above Example

- **BankAccount** is the superclass, which contains common attributes and methods for all types of bank accounts.

- **SavingsAccount, CheckingAccount, and LoanAccount** are subclasses that inherit attributes and methods from **BankAccount** and add their own specific attributes and methods.

### usage 

```java

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 2.5);
        CheckingAccount checking = new CheckingAccount("CA456", 1500.0);
        LoanAccount loan = new LoanAccount("LA789", -5000.0, 5.0);

        savings.addInterest();
        checking.withdraw(200.0);
        loan.deposit(100.0);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
        System.out.println("Loan Account Balance: " + loan.getBalance());
    }
}

```
- In above usage example, we create instances of **SavingsAccount, CheckingAccount, and LoanAccount**.

- Each account type inherits common banking operations from the **BankAccount** class but also has its own specific functionality.

- Hierarchical inheritance simplifies the representation of these different account types in the application.

### Try it Yourself :

- Imagine you are designing a **software system for a library**, and you need to model different types of **library materials, such as books, DVDs, and magazines**. 

- All these materials **share common attributes and behaviors, but each type has its unique characteristics**. 

- How would you use **hierarchical inheritance** to represent this scenario? Provide an example of a superclass and at least two subclasses, along with their unique attributes or methods ?

```plaintext
            LibraryMaterial
                 /   |   \
               /     |     \
            Book    DVD   Magazine
             |               |
        ----------        -------------
        |         |       |            |
   Fiction   NonFiction  Educational  Fashion

```
### 4. Multiple Inheritance (through Interfaces)

- Multiple Inheritance through interfaces is a concept in object-oriented programming that allows a **class to inherit method signatures from multiple sources, typically represented by interfaces.** 

- Unlike classical multiple inheritance (where a class inherits from multiple classes), this approach helps in avoiding the **diamond problem**, which can occur in classical multiple inheritance.

#### Explanation of Multiple Inheritance (through Interfaces):

- In **multiple inheritance** through **interfaces**, a class can implement multiple interfaces, which contain **method signatures.**

- The class then provides concrete implementations for the methods defined in those interfaces.

- This concept allows a class to inherit and implement methods from multiple sources without the need to inherit attributes.

#### Example of Multiple Inheritance (through Interfaces):

- Suppose we have three interfaces likes **Writer, Speaker, and Singer**. A class **Author**, will implement both **Writer** and **Speaker**, demonstrating multiple inheritance through interfaces.

```java

interface Writer {
    void write();
}

interface Speaker {
    void speak();
}

class Author implements Writer, Speaker {
    public void write() {
        System.out.println("Author is writing a book.");
    }

    public void speak() {
        System.out.println("Author is giving a speech.");
    }
}

```

#### In above example:

- **Author** is the class that implements both the **Writer** and **Speaker** interfaces.

- It provides concrete implementations for the **write() and speak() methods**.

### Usage 

```java

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Author author = new Author();
        author.write();  // Defined in Writer
        author.speak();  // Defined in Speaker
    }
}

```

- In above usage example, an instance of the **Author** class, **author** is created. The **Author** class inherits and implements methods from both **Writer** and **Speaker** interfaces. 

- When we call these methods on **author**, it demonstrates multiple inheritance through interfaces.

#### Summary:

**Multiple Inheritance** through interfaces allows a class to inherit method signatures from multiple sources, represented by interfaces. It's particularly useful when a class needs to exhibit behaviors from different categories without inheriting attributes. This approach avoids the issues associated with classical multiple inheritance and promotes code reusability and flexibility.

### Try it Yourself :

- Imagine you are developing a **multimedia application**, and you have a class called **MultimediaItem** that represents various types of **multimedia content**.

- You want to incorporate multiple behaviors in this class, including **the ability to play the content, display it, and provide information about it.**

- To achieve this, you decide to use multiple inheritance through interfaces. 

- create three interfaces like **Playable, Displayable, and InformationProvider, each defining methods for their respective behaviors.**

1. **Playable** interface includes a **play()** method.

2. **Displayable** interface includes a **display()** method.

3. **InformationProvider** interface includes an **getInformation()** method.

4. Now, you can implement these interfaces in your **MultimediaItem class** to make it **capable of playing, displaying, and providing information about multimedia content.**

```
                 MultimediaItem
                 /       |       \
     Playable    Displayable   InformationProvider
        |           |              |
    | play() |   | display() |  | getInformation() |


```

### 5. Hybrid (Combination of any two types of inheritance) 

- **Hybrid inheritance** is a combination of multiple inheritance types in a single class hierarchy. 

- It allows a **class to inherit from multiple classes,** including **single inheritance, multiple inheritance (through interfaces), or any other combination**. 

- This concept is a bit more complex but provides great flexibility when designing class structures.

#### Explanation of Hybrid Inheritance:

- Hybrid inheritance is a combination of various inheritance types within a single class hierarchy.

- A class in a hybrid inheritance structure can inherit attributes and methods from multiple superclasses or interfaces.

- It allows for a mix of different types of inheritance, such as single, multiple (through interfaces), and more.

- This flexibility enables you to create complex class structures that are tailored to specific requirements.

#### Example of Hybrid Inheritance:

- Suppose we are modeling a system for a **university with faculty members, students, and staff**. 

- We want to **design a class hierarchy that combines single, multiple, and hierarchical inheritance.**

```java

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

```

#### In above example 

- **Person** is a common superclass for individuals and defines attributes and methods like **name** and **introduce()**.

- The **Employee** interface defines the **work()** method for those who have employment-related duties.

Now, we create specialized classes:

- **Teacher** inherits from **Person** and implements **Employee**. 

- It combines single inheritance from **Person** and multiple inheritance through the **Employee** interface. A teacher can introduce themselves (from **Person**) and perform work (from **Employee**).

- **Student** inherits only from **Person**. It represents a student who can introduce themselves and study.

- **AdministrativeStaff** inherits from **Person** and implements **Employee**. Administrative staff can introduce themselves and perform work specific to administrative tasks.

### Usage 

```java

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

```

- Above example showcases hybrid inheritance, combining single and multiple inheritance, to model individuals in a university environment, each with their specific roles and behaviors.

### Summary:

Hybrid inheritance is a combination of various types of inheritance within a single class hierarchy, allowing for complex and flexible class structures. It provides the ability to inherit attributes and methods from multiple superclasses and interfaces, making it suitable for diverse and intricate system designs.

### Try it Yourself :

Design a Java class hierarchy that utilizes hybrid inheritance to represent a library system. The library system includes books, library members, and library staff. Implement the following classes and interfaces:

1. **Person** class with attributes **name** and **age**.

2. **Employee** interface with a **work()** method.

3. **Book** class with attributes for title, author, and publication year.

4. **LibraryMember** class that inherits from **Person** and implements **Employee**. It represents library members who can check out and return books.

5. **LibraryStaff** class that inherits from **Person** and implements **Employee**. It represents library staff who can work at the library and perform administrative tasks.

6. Define appropriate methods and demonstrate how you can create instances of these classes and use their methods to manage books and library members within the library system.

**How would you design a class hierarchy to represent a library system using hybrid inheritance? Provide a rough class structure, including classes, interfaces, and their relationships. What attributes and methods would you include in each class?**

```         

                 Person
                    |
                    |
                Employee
                    |
            |---------------|
     LibraryMember   LibraryStaff
           |                |
        |     |           |     |
      Person   work()   Person   work()
                    |              |
                    |              |
                  Book            Book
```



