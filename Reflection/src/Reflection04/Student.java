package Reflection04;

import java.io.IOException;

public class Student {
    private String name;
    private int age;

    public Student() {

    }


    public Student(String name) {
        this.name = name;
    }

    protected Student(int age) {
        this.age = age;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void sleep() {
        System.out.println("Sleeping");
    }

    public String eat(String something) {
        System.out.println("Eating " + something);
        return "Finish";
    }

    private void eat(String something, int num) throws IOException, NullPointerException {
        System.out.println("Eating " + num + " " + something);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
