package lessons2;

import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int su2 = 0;
        int i=1;
        for (; i<= a; i++){
            su2 = su2 + i;
        }
        System.out.println (su2);
    }
}
