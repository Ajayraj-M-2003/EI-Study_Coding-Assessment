package satellite;

public class DeactivatePanelsCommand implements Command {
    private Satellite satellite;

    public DeactivatePanelsCommand() {
        this.satellite = Satellite.getInstance();
    }

    @Override
    public void execute() {
        satellite.deactivatePanels();
    }
}
