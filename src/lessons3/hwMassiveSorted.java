package lessons3;

import java.util.Arrays;

public class hwMassiveSorted {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Неотсортированный массив: " + Arrays.toString(arr));
        int swap;
        boolean SortStatus = false;
        int count=0;
        while (!SortStatus) {
            count++;
            SortStatus = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    SortStatus = false;
                    swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                }
            }
            System.out.println(count+"- -"+"Отсортированный массив" + Arrays.toString(arr));
        }
    }
}
