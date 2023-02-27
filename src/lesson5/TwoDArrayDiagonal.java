package lesson5;

public class TwoDArrayDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - i - 1] + " ");
        }
        System.out.println();
    }
}
