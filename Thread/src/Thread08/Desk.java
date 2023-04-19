package Thread08;

public class Desk {
    /*
    * 作用：控制生产者消费者的执行
    * */
    public static int foodFlag = 0; // 0: 没有食物， 1: 有食物

    public static int count = 10;
    public static Object lock = new Object();
}
