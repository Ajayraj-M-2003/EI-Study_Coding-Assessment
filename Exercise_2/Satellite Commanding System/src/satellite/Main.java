package satellite;

public class Main {
    public static void main(String[] args) {
        // Initialize the Satellite (Singleton)
        Satellite satellite = Satellite.getInstance();

        // Create Command Invoker
        CommandInvoker invoker = new CommandInvoker();

        // Execute commands
        invoker.setCommand(new RotateCommand("South"));
        invoker.executeCommand();

        invoker.setCommand(new ActivatePanelsCommand());
        invoker.executeCommand();

        invoker.setCommand(new CollectDataCommand());
        invoker.executeCommand();

        invoker.setCommand(new DeactivatePanelsCommand());
        invoker.executeCommand();

        // Check the final state of the satellite
        System.out.println("\nFinal Satellite State:");
        System.out.println("Orientation: " + satellite.getOrientation());
        System.out.println("Solar Panels: " + satellite.getSolarPanelsStatus());
        System.out.println("Data Collected: " + satellite.getDataCollected());
    }
}
