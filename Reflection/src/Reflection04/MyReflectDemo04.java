package Reflection04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo04 {
    /*
    *   Class类中用于获取成员方法的方法
    *       Method[] getMethods(): 返回所有公共成员方法对象的数组
    *       Method[] getDeclaredMethods(): 返回所有成员方法对象的数组
    *       Method getMethod(String name, Class<?>... parameter): 返回单个公共成员方法
    *       Method getDeclaredMethod(String name, Class<?>... parameter): 返回单个成员方法
    * */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //1. 获取class字节码文件对象
        Class clazz = Class.forName("Reflection04.Student");

        //2. 获取里面所有的公共方法对象(包含父类所有的公共方法)
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        //3. 获取里面所有的方法对象(不能获取父类，但是可以获取本类中所有方法)
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        //5. 获取单个公共方法
        Method eat1 = clazz.getMethod("eat", String.class);
        System.out.println(eat1);

        //6. 获取单个方法(overloading)
        Method eat2 = clazz.getDeclaredMethod("eat", String.class, int.class);
        System.out.println(eat2);

        //7. 获取单个方法()
        Method sleep = clazz.getDeclaredMethod("sleep");
        System.out.println(sleep);

        //8. 获取方法的修饰符
        int modifiers = eat1.getModifiers();
        System.out.println(modifiers);

        //9. 获取方法的行参
        Parameter[] parameters = eat2.getParameters();
        for(Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //9. 获取方法抛出的异常
        Class[] exceptionTypes = eat2.getExceptionTypes();
        for( Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        //10. 方法运行
        /*
        *   Object invoke(Object obj, Object.. args): 运行方法
        *   参数一：用obj对象调用该方法
        *   参数二：调用方法的传递参数（如果没有就不写）
        *   返回值：方法的返回值（如果没有就不写）
        * */
        Student s = new Student();
        //参数1 s: 方法的调用者
        //参数2 pizza: 调用方法时传递的实际参数
        //参数3 3: 调用方法时传递的实际参数

        eat2.setAccessible(true); //eat2是私有方法，需要临时获得权限
        eat2.invoke(s, "pizza", 3);

        String res = (String) eat1.invoke(s,"pizza");
        System.out.println(res);
    }
}
