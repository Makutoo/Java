package Thread09;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    /*
    *  需求：利用阻塞队列完成生产者和消费者（等待唤醒机制）的代码
    *  细节：生产者和消费者必须使用同一个阻塞队列
    * */
    public static void main(String[] args) {

        //1. 创建阻塞队列的对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1); //有界的队列

        //2. 把队列对象通过构造器传入给Cook和Foodie
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //3. 开启线程
        c.start();
        f.start();
    }
}
