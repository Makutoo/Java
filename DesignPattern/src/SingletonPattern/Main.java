package SingletonPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                Singleton s = Singleton.getInstance();
                System.out.println(s);
            }
        });

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                Singleton s = Singleton.getInstance();
                System.out.println(s);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
