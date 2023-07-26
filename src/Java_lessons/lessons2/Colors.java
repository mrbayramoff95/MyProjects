package Java_lessons.lessons2;

import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        int i = 0;


        System.out.println("Введите номер :");
        Scanner cvt = new Scanner(System.in);

        i = cvt.nextInt();
        switch (i) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Желтый");
                break;
            case 3:
                System.out.println("Оранжевый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Фиолетовый");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Голубой");
                break;

        }
    }
}