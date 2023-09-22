package FunctionalInterface.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        Collections.addAll(mylist, 1,2,3,4,5,6,7);

        Function<List<Integer>, List<Integer>> myFunction = (list) -> {
            List<Integer> doubleList = new ArrayList<>(list);
            for(int i = 0; i < doubleList.size(); i++) {
                doubleList.set(i, doubleList.get(i) * 2);
            }
            return doubleList;
        };

        List<Integer> newList = myFunction.apply(mylist);
        System.out.println(newList);
    }
}
