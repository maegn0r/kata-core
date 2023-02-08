import java.util.Arrays;
import java.util.StringJoiner;

public class GetArrayMiddle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayMiddle(array2)));
        System.out.println(Arrays.toString(getArrayMiddleArrays(array2)));
        Character character = new Character('H');
        String a1 = "Java";
        String a2 = "I Love " + "Java";
        String a3 = "I Love Java";
        String a4 = "I Love " + a1;
        String a5 = a4.intern();
        String a8 = "a";
        String a9 = "b";
        String a10 = "ab";


        System.out.println(a2 == a3);
        System.out.println(a3 == a4);
        System.out.println(a5);
        System.out.println(a3 == a5);
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add(a1);
        joiner.add(a2);
        joiner.add(a3);
        joiner.add(a4);
        System.out.println(joiner);
        StringBuilder sb = new StringBuilder();
        String a6 = sb.append(a8).append(a9).toString();
        int x = 077;
        char h = 'h';
        short gt = 2;
        System.out.println(x+h);
        System.out.println(x);
        System.out.println(a6 == a10);


    }

    static int[] array1 = {2, 3, 4, 110, 1119};
    static int[] array2 = {4, 6, 8, 10};

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length % 2 > 0) {
            return new int[]{numbers[numbers.length / 2]};
        } else return new int[]{numbers[numbers.length / 2 - 1], numbers[numbers.length / 2]};
    }

    public static int[] getArrayMiddleArrays(int[] numbers) {
        if (numbers.length % 2 > 0) {
            return Arrays.stream(numbers).filter(i -> i == numbers[numbers.length / 2]).toArray();
        } else if (numbers.length > 1) {
            return Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
        } else return numbers;
    }
}
