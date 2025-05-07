package inheritance;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
    public void eat() {
        System.out.println("Dog eats");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(); 
        dog.eat();  
    }
}
