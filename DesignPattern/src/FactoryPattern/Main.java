package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ICC icc1 = Factory.createICC("Antra");
        ICC icc2 = Factory.createICC("BeaconFire");
        ICC icc3 = Factory.createICC("Pilot");
        icc1.printCompanyName();
        icc2.printCompanyName();
        icc3.printCompanyName();
    }
}