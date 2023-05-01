package Reflection01;

public class MyReflectDemo01 {

    /*
    * 获取class对象的三种方式
    *   1. Class.forName(“全类名”）
    *   2. 类名.class
    *   3. 对象.getClass()
    * */
    public static void main(String[] args) throws ClassNotFoundException {

        //1. 第一种方式
        //全类名： 包名 + 类名
        //最为常用
        Class clazz1 = Class.forName("Reflection01.Student");
        System.out.println(clazz1);

        //第二种方式
        //通常当作参数作为传递（比如synchronized method block）
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //第三种方式
        //当有了这个类的对象时才可以使用
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

        System.out.println(clazz1.equals(clazz2) && clazz2.equals(clazz3));
    }
}
