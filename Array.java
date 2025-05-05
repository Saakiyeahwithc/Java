import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] num = { 3, 5, 1, 4, 2 };

        // System.out.println("for example");
        // for (int i = 0; i < num.length; i++) {
        // System.out.println(num[i]);
        // }

        // System.out.println("foreach example");
        // for (int i : num) {
        // System.out.println(i);
        // }

        System.out.println("ascending sort");
        Arrays.sort(num);

        System.out.println(Arrays.toString(num));
    }
}
