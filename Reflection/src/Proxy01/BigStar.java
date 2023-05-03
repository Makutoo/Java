package Proxy01;

public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }
    @Override
    public String sing(String name) {
        System.out.println(this.name + " is singing " + name);
        return "Thanks";
    }

    @Override
    public void dance() {
        System.out.println(this.name + " is dancing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BigStar{" +
                "name='" + name + '\'' +
                '}';
    }
}
