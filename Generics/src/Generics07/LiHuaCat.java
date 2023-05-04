package Generics07;


import java.text.MessageFormat;

public class LiHuaCat extends Cat{

    public LiHuaCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(MessageFormat.format("A {0} years old LiHua cat called {1} is eating fish.", super.getAge(), super.getName()));
    }
}
