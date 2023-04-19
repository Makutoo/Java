package Thread09;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;
    public Cook (ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true) {
            //不断的把食物放入阻塞队列当中
            try {
                queue.put("food");
                System.out.println("cook put a food into the queue");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
