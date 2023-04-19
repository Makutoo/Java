package Thread07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
            lock.lock();
            if(ticket == 100) {
                lock.unlock();
                break;
            }else {
                try {
                    ticket++;
                    System.out.println(getName() + " is selling ticket " + ticket);
                    lock.unlock();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
