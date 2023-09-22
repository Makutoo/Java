package FunctionalInterface.Predicate;

import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        Predicate<Integer> myPredicate = (num) -> {
            System.out.println(num);
          if(num % 2 == 0) {
              return true;
          } else {
              return false;
          }
        };
        boolean res = myPredicate.test(number);
        if(res) {
            System.out.println("Random number is even.");
        } else {
            System.out.println("Random number is odd.");
        }
    }
}
