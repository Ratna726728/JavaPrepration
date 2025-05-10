package Day03.ArraysExample;

import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {
        // Step 1: Create an array of size 5
        int[] numbers = new int[5];

        // Step 2: Fill the array with the value 7
        Arrays.fill(numbers, 7);

        // Step 3: Print the filled array
        System.out.println("Array after fill: " + Arrays.toString(numbers));
    }
}
