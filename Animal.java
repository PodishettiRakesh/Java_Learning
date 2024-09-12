public abstract class Animal {
    abstract void sound();

    void eat(){
        System.out.println("The Animal is eating");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("dog barks as bow bow");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("cat meows");
    }
}

