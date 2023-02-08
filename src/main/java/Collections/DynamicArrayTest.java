package Collections;
import java.util.Arrays;
import java.util.HashMap;

public class DynamicArrayTest {
    public static class DynamicArray<T> {
        T[] arr = (T[]) new Object[10];
        int size = 0;
        int capacity = 10;
        public static final int EXPAND_RATE = 3;

        public void add(T el) {
            if (size == capacity) {
                arr = Arrays.copyOf(arr, capacity * EXPAND_RATE);
                capacity = capacity * EXPAND_RATE;
            }
            arr[size] = el;
            size++;
        }

        public void remove(int index) {
            if (size > 0) {
                arr[index] = null;
                size--;
            }
            System.arraycopy(arr,index + 1,arr, index,arr.length - (index + 1));
        }

        public T get(int index) {
            if (index >= 0 && index < size) {
                return arr[index];
            } else {
                throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
            }
        }
    }
    HashMap map = new HashMap();
}
