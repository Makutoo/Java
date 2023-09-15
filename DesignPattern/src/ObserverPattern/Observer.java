package ObserverPattern;

public abstract class Observer {
    public String name;

    public Observer(String name) {
        this.name = name;
    }

    public abstract void update();

}
