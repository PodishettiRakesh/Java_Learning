// Abstract class Animal
abstract class main {
    abstract void sound();  // Abstract method

    void eat() {            // Concrete method
        System.out.println("The Animal is eating");
    }
}

// Dog class extends Animal
class Dog extends main {
    @Override
    void sound() {
        System.out.println("Dog barks as bow bow");
    }
}

// Cat class extends Animal
class Cat extends main {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class (matches file name)
public class Main {
    public static void main(String[] args) {
        // Correctly using the Animal reference for polymorphism
        main dog = new Dog();
        dog.sound();  // Output: Dog barks as bow bow
    }
}
