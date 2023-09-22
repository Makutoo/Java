package Observer;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Topic topic = new Topic();
        topic.addObserver(s1);
        topic.addObserver(s2);
        topic.addObserver(t1);
        topic.addObserver(t2);

        topic.changeState();

        topic.removeObserver(s2);
        topic.changeState();
    }
}
