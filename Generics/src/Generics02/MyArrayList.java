package Generics02;

import java.util.Arrays;

/*
*   当我们在编写一个类的时候，如果不确定类型，那么这个类就可以定义为泛型类
* */
public class MyArrayList <E> {
    Object[] obj = new Object[10];
    int size;

    public boolean add(E element ) {
        obj[size] = element;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
