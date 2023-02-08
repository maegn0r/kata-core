package Collections;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        while (scanner.hasNext()) {
            if (!(counter % 2 == 0)) {
                deque.push(scanner.nextInt());
            } else {
                scanner.next();
            }
            counter++;
        }
        System.out.println(deque.toString().replaceAll("[\\[\\],]", ""));
    }
}
