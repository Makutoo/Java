package Reflection06;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class MyReflectDemo {
    /*
     *   反射可以跟配置文件结合的方式，动态创建对象，并调用方法
     * */
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.读取配置文件中的信息
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("Reflection/prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        //2.获取全类名和方法名
        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("method");
        System.out.println(className);
        System.out.println(methodName);

        //3.利用反射找到所有的构造方法
        Class clazz = Class.forName(className);
        Constructor[] cons = clazz.getDeclaredConstructors();
        for(Constructor con : cons) {
            System.out.println(con);
        }

        //4.选择构造方法，并用该构造方法创建实例
        Constructor con = clazz.getDeclaredConstructor(String.class, int.class);
        Object o = con.newInstance("Jack", 23);
        System.out.println(o);

        //5.获取成员方法
        Method m = clazz.getDeclaredMethod(methodName);
        m.setAccessible(true);
        m.invoke(o);

    }
}
