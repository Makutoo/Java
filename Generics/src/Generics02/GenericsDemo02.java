package Generics02;

public class GenericsDemo02 {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("aaa");
        myList.add("bbb");
        myList.add("ccc");
        System.out.println(myList);
    }
}
