package Thread06;

public class ThreadDemo {
    /*
    *  某电影公司目前正在上映国产大片，共有100张票，而它有3个窗口
    * */
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("t1");
        t2.setName("t1");
        t3.setName("t1");

        t1.start();
        t2.start();
        t3.start();
    }
}
