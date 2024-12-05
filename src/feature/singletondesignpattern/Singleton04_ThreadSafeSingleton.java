package feature.singletondesignpattern;

public class Singleton04_ThreadSafeSingleton {
    private static Singleton04_ThreadSafeSingleton instance;

    public Singleton04_ThreadSafeSingleton() {
    }

    public static synchronized Singleton04_ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new Singleton04_ThreadSafeSingleton();
        }
        return instance;
    }
}