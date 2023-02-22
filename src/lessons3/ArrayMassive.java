package lessons3;

import java.util.Arrays;

public class ArrayMassive {
    public static void main(String[] args) {
        int arr[] = {9, 4, 7, 5, 2, 0, 3, 6, 1, 8};
        int count  = 0;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                if (arr[j] < arr[j + 1]) {
                    sum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sum;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println( +count);
    }
}
