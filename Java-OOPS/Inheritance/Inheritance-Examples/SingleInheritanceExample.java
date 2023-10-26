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

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tom");
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Defined in Dog
    }
}