package Thread08;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Foodie f = new Foodie();
        Cook c = new Cook();

        f.start();
        c.start();

        f.join();
        c.join();
    }
}
