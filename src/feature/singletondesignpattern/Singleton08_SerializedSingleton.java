package feature.singletondesignpattern;

import java.io.Serializable;

public class Singleton08_SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    public Singleton08_SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final Singleton08_SerializedSingleton instance = new Singleton08_SerializedSingleton();
    }

    public static Singleton08_SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}