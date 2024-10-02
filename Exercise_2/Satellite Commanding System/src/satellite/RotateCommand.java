package satellite;

public class RotateCommand implements Command {
    private String direction;
    private Satellite satellite;

    public RotateCommand(String direction) {
        this.direction = direction;
        this.satellite = Satellite.getInstance();  // Get the singleton instance of Satellite
    }

    @Override
    public void execute() {
        satellite.setOrientation(direction);
    }
}
