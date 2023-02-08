package IO.SystemIn_SystemOut_double;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0.0;
        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                d = d + scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f",d);
    }
}