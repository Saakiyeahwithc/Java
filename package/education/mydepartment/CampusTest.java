package education.mydepartment;

import education.university.campus.Student;

public class CampusTest {
   public static void main(String[] args) {
      Student student = new Student("prashant");
      String name = student.displayName();
      System.out.println("The name of student is: " + name);
   }
}