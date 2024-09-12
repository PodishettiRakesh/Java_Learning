// Main.java

// Abstract class Animal
abstract class Animal {
    abstract void sound();  // Abstract method

    void eat() {            // Concrete method
        System.out.println("The Animal is eating");
    }
    void drink(){
        
    }
}

// Dog class extends Animal
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks as bow bow");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    void drink(){
        System.out.println("CAT Drinks milk every day");
    }


}

// Public Main class (must match the file name)
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Output: Dog barks as bow bow
        dog.eat();
        Animal cat = new Cat();
        cat.drink();
    }
}
