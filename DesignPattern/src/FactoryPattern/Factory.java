package FactoryPattern;

public class Factory {
    public static ICC createICC(String name) {
        switch (name) {
            case "Antra":
                return new Antra();
            case "Pilot":
                return new Pilot();
            case "BeaconFire":
                return new BeaconFire();
            default:
                throw new RuntimeException("Can not create this ICC company " + name);
        }
    }
}
