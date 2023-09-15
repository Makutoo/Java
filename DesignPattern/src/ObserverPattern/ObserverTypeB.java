package ObserverPattern;

public class ObserverTypeB extends Observer{
    public ObserverTypeB(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println(super.name + " receive the update");
    }
}
