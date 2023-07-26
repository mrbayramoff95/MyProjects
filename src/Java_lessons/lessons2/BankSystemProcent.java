package Java_lessons.lessons2;

import java.util.Scanner;

public class BankSystemProcent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = scanner.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int procent = scanner.nextInt();

        for (int i = 1; i <= procent; i++) {
            sum += sum * 0.07;
        }
        System.out.println("После " + procent + " месяца(ов)");
        System.out.println("Сумма составит: " + sum);
    }
}
