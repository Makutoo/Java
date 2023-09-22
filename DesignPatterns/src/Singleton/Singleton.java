package Singleton;

public class Singleton {
    private Singleton() {}

    private static volatile Singleton singleton;
    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    //Overcome Cloning Issue: Cloning is the concept to create duplicate objects. Suppose, we create clone of a singleton object, then it will create a copy.
    //Now there are two instances of a singleton class, hence the class is no more singleton.
    //To overcome this issue, override the clone() method and throw CloneNotSupportedException from clone method.
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cloning of Singleton is not allowed.");
    }

    //Overcome Serialization Issue: Serialization is used to convert an object of a byte stream and save in a file or send it over a network.
    //Suppose you serialize an object of a singleton class. Then if you de-serialize that object it will create a new instance
    //and hence break the singleton pattern. To overcome this issue, we have to implement the readResolve() method in the Singleton class.

    //readResolve 方法是由Java的对象输入流（ObjectInputStream）在反序列化对象时调用的。
    //当你使用ObjectInputStream从流中读取一个对象并将其反序列化时，如果目标类实现了readResolve 方法，那么该方法将会被自动调用
    //所以这里我们直接返回Singleton唯一的一个实例
    protected Object readResolve() {
        return getInstance();
    }
}
