package StreamAPI;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



public class SystemInOutString {
    public static void main(String[] args) {

            new BufferedReader(new InputStreamReader(System.in)).lines()
                    .map(String::toLowerCase)
                    .flatMap(Pattern.compile("(?U)[^\\p{L}\\p{Digit}]+")::splitAsStream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                    .limit(10).forEach(p -> System.out.println(p.getKey()));

    }
}
