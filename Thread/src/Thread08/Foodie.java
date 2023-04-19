package Thread08;

public class Foodie extends Thread{
    /*
    * 1. 循环
    * 2. 同步代码块
    * 3. 判断共享数据是否到了末尾（到了末尾）
    * 4. 判断共享数据是否到了末尾（没有到末尾）
    * wait() - releases the lock and continues on the next line when it gets notified
    * notify(), notifyAll() - don't release the lock.
    * - They simply make waiting threads runnable again (not idle).
    * - They will have the right to enter WHEN THE CURRENT THREAD REACHES THE END OF ITS SYNC BLOCK,
    * - and the Thread scheduler tells them that the lock has been released. The fight for the lock begins again
    * */

    @Override
    public void run() {
        while(true) {
            synchronized (Desk.lock) {
                if(Desk.count == 0) {
                    System.out.println("Foodie cannot eat anymore");
                    break;
                } else {
                    if(Desk.foodFlag == 1) {
                        System.out.println("There is a food on the desk, Foodie eats the food. " + "Foodie is eating food #"+ Desk.count);
                        Desk.count--;
                        Desk.foodFlag = 0;
                        Desk.lock.notifyAll(); //唤醒这把锁绑定
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        }
    }

}
