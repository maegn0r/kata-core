import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeAndSort(array1, array2)));
        System.out.println(Arrays.toString(mergeAndSort2(array1, array2)));
        System.out.println(Arrays.toString(mergeAndSortArrays(array1, array2)));
    }

    static int[] array1 = {2, 3, 4, 110, 1119};
    static int[] array2 = {2, -2, 4, 6, 8, -2, 10};

    public static int[] mergeAndSort(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int counterForFirstArray = 0;
        for (int i = 0; i < result.length; i++) {
            if (i < a1.length) {
                result[i] = a1[i];
                counterForFirstArray++;
            }
        }
        int counterForSecondArray = 0;
        for (int i = counterForFirstArray; i < result.length; i++) {
            if (counterForSecondArray < a2.length) {
                result[i] = a2[counterForSecondArray];
                counterForSecondArray++;
            }
        }
        for (int i = 0; i <= result.length - 1; i++) {
            for (int j = 0; j <= result.length - 2; j++) {
                if (result[j] > result[j + 1]) { //comparing array values
                    int temp = 0;
                    temp = result[j]; //storing value of array in temp variable
                    result[j] = result[j + 1];  //swapping values
                    result[j + 1] = temp; //now storing temp value in array
                }
            }
        }
        return result;
    }

    public static int[] mergeAndSortArrays(int[] a1, int[] a2){
        int[] result = Arrays.copyOf(a1,a1.length+a2.length);
        System.arraycopy(a2,0,result,result.length - a2.length, a2.length);
        return Arrays.stream(result).sorted().toArray();
//        return Arrays.stream(IntStream.concat(IntStream.of(a1),IntStream.of(a2)).sorted().toArray()).toArray(); -- это тоже работает но не для валидатора.
    }

    public static int[] mergeAndSort2(int[] firstArray, int[] secondArray) {
        int len = firstArray.length + secondArray.length;
        int[] res = new int[len];
        int i1, i2;
        i1 = i2 = 0;
        for (int i = 0; i < len; i++) {
            int left  = i1 < firstArray.length ? firstArray[i1] : Integer.MAX_VALUE;
            int right = i2 < secondArray.length ? secondArray[i2] : Integer.MAX_VALUE;
            if (left < right){
                res[i] = left;
                i1++;
            } else {
                res[i] = right;
                i2++;
            }
        }
        return res;
    }

}
