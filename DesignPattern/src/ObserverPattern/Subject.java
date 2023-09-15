package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }
    public void notifyAllObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }


}
