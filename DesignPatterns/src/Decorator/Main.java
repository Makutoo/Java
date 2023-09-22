package Decorator;

//When we want to enhance behaviour of our existing object dynamically as and when required then we can use decorator.
//Decorator wraps an object within itself and provides same interface as the wrapped object.
//So the client of original object doesn't need to change
//A decorator provides alternative to subclassing for extending functionality of existing classes.
public class Main {
    public static void main(String[] args) {
        //Decorator support recursive composition,
        //and so this pattern lends itself to creation of lots of small objects
        //that add "just a little bit" functionality
        //最初是黑咖啡，然后加牛奶，再加糖
        Coffee myCoffee = new SugarCoffee(new MilkCoffee(new BlackCoffee()));
        System.out.println(myCoffee.getDescription());
        System.out.println(myCoffee.cost());
    }
}
