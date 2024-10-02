package satellite;

public class CollectDataCommand implements Command {
    private Satellite satellite;

    public CollectDataCommand() {
        this.satellite = Satellite.getInstance();
    }

    @Override
    public void execute() {
        satellite.collectData();
    }
}
