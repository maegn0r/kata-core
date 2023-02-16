package StreamAPI;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
    public static BigInteger factorial(int value) {
        return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE)).limit(value).reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
