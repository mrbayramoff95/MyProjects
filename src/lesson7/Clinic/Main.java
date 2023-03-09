package lesson7.Clinic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        Patient patient = new Patient(scanner.next());

        patient.appointment();
        System.out.println(patient.toString());
    }
}
