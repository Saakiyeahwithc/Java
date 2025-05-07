
public class Student {
    String name;
    int age;
    String course;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Create the first Student object
        Student student1 = new Student();
        student1.name = "Winner";
        student1.age = 22;
        student1.course = "Computer Science";

        Student student2 = new Student();
        student2.name = "Dhungel";
        student2.age = 22;
        student2.course = "Mechanical Engineering";

        System.out.println("Student 1 Details:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Details:");
        student2.displayInfo();
    }
}
