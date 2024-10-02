package satellite;

public class Satellite {
    private static Satellite instance;

    private String orientation;
    private String solarPanels;
    private int dataCollected;

    private Satellite() {
        this.orientation = "North";  // Initial state
        this.solarPanels = "Inactive";
        this.dataCollected = 0;
    }

    public static Satellite getInstance() {
        if (instance == null) {
            instance = new Satellite();
        }
        return instance;
    }

    public void setOrientation(String direction) {
        this.orientation = direction;
        System.out.println("Satellite orientation set to: " + this.orientation);
    }

    public void activatePanels() {
        this.solarPanels = "Active";
        System.out.println("Solar panels activated.");
    }

    public void deactivatePanels() {
        this.solarPanels = "Inactive";
        System.out.println("Solar panels deactivated.");
    }

    public void collectData() {
        if (solarPanels.equals("Active")) {
            this.dataCollected += 10;
            System.out.println("Data collected: " + this.dataCollected);
        } else {
            System.out.println("Cannot collect data. Solar panels are inactive.");
        }
    }

    // Getter methods to retrieve current state
    public String getOrientation() {
        return orientation;
    }

    public String getSolarPanelsStatus() {
        return solarPanels;
    }

    public int getDataCollected() {
        return dataCollected;
    }
}
