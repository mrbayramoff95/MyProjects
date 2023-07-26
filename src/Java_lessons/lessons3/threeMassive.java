package Java_lessons.lessons3;

public class threeMassive {
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
}