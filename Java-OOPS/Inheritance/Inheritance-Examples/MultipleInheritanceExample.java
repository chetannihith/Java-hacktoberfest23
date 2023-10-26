

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

public class MultipleInheritanceExample {
       public static void main(String[] args) {
        Author author = new Author();
        author.write();  // Defined in Writer
        author.speak();  // Defined in Speaker
    }
}
