package lesson6.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Внести сумму\n2. Снять деньги\n3. Посмотреть счет");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Введите количество купюр, которые вы хотите внести (20, 50, 100):");
                    atm.getMoney(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Введите сумму, которую хотите снять:");
                    if (atm.dispenseMoney(scanner.nextInt())) {
                        System.out.println("Операция не проведена!");
                    }
                    break;
                case 3:
                    System.out.println("Остаток на счету:" + atm.sum());
                    break;
            }
        }
    }
}