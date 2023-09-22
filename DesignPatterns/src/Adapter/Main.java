package Adapter;

public class Main {
    //We gave ab existing object which provides the functionality that client need.
    //But client code doesn't use this object because it expects an object with different interface
    //Using adapter design pattern we make this existing object work with client by adapting the object to clients' expected interface
    //This pattern is also called as wrapper as it "wraps" existing object
    public static void main(String[] args) {
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        Employee employee = new Employee("Alice", "Data Engineer", "Boulder, CO");

        // designCard function 期待的是实现了Customer Interface的类, employee不是Customer, 报错，不兼容
        // businessCardDesigner.designCard(employee);


        EmployeeCustomerAdapter employeeCustomerAdapter = new EmployeeCustomerAdapter(employee);
        String card = businessCardDesigner.designCard(employeeCustomerAdapter);
        System.out.println(card);
    }
}
