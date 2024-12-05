package feature.singletondesignpattern;

public class Singleton06_BillPughSingleton {
    public Singleton06_BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final Singleton06_BillPughSingleton instance = new Singleton06_BillPughSingleton();
    }

    public static Singleton06_BillPughSingleton getInstance() {
        return SingletonHelper.instance;
    }
}