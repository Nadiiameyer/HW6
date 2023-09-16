import java.util.Arrays;

public class ArrayDivider {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int divider = 5;
        try {
            int[] dividerArray = dividerArray(originalArray, divider);
            System.out.println("Original array: " + Arrays.toString(originalArray));
            System.out.println("Array with the divider elements: " + Arrays.toString(dividerArray));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero is not allowed.");
        }
    }

    public static int[] dividerArray(int[] arr, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by Zero is not allowed.");
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] / divisor;
        }
        return result;
    }
}
