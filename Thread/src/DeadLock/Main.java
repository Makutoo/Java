package DeadLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object mutex1 = new Object();
        Object mutex2 = new Object();
        Thread t1 = new Thread(()->{
            synchronized (mutex1) {
                System.out.println("t1 got mutex1");
                synchronized (mutex2) {
                    System.out.println("t1 get mutex2");
                    System.out.println("t1 preform its business logic...");
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (mutex2) {
                System.out.println("t2 got mutex2");
                synchronized (mutex1) {
                    System.out.println("t2 get mutex1");
                    System.out.println("t2 preform its business logic...");
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("DeadLock doesn't occur");
    }
}
