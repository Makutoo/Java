package Thread03;

public class ThreadDemo {

    /*
    * final void setDaemon(boolean on)      设置守护线程
    * 当其他的非守护线程执行完毕之后，守护线程会陆续结束
    * */

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("备胎");

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
