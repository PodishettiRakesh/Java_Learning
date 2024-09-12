interface Animal{
    void sound();

    default void eat(){
        System.out.println(" the animal is eating");
    }
}

public class Interfaces {
    
}
