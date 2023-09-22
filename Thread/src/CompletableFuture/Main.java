package CompletableFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        //使用Future获得异步执行结果时，要么调用阻塞方法get()，要么轮询看isDone()是否为true，
        //这两种方法都不是很好，因为主线程也会被迫等待。
        //从Java 8开始引入了CompletableFuture，它针对Future做了改进，可以传入回调对象，
        //当异步任务完成或者发生异常时，自动调用回调对象的回调方法。

        // 异步执行任务1：计算数字5的平方
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            int num = 5;
            return num * num;
        });

        // 异步执行任务2：计算数字3的立方
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            int num = 3;
            return num * num * num;
        });

        // 组合两个任务的结果，并进行加法操作（3的立方加5的平方）
        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + result2);

        // 当所有任务都完成后，打印结果
        combinedFuture.thenAccept(result -> {
            System.out.println("结果：" + result);
        });

        //handle 适用于同时处理正常结果和异常，允许你在任务执行中发生异常时采取特定的处理措施。而thenApply只处理正常结果并无视异常结果
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
            Random r = new Random();
            int num = r.nextInt(100);
            if(num % 2 == 0) {
                return num / 2;
            } else {
                throw new RuntimeException("Num is an odd number");
            }
        });
        //handle 方法返回一个新的 CompletableFuture，你需要捕获它
        CompletableFuture<String> handledFuture = future3.handle((result, exception) -> {
            if(exception != null) {
                return exception.getMessage();
            } else {
                return "Num divided by 2 is: " + result;
            }
        });

        String res = handledFuture.join();
        System.out.println(res);

        //whenComplete 方法不改变 CompletableFuture 的结果类型。它接受一个 BiConsumer，可以处理结果或异常，但它不会返回任何新的结果
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> {
            Random r = new Random();
            int num = r.nextInt(1000);
            if(num % 2 == 0) {
                return num / 2;
            } else {
                throw new RuntimeException("Num is an odd number");
            }
        });

        future4.whenComplete((result, exception) -> {
            if (exception != null) {
                System.err.println("Exception occurred: " + exception.getMessage());
            } else {
                System.out.println("Result: " + result);
            }
        });
    }
}
