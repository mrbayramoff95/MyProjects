package lesson5;

public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] arr = {{11, 56, 13}, {12, 42, 36}, {13, 18, 29}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов в массиве равна: " + sum);
    }
}
