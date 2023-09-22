package Adapter;

//An existing class used in our system
//Adaptee
public class Employee {
    private String name;
    private String jobTitle;
    private String officeLocation;

    public Employee(String name, String jobTitle, String officeLocation) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.officeLocation = officeLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
