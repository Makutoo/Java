package Generics05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericsDemo05 {
    public static void main(String[] args) {
        /*
        *   泛型不具备继承性，但是数据具备继承性
        * */

        //创建集合的对象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        //调用method方法
        //method(list1);
        //method(list2);
        //method(list3);

        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());
    }

    public static void method(ArrayList<Ye> list) {

    }

}
class Ye{

}

class Fu extends Ye {

}

class Zi extends Fu {

}
