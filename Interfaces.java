interface Animal{
    void sound();

    default void eat(){
        System.out.println(" the animal is eating");
    }
}

class Dog implements Animal{
    public void sound(){
        System.out.println("the dog barks");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
    }
}
