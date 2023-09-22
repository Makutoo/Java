package Decorator;
// 具体装饰者
public class SugarCoffee implements Coffee{
    private Coffee coffee;

    public SugarCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", plus some sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }
}
