package selectionSort;

import java.util.Arrays;

public class ExampleTwo {
    public static void main(String[] args) {
        ExampleTwo example = new ExampleTwo();
        example.sort();
    }

    void sort() {
        int[] numbers = {55, 23, 11, 44, 32};
        var numbersLength = numbers.length;

        for (int i = 0; i < numbersLength - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < numbersLength; j++) {
                if (numbers[j] < numbers[indexOfMin]) {
                    indexOfMin = j;
                }
            }

            int temp = numbers[indexOfMin];
            numbers[indexOfMin] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
