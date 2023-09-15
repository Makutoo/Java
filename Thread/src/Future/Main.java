package Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = executorService.submit(() -> { //这是传递了callable
            int sum = 0;
            for (int i = 1; i <= 1000000; i++) {
                sum += i;
            }
            return sum; //有返回值

        });
        Future<?> future2 = executorService.submit(() -> { //这是传递了runnable
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            //没有返回值
            //如果这里加上返回值，那就不是runnable了，变成callable了
        });


        while(!future1.isDone()) {
            System.out.println("还没算完");
        }
        int sum = future1.get();
        System.out.println("sum= " + sum);
        executorService.shutdown();
    }
}
