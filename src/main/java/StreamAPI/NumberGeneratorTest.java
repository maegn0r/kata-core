package StreamAPI;

import java.util.function.UnaryOperator;

class NumberGeneratorTest {

    @FunctionalInterface
    public interface NumberGenerator<T extends Number> {
        boolean cond(T t);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return (t -> t.intValue() > 0);
    }
}
