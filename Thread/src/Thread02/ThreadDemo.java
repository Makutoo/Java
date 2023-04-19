package Thread02;

public class ThreadDemo {
    /*
    *  setPriority(int newPriority)     设置线程的优先级 (1-10, 默认5), 优先级越高抢占到CPU的概率越高
    *  final int getPriority()          获取线程的优先级
    * */
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "t1");
        Thread t2 = new Thread(mr, "t2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

        //获取main线程的优先级
        //System.out.println(Thread.currentThread().getPriority());
    }

}
