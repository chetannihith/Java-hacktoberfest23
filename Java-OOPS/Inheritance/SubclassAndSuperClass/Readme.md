## Subclass (or) Derived Class:

- A subclass, also known as a derived class, is a class that inherits attributes and methods from another class, known as the superclass or base class.

- The subclass can add additional attributes and methods or override the inherited methods.

- Subclasses are created to represent specialized or more specific entities based on the characteristics of the superclass.

#### Example - Subclass/Derived Class:

```java

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

```

- In above example **Dog** is the subclass or derived class, and it inherits the **eat()** method from the Animal class. The **bark()** method is specific to the **Dog** class.

## Superclass (or) Base Class:

- A superclass, also known as a base class, is a class from which other classes inherit attributes and methods.

- It defines a common set of attributes and behaviors that are shared by its subclasses.

- Superclasses are often more general and serve as a blueprint for creating related subclasses.

#### Example - Superclass/Base Class:
```java

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }
}

```
- In above example, **Vehicle** is the superclass or base class. It defines the brand attribute and the **start()** method, which are common to various types of vehicles.

## Relationship Between Subclass and Superclass:

- A subclass inherits the attributes and methods of its superclass.

- It can extend the functionality by adding new attributes or methods or by overriding the inherited methods.

- The relationship can be visualized as a relationship, meaning the subclass is a  type of the superclass.

#### Example - Relationship Between Subclass and Superclass:

```java

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // Inherited from Animal
        dog.bark(); // Defined in Dog

        Vehicle car = new Vehicle("Toyota");
        car.start(); // Defined in Vehicle
    }
}

```

- In above example, **Dog** is a type of **Animal**, and **Vehicle** is a general entity that can be a car, bike, or any vehicle. The relationship reflects the relationship between the subclasses and their respective superclasses.

#### In summary :
- A subclass (or) derived class inherits attributes and methods from a superclass (or) base class. Subclasses can specialize and extend the functionality of the superclass to represent more specific entities. This relationship is central to the concept of inheritance in object-oriented programming.