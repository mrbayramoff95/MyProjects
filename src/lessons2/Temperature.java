package lessons2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {


        int i;
        System.out.println("Температура на улице:");
        Scanner temp = new Scanner(System.in);
        i = temp.nextInt();
        if (i > -5) {
            System.out.println("Тепло");
        } else if (-5 >= i & i > -20) {
            System.out.println("Нормально");
        } else if (-20 >= i) {
            System.out.println("Холодно");

        }
    }
}

