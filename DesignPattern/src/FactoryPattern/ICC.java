package FactoryPattern;

public abstract class ICC {
    private String companyName;

    public void printCompanyName() {
        System.out.println("Hi, this is "+ companyName + ", and welcome!");
    }

    public ICC(String companyName) {
        this.companyName = companyName;
    }
}
