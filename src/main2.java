// The Thread-Safe "Lazy" Singleton Registry
// SingletonRegistry.java
public class SingletonRegistry {
    // ConcurrentHashMap is the key to thread safety here.
    private static final ConcurrentHashMap<Class<?>, Object> registry = new ConcurrentHashMap<>();

    // Private constructor to prevent instantiation.
    private SingletonRegistry() {}

    // The single, thread-safe public access point.
    public static <T> T getInstance(Class<T> type) {
        // The computeIfAbsent method is atomic.
        // It ensures that the lambda function (the code to create the instance)
        // is executed only once per class type, even with multiple concurrent calls.
        return (T) registry.computeIfAbsent(type, k -> {
            try {
                // Use reflection to create a new instance of the class.
                return type.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new IllegalStateException("Failed to create singleton for " + type.getName(), e);
            }
        });
    }
}

// Main.java (Example usage)
public class main2 {
    // Example singleton classes (must have a no-arg constructor)
    static class DatabaseConnection {
        // ...
    }

    static class LoggingService {
        // ...
    }

    public static void main(String[] args) {
        // Both threads will get the exact same instance of DatabaseConnection
        Thread t1 = new Thread(() -> {
            DatabaseConnection db1 = SingletonRegistry.getInstance(DatabaseConnection.class);
            System.out.println("Thread 1: " + db1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            DatabaseConnection db2 = SingletonRegistry.getInstance(DatabaseConnection.class);
            System.out.println("Thread 2: " + db2.hashCode());
        });

        t1.start();
        t2.start();

        // The registry will create a separate singleton for LoggingService
        LoggingService logger = SingletonRegistry.getInstance(LoggingService.class);
    }
}
