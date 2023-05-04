package Generics01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo01 {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数据
        //如果我们没有给集合指定类型，默认认为所以的数据类型都是object
        //此时可以往集合里面添加任意的数据类型
        //带来的一个坏处：我们在获取数据的时候，无法使用数据的特有行为

        //此时推出了泛型，可以在添加数据的时候就把类型进行统一
        //而且我们在获取数据的时候，也省得强转了，非常的方便

        //1.创建集合的对象
        ArrayList list = new ArrayList();

        //2.添加数据
        list.add(123);
        list.add("aaa");
        list.add(new Student("Jack", 23));

        //3.遍历集合的每一个元素
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            //多态的弊端是无法访问子类的特有功能
            System.out.println(obj);
        }

    }

}
