package lessons2;

public class UnevenNumbersFrom1To99 {
    public static void main(String[] args) {
        for (int i = 0; i < 99; i++) {
            {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        }
    }
}