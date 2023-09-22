package Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<Observer> observers;
    private boolean state;
    public Topic() {
        observers = new ArrayList<>();
        state = true;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void changeState() {
        this.state = !state;
        notifyAllObserver();
    }

    public void notifyAllObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }


}
