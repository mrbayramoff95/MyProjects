package lessons3;

import java.util.Arrays;

public class hw3TwoMassive {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
    }
}
