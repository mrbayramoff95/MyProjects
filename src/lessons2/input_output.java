package lessons2;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        int i;
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        if (i % 2 == 0) {
            System.out.println("Число " + i + " четное");
        } else {
            System.out.println("Число " + i + " нечетное");

        }
    }
}