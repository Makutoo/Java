package Observer;

public class Student implements Observer{
    @Override
    public void update() {
        System.out.println(this + " receive the update from topic");
    }
}
