package StreamAPI;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class TernaryTest {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (x) -> condition.test(x) ? (ifTrue.apply(x)) : (ifFalse.apply(x));
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, i -> (i * i) / 10 % 1000);
    }
}
