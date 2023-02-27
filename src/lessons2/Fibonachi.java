package lessons2;

public class Fibonachi {
    public static void main(String[] args) {
        int i0 = 1;
        int i1 = 1;
        int i2;
        System.out.print(i0 + " " + i1 + " ");
        for (int i = 3; i <= 11; i++) {
            i2 = i0 + i1;
            System.out.print(i2 + " ");
            i0 = i1;
            i1 = i2;
        }
        System.out.println();
    }
}

