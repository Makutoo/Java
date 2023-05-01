package Reflection03;

import java.lang.reflect.Field;

public class MyReflectDemo03 {
    /*
    *   Class类中用于获取成员变量的方法
    *       Field[] getFields():            返回所有公共成员变量的对象数组
    *       Field[] getDeclaredFields()：    返回所有成员变量的对象数组
    *       Field getField(String name):    返回单个公共成员变量对象
    *       Field getDeclaredField(String name):    返回单个成员变量对象
    *
    *   加Declared: 获取所有的（public, private, protected)
    *   不加Declared: 获取public
    *
    *   Field类中用于创建对象的方法
    *       void set(Object obj, Object value): 赋值
    *       Object get(Object obj): 获取值
    *
    * */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //1.获取class字节码文件的对象
        Class clazz = Class.forName("Reflection03.Student");

        //2.获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //3.获取单个成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        //4.获取成员变量的权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);


        //5.获取成员变量的类型
        Class<?> type = name.getType();
        System.out.println(type);

        //6.获取成员变量记录的值
        Student s = new Student("zhangsan", 23, "man");
        System.out.println(s);
        name.setAccessible(true); //name是私有Field，所以需要用setAccessible(true)来临时取消权限校验（暴力反射）
        String value = (String) name.get(s); //获取s这个对象name field记录的值
        System.out.println(value);

        //7.修改对象里面记录的值
        name.set(s, "lisi"); //参数一：哪个对象？， 参数二：换成什么值？
        System.out.println(s);
    }
}
