package org.example;

public class DoubleCheckingSingleton {

    private static volatile DoubleCheckingSingleton singleton_instance;

    private DoubleCheckingSingleton() {

    }

    public static DoubleCheckingSingleton getSingletonInstance() {
        if (singleton_instance == null) {
            synchronized (DoubleCheckingSingleton.class) {
                if (singleton_instance == null) {
                    singleton_instance = new DoubleCheckingSingleton();
                }
            }
        }
        return singleton_instance;
    }
}
