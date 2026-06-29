//create one of your assignments using a new approach.
import java.util.Scanner;

public class recursionassignmentredo {

    public static int calculatedProduct(int[] numbers, int index) {
        // Base case: reached the end of the array
        if (index == numbers.length) {
            return 1;
        }
        // Recursive case: multiply current element by product of the rest
        return numbers[index] * calculatedProduct(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Collect all inputs first
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // calculate recursively
        int result = calculatedProduct(numbers, 0);
        System.out.println("The Product is: " + result);
    }
}
