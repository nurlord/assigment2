// Singleton pattern implementation 

public class DatabaseConnection {

  // Static instance of the class private to control access
  private static DatabaseConnection instance;

  // Private constructor to prevent instantiation
  private DatabaseConnection() {
    // Initialize connection
  }

  // Public method to provide access to the single instance
  public static synchronized DatabaseConnection getInstance() {
    if (instance == null) {
      instance = new DatabaseConnection();
    }
    return instance;
  }

  public void connect() {
    System.out.println("Connected to the database");
  }
}
