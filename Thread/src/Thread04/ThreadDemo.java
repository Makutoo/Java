package Thread04;

public class ThreadDemo {
    /*
    *  public static void yield()       出让线程/礼让线程
    *  表示出让当前CPU的执行权, 重新和其他线程争夺CPU，可以使打印结果相对均匀但无法保证绝对均匀
     * */

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
