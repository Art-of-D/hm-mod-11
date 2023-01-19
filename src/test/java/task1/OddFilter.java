package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class OddFilter{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Ivan", "Peter", "Martin", "Anna");

        System.out.println(oddF(names));
    }
    private static String oddF(List<String> names){
        return names
                .stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name -> (names.indexOf(name)) + ". " + name)
                .collect(Collectors.joining(", "));
    }


}
