package Reflection05;

import java.lang.reflect.Field;

public class MyReflectDemo05 {
    /*
    *   对任意一个对象，都可以把对象所有的字段和值，保存到文件中去
    * */
    public static void main(String[] args) throws IllegalAccessException {
        Student s = new Student("Jack", 23, "male", 170, "sleeping");
        Teacher t = new Teacher("Anna", 10000);
        saveObject(s);

    }

    public static void saveObject(Object obj) throws IllegalAccessException {
        //1.获取字节码文件对象
        Class clazz = obj.getClass();

        //2.获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);
            System.out.println(name + " = " + value);
        }
    }
}
