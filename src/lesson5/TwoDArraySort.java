package lesson5;

import java.util.Arrays;

public class TwoDArraySort {
    public static void main(String[] args) {
        int[][] sort = {{13, 21, 12}, {16, 51, 42}, {19, 28, 17}};

        for (int i = 0; i < sort.length; i++) {
            Arrays.sort(sort[i]);
        }

        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort[i].length; j++) {
                System.out.print(sort[i][j] + " ");
            }
            System.out.println();
        }
    }
}
