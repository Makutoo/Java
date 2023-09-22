package Factory;

public class ICCFactory {
    public static ICC get(String iccName) {
        switch (iccName) {
            case "Antra" :
                return new Antra();
            case "BeaconFire" :
                return new BeaconFire();
            case "Pilot":
                return new Pilot();
            default:
                throw new NoSuchICCException("No Such ICC Company in United State");
        }
    }
}
