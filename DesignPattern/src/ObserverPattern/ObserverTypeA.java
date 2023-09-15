package ObserverPattern;

public class ObserverTypeA extends Observer{
    public ObserverTypeA(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println(super.name + " get the update");
    }


}
