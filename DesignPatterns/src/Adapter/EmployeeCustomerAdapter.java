package Adapter;

//想象: Customer是一个USB-C接口, Employee是一个USB的头
//EmployeeCustomerAdapter是转换器, 把USB头放入转换器中, 转换器的另一端是USB-C的头
public class EmployeeCustomerAdapter implements Customer{
    private Employee employee;

    public EmployeeCustomerAdapter(Employee employee) {
        this.employee = employee; //把USB头放入转换器中
    }

    //转换器的内部转换实现
    @Override
    public String getFullName() {
        return employee.getName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
