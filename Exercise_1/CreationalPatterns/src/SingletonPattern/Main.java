package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        // Get the single instance of SingletonPattern.DatabaseConnection
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();

        // Attempt to get another instance
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.disconnect();

        // Check if both instances are the same
        if (connection1 == connection2) {
            System.out.println("Both instances are the same.");
        }
    }
}
