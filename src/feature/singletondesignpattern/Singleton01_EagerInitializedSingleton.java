package feature.singletondesignpattern;

public class Singleton01_EagerInitializedSingleton {
    private static final Singleton01_EagerInitializedSingleton instance = new Singleton01_EagerInitializedSingleton();

    private Singleton01_EagerInitializedSingleton() {
    }

    public static Singleton01_EagerInitializedSingleton getInstance() {
        return instance;
    }
}