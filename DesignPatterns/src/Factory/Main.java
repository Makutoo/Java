package Factory;

public class Main {
    public static void main(String[] args) {
        ICC antra = ICCFactory.get("Antra");
        ICC beaconFire = ICCFactory.get("BeaconFire");
        ICC pilot = ICCFactory.get("Pilot");

        antra.training();
        beaconFire.training();
        pilot.training();
    }
}
