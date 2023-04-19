package Thread09;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true) {
            //不断的从阻塞队列当中获取食物
            try {
                String food = queue.take();
                System.out.println("Foodie takes a " + food + " from the queue");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
