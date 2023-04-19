package Thread05;

public class ThreadDemo {
    /*
    *  public final void join()         插入线程/插队线程
    * */

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setName("t");
        t.start();

        // 插入线程
        t.join();

        //main线程等待t线程执行完再执行
        for(int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }


}
