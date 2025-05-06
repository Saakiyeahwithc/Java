import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i = 1;
        long factorial = 1;

        System.out.print("Enter a positive integer: ");
        n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            do {
                factorial *= i;
                i++;
            } while (i <= n);

            System.out.println("Factorial of " + n + " using do-while loop = " + factorial);
        }

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + n + " using while loop = " + factorial);
        }
        
        scanner.close();
    }
}
