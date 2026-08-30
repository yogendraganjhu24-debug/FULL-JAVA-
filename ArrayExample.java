public class ArrayExample {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print array elements
        System.out.println("Array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Find sum
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}
