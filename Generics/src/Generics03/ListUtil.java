package Generics03;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}

    public static <E> void addAll(ArrayList<E> list, E...es) {
        for (E e : es) {
            list.add(e);
        }
    }
}
