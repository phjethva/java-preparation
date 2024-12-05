package feature.singletondesignpattern;

public class Singleton05_ThreadSafeSingletonDoubleLocking {
    private static Singleton05_ThreadSafeSingletonDoubleLocking instance;

    public Singleton05_ThreadSafeSingletonDoubleLocking() {
    }

    public static Singleton05_ThreadSafeSingletonDoubleLocking getInstance() {
        if (instance == null) {
            synchronized (Singleton05_ThreadSafeSingletonDoubleLocking.class) {
                if (instance == null) {
                    instance = new Singleton05_ThreadSafeSingletonDoubleLocking();
                }
            }
        }
        return instance;
    }
}