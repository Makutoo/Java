package Generics07;

import java.util.ArrayList;


public class GenericsDemo07 {
    public static void main(String[] args) throws ClassNotFoundException {


        LiHuaCat liHua = new LiHuaCat("liHua", 1);
        BoSiCat boShi = new BoSiCat("boShi", 2);

        TaiDiDog taiDi = new TaiDiDog("TaiDi", 3);
        HaShiQiDog haShiQi = new HaShiQiDog("HaShiQi", 4);

        ArrayList<LiHuaCat> liHuaList = new ArrayList<>();
        ArrayList<BoSiCat> boShiList = new ArrayList<>();
        ArrayList<TaiDiDog> taiDiList = new ArrayList<>();
        ArrayList<HaShiQiDog> hasShiQiList = new ArrayList<>();

        liHuaList.add(liHua);
        boShiList.add(boShi);
        taiDiList.add(taiDi);
        hasShiQiList.add(haShiQi);

        keepPet1(liHuaList);
        keepPet1(boShiList);

        keepPet2(taiDiList);
        keepPet2(hasShiQiList);

        keepPet3(liHuaList);
        keepPet3(boShiList);
        keepPet3(taiDiList);
        keepPet3(hasShiQiList);
    }

    public static void keepPet1(ArrayList<? extends Cat> list) {
        //该方法能遍历所有品种的猫，但是不能养狗
        for (Cat cat : list) {
            cat.eat();
        }
    }

    public static void keepPet2(ArrayList<? extends Dog> list) {
        //该方法能遍历所有品种的狗，但是不能养猫
        for (Dog dog : list) {
            dog.eat();
        }
    }

    public static void keepPet3(ArrayList<? extends Animal> list) {
        //该方法能遍历所有的动物，但是不能传递其他类型
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
