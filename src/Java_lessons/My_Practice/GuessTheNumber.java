package Java_lessons.My_Practice;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(101);
        int attempts = 0;

        System.out.println("Добро пожаловать в игру Угадай число! Я загадал число от 0 до 100. У вас есть 5 попыток, чтобы угадать его.");

        while (attempts < 5) {
            System.out.print("Введите ваше предположение: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Поздравляю! Вы угадали число!");
                return;
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число больше, чем ваше предположение.");
            } else {
                System.out.println("Загаданное число меньше, чем ваше предположение.");
            }

            attempts++;
        }

        System.out.println("К сожалению, вы не угадали число. Загаданное число было: " + secretNumber);
    }
}
