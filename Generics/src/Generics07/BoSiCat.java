package Generics07;

import java.text.MessageFormat;

public class BoSiCat extends Cat{

    public BoSiCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(MessageFormat.format("A {0} years old BoSi cat called {1} is eating cookies.", super.getAge(), super.getName()));
    }
}
