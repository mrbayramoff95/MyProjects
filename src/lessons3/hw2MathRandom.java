package lessons3;

public class hw2MathRandom {
    public static void main(String[] args) {
        int[] arr = {1,2,3,88,36,65,96};
        for (int i = 0; i < arr.length; i++) {
            arr [i] = (int) (Math.random() * 100);
            System.out.printf("\t", arr[i]);
        }
        int max = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] > max);{
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
