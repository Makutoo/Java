package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // 将对象序列化到文件
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(person);
            System.out.println("Person 对象已序列化到文件 'person.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件中反序列化对象
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Person restoredPerson = (Person) objectIn.readObject();
            System.out.println("从文件 'person.ser' 中反序列化得到的 Person 对象：");
            System.out.println("姓名：" + restoredPerson.getName());
            System.out.println("年龄：" + restoredPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
