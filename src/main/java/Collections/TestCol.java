package Collections;


import java.util.Collection;
import java.util.HashSet;

public class TestCol {
    public static void main(String[] args) {
        Collection<?> collection = new HashSet<>();
        Object object = new Object();
        collection.contains(object);
        collection.clear();
        collection.remove(object);
        collection.toArray();
        collection.iterator();
        collection.size();
    }
}
