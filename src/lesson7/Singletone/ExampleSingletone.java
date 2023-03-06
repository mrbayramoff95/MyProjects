package lesson7.Singletone;

public class ExampleSingletone {
    private static ExampleSingletone instance;

    private ExampleSingletone() {
    }

    public static ExampleSingletone getInstance() {
        if (instance == null) {
            instance = new ExampleSingletone();
        }
        return instance;
    }
}
