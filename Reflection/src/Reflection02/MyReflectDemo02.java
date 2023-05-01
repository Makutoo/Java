package Reflection02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyReflectDemo02 {
    /*
    *  Class类中用于获取构造方法的方法
    *       Constructor<?>[] getConstructors()
    *       Constructor<?>[] getDeclaredConstructors()
    *       Constructor<T> getConstructor(Class<?>... parameterTypes)
    *       Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
    *
    *       加Declared: 获取所有的（public, private, protected)
    *       不加Declared: 获取public
    * */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取class字节码文件对象
        Class clazz = Class.forName("Reflection02.Student");

        //2.获取所有公共构造方法
        Constructor[] cons1 = clazz.getConstructors();
        for (Constructor con : cons1) {
            System.out.println(con);
        }

        //3.获取所有构造方法
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor con : cons2) {
            System.out.println(con);
        }

        //4.获取无参构造方法
        Constructor con1 = clazz.getDeclaredConstructor();
        System.out.println(con1);

        //5.获取String参数构造方法
        Constructor con2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(con2);

        //6.获取int参数构造方法
        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);

        //7.获取int和String参数构造方法
        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con4);

        //8.获取构造方法的权限修饰符（以整数的方式体现）
        int modifiers = con4.getModifiers();
        System.out.println(modifiers);

        //9.获取到构造方法，拿来创建student的对象
        con4.setAccessible(true); //con4是私有构造方法，所以需要用setAccessible(true)来临时取消权限校验（暴力反射）
        Student student = (Student) con4.newInstance("张三", 23);
        System.out.println(student);
    }
}
