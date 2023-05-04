package Generics07;

import java.text.MessageFormat;

public class TaiDiDog extends Dog{
    public TaiDiDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(MessageFormat.format("A {0} years old TaiDi dog called {1} is eating meat.", super.getAge(), super.getName()));
    }
}
