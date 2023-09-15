package ObserverPattern;



public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ObserverTypeA("A");
        Observer observer2 = new ObserverTypeB("B");
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyAllObserver();
    }
}