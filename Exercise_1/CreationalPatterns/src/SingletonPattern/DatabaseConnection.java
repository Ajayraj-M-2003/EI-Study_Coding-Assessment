package SingletonPattern;

public class DatabaseConnection {
    // Static variable to hold the single instance
    private static DatabaseConnection instance;

    // Private constructor to prevent instantiation from outside
    private DatabaseConnection() {
        System.out.println("Database connection created.");
    }

    // Public method to provide access to the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Example method to simulate database operation
    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }
}
