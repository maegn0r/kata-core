package Collections;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesMap {
    public static void main(String[] args) {

    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        HashMap<String, Long> resultMap = new HashMap<>();
        try (Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                resultMap.merge(scanner.next(), scanner.nextLong(), Long::sum);
            }
        }
        return resultMap;
    }
}
