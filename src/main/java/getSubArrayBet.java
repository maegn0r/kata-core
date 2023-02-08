import java.util.Arrays;

public class getSubArrayBet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9};
//        System.out.println(Arrays.toString(getSubArrayBetween(arr, 5, 7)));
        System.out.println(Arrays.toString(inverseArray(arr)));

    }

//    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
//        int counter = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] >= start && numbers[i] <= end) {
//                counter++;
//            }
//        }
//        int[] result = new int[counter];
//        int j = 0;
//        for (int number : numbers) {
//            if (number >= start && number <= end) {
//                result[j] = number;
//                j++;
//            }
//        }
//        return result;
//    }

    public static int[] inverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = tmp;
        }
        return numbers;
    }
}
