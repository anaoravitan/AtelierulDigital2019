package lab3.Singleton;

public class LazySingleton {
    private static LazySingleton LS = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (LS == null) {
            LS = new LazySingleton();
        }
        return LS;
    }
}
