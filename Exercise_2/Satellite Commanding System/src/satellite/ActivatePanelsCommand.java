package satellite;

public class ActivatePanelsCommand implements Command {
    private Satellite satellite;

    public ActivatePanelsCommand() {
        this.satellite = Satellite.getInstance();
    }

    @Override
    public void execute() {
        satellite.activatePanels();
    }
}
