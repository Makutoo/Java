package Reflection06;

public class Teacher {
    private String name;
    private int salary;

    public void teach() {
        System.out.println("Teacher is teaching");
    }
    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public Teacher() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
