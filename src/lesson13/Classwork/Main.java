package lesson13.Classwork;


public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (x, y) ->
                System.out.println("X: " + x + ", Y: " + y + ", sum: " + (x + y));

        myFunctionalInterface.calculate(10, 20);
    }
}