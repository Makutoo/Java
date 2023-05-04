package Generics04;


public class GenericsDemo04 {
    public static void main(String[] args) {
        /*
        *   泛型接口的两种使用方法
        *       1.实现类给出具体的类型
        *       2.实现类延续泛型，创建实体类对象时候再确定类型
        * */
        MyArrayList1 list1 = new MyArrayList1();
        list1.add(1);

        MyArrayList2<String> list2 = new MyArrayList2();
        list2.add("abc");
    }
}
