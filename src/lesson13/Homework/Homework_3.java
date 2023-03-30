package lesson13.Homework;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        FunctionalInterface<String> reverse = str -> {
            StringBuilder builder = new StringBuilder(str);
            builder.reverse();
            return builder.toString();
        };

        FunctionalInterface<Integer> factorial = num -> {
            int result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        };

        if (choice == 1) {
            String str = "Android Developer";
            System.out.println("Original string: " + str);
            System.out.println("Reversed string: " + reverse.execute(str));
        } else if (choice == 2) {
            int num = 5;
            System.out.println("Factorial of " + num + ": " + factorial.execute(num));
        }
    }

}
