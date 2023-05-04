package Generics07;

import java.text.MessageFormat;

public class HaShiQiDog extends Dog{
    public HaShiQiDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(MessageFormat.format("A {0} years old HaShiQi dog called {1} is eating bone.", super.getAge(), super.getName()));
    }
}
