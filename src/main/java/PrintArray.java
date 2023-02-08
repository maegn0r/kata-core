public class PrintArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        printArray(numbers);
    }
    public static void printArray(int[] numbers) {
        if (numbers.length == 0) {
            System.out.print("[]");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    System.out.print("[" + numbers[0]);
                }
                if (i >= 1) {
                    System.out.print(", " + numbers[i]);
                }
            }
            System.out.print("]");
        }
    }
}
