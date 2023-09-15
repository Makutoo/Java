package ThreadLocal;

public class Main {

    /*
    * ThreadLocal实际上是每一个thread都有一个自己的内部类map对象
    * 当我们调用set方式时候，它就会去找当前thread的map对象，并且把数据存到map对象中
    * 因为在SpringMVC中是用线程池来管理thread的，也就是同一个thread在处理完A请求之后会去处理B请求，为了避免被前世的记忆干扰今生的行为，
    * 所以在每次使用完 ThreadLocal 存储的数据后，最好显式地调用 remove 方法来清理数据，以防止数据在线程结束后仍然存在
    *
    *
    * 使用场景：requests -> controller -> service, controller和service是singleton，只提供方法，不提供field储存数据，
    * 因为请求是多线程的，在controller和service里如果提供field来储存request的数据会造成线程不安全的问题。
    * 但是如果使用threadLocal就可以避免线程不安全，因为它在每个线程中都有自己的副本，因此不同线程之间互不干扰，可以安全地存储和访问线程相关的数据
    * */
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("t1: threadLocal的值为 " + threadLocal.get());
            threadLocal.set(1);
            System.out.println("t1将threadLocal的值设置为1");
            System.out.println("t1: threadLocal的值为 " + threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            System.out.println("t2: threadLocal的值为 " + threadLocal.get());
            threadLocal.set(2);
            System.out.println("t2将threadLocal的值设置为2");
            System.out.println("t2: threadLocal的值为 " + threadLocal.get());
        });

        // t1执行完才执行t2
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
