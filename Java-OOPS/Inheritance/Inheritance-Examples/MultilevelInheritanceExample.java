
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


public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child alice = new Child();
        alice.familyName();  // Inherited from Grandparent
        alice.parentName();  // Inherited from Parent
        alice.childName();   // Defined in Child
    }
}