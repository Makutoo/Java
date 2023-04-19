package Thread01;

public class ThreadDemo {
    /*
    *  String getName()                  返回此线程的名称 (如果没有给线程设置名字，线程也有默认名字 格式：Thread-X (X序号，从0开始))
    *  void setName(String name)         设置线程的名字
    *  static Thread currentThread()     获取当前线程的对象
    *  static void sleep(long time)      让线程休眠制定的时间，单位为毫秒
    * */

    public static void main(String[] args) throws InterruptedException {
        // 1. 创建线程的对象
        MyThread t1 = new MyThread("abc"); //使用构造方法设置名字
        MyThread t2 = new MyThread();

        // 2. 开启线程
        t1.start();
        t2.start();

        // 哪条线程执行到这个方法，此时获取的就是哪条线程的对象
        Thread t = Thread.currentThread(); //获取main线程对象
        String name = t.getName();
        System.out.println(name);

        // 哪条线程执行到这个方法，休眠的就是哪条线程
        System.out.println("11111111");
        Thread.sleep(3000); //main线程睡眠3秒
        System.out.println("22222222");
    }

}
