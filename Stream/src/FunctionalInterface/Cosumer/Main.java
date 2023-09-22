package FunctionalInterface.Cosumer;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // 使用 Consumer<T> 接口，接受一个输入参数并返回 void
        List<String> names = new ArrayList<>();
        java.util.function.Consumer<String> nameConsumer = name -> {
            System.out.println("Adding name: " + name);
            names.add(name);
        };
        nameConsumer.accept("Alice");
        nameConsumer.accept("Bob");
        System.out.println("Names: " + names);
    }
}
