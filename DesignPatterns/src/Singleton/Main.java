package Singleton;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Try to clone Singleton Object
        Singleton mySingleton = Singleton.getInstance();
        Singleton clonedSingleton = null;
        try {
            clonedSingleton = (Singleton) mySingleton.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(clonedSingleton);


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
