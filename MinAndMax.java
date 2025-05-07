public class MinAndMax {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 1, 4, 2 };

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("min : " + min);
        System.out.println("max : " + max);

    }
}
