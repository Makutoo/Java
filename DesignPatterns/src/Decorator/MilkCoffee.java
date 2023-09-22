package Decorator;
// 具体装饰者
public class MilkCoffee implements Coffee{
    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", plus some milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2.0;
    }
}
