package Observer;

public class Teacher implements Observer{
    public void update() {
        System.out.println(this + " receive the update from topic");
    }
}
