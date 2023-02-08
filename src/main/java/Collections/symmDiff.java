package Collections;

import java.util.HashSet;
import java.util.Set;

public class symmDiff {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet <T> firstSet = new HashSet<>(set1);
        firstSet.removeAll(set2);
        HashSet <T> secondSet = new HashSet<>(set2);
        secondSet.removeAll(set1);
        firstSet.addAll(secondSet);
        return firstSet;
    }
}
