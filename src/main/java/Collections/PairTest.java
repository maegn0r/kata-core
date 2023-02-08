package Collections;

import java.util.Objects;

class PairTest {
    public static class Pair<T, W> {
        private final T first;
        private final W second;

        Pair(T t, W w) {
            this.first = t;

            this.second = w;
        }

        public T getFirst() {
            return first;
        }

        public W getSecond() {
            return second;
        }

        public static <T, W> Pair<T, W> of(T first, W second) {
            return new Pair<>(first, second);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(first, second);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Pair<?, ?> pair = (Pair<?, ?>) obj;
            return Objects.equals(first, ((Pair<?, ?>) obj).first) && Objects.equals(second, ((Pair<?, ?>) obj).second);
        }
    }

}
