package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Ivan", "Peter", "Martin", "Anna");
        System.out.println(filteredNames(names));
    }
    public static List<String> filteredNames(List<String> names){
        return names
                .stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
