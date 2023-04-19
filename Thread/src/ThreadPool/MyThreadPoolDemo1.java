package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo1 {

    public static void main(String[] args) throws InterruptedException {
        /*
         * Q: 为什么要线程池？
         * A: 系统创建一个线程的成本是比较高的，因为它涉及到与操作系统交互。当程序中需要创建大量生成期很短暂的线程时，
         *    频繁的创建和销毁线程对系统资源消耗有可能大于业务本身的处理消耗
         * */
        //1.获取线程池对象
//		ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        //2.提交任务
        pool1.submit(new MyRunnable());
        Thread.sleep(1000); // 等待线程1完成第一个任务，返回线程池等待下一个任务
        pool1.submit(new MyRunnable()); //新的任务，但是由于线程1已经完成前一个任务，线程池仍然将新任务分配给线程1，不会有线程2创建
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());

        //3.销毁线程池
        pool1.shutdown();
    }
}