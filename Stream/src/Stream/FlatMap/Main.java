package Stream.FlatMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Collections.addAll(list, l1, l2);
        Collections.addAll(l1, 1,3,5,7,9);
        Collections.addAll(l2, 2,4,6,8,10);
        System.out.println(list);
        List<Integer> result = list.stream().flatMap(l -> l.stream().map((x) -> x * 2)).collect(Collectors.toList());
        System.out.println(result);
    }
}
