package Decorator;
//基本类
public class BlackCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "A cup of plain black coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
