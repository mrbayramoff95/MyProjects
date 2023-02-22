package lessons3;

import java.util.Scanner;

public class HwStringMassive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.printf("Вы ввели:");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            System.out.printf("Вы ввели:" + arr[i]);
        }
        System.out.println(" ");
    }
}
