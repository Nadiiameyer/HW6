public class HW6 {
    public static void main(String[] args) {
        int[] numbers = {5, 11, 7, 20};
        int minDifference = findMinAbsoluteDifference(numbers);
        System.out.println("Найменше значення різниці по модулю: " + minDifference);
    }

    public static int findMinAbsoluteDifference(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int difference = Math.abs(arr[i] - arr[j]);
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }
        return minDifference;
    }
}