package StreamAPI;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMaxTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Comparator<? super Integer> comparator = (o1, o2) -> (o1 > o2 ? o2 : o1);
        BiConsumer<? super Integer, ? super Integer> biConsumer = (x1, x2) -> System.out.println(x1 + x2);
        FindMinMaxTest findMinMaxTest = new FindMinMaxTest();
        findMinMaxTest.findMinMax(stream, comparator, biConsumer);

    }

    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        // решение Кристины
//        var entry = stream.collect(Collectors.teeing(Collectors.minBy(order), Collectors.maxBy(order), Map::entry));
//        minMaxConsumer.accept(entry.getKey().get(), entry.getValue().get());

        // мое решение:
        List<? extends T> myList = stream.toList();
        minMaxConsumer.accept(myList.stream().min(order).orElse(null), myList.stream().max(order).orElse(null));

        // решение на teeing
        List<? extends T> result = stream.collect(
                Collectors.teeing(
                        Collectors.minBy(order),
                        Collectors.maxBy(order), (min, max) -> {
                            minMaxConsumer.accept(min.orElse(null), max.orElse(null));
                            return null;
                        })
        );
        System.out.println(result);
    }
}
