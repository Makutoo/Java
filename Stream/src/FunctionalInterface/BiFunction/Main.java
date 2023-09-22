package FunctionalInterface.BiFunction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> myBiFunction = (s, num) -> {
            if(Integer.parseInt(s) == (num)) {
                return true;
            } else {
                return false;
            }
        };
        Boolean result1 = myBiFunction.apply("22", 12);
        Boolean result2 = myBiFunction.apply("12", 12);
        System.out.println(result1);
        System.out.println(result2);
    }
}
