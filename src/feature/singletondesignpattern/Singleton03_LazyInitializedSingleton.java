package feature.singletondesignpattern;

public class Singleton03_LazyInitializedSingleton {
    private static Singleton03_LazyInitializedSingleton instance;

    public Singleton03_LazyInitializedSingleton() {
    }

    public static Singleton03_LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new Singleton03_LazyInitializedSingleton();
        }
        return instance;
    }
}