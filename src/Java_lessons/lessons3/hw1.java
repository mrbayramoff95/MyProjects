package Java_lessons.lessons3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static class twoMassiveMax {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int number = random.nextInt(5);
            int[][][] array = new int[5][5][5];

            System.out.println("введите значение:");
            int input_number = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[j].length; k++) {
                        array[i][j][k] = random.nextInt(5);
                    }
                }
            }
            System.out.println(Arrays.deepToString(array));

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[j].length; k++) {
                        array[i][j][k] += input_number;
                    }
                }
            }
            System.out.println(Arrays.deepToString(array));
        }
    }
}
