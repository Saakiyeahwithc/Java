package abstract_example;

abstract class Animal {
    public abstract void eat(); // Abstract method
}

class Dog extends Animal {
    public void eat() { // Implementing the abstract method
        System.out.println("Dog eats");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(); // Calling the concrete method
        dog.eat(); // Calling the implemented abstract method
    }
}