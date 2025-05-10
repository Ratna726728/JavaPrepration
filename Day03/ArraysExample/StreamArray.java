package Day03.ArraysExample;

import java.util.Arrays;

public class StreamArray {
    public static void main(String[] args) {
        // Step 1: Create an array of strings
        String[] copyTo = {"Espresso", "Latte", "Cappuccino", "Mocha"};

        // Step 2: Use Arrays.stream to create a stream from the array
        // Add a space after each element and print using forEach
        Arrays.stream(copyTo)
                .map(coffee -> coffee + " ")
                .forEach(System.out::print);
    }
}
