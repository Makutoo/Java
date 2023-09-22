package FunctionalInterface.Supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // 使用 Supplier<T> 接口，不接受输入参数并返回一个结果
        Supplier<Integer> mySupplier = () -> {
            return 1 + 1;
        };
        int result = mySupplier.get();
        System.out.println(result);
    }
}
