package feature.singletondesignpattern;

public class Singleton02_StaticBlockSingleton {
    private static Singleton02_StaticBlockSingleton instance;

    public Singleton02_StaticBlockSingleton() {
    }

    static {
        try {
            instance = new Singleton02_StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Singleton02_StaticBlockSingleton getInstance() {
        return instance;
    }
}