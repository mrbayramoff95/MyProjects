package lesson7.Phone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(251234567, "Samsung", 155);
        Phone phone1 = new Phone(291223344, "iPhone", 165);
        Phone phone2 = new Phone(333213214, "Xiaomi", 175);
        System.out.println("Телефон 1: model " + phone.getModel() + " number " + phone.getNumber() + " weight " + phone.getWeight());
        System.out.println("Телефон 2: model " + phone1.getModel() + " number " + phone1.getNumber() + " weight " + phone1.getWeight());
        System.out.println("Телефон 3: model " + phone2.getModel() + " number " + phone2.getNumber() + " weight " + phone2.getWeight());
        phone.receiveCall("Dima");
        phone1.receiveCall("Masha");
        phone2.receiveCall("Sasha");
        phone.receiveCall("Dima", 251234567);
        phone1.receiveCall("Masha", 291223344);
        phone2.receiveCall("Sasha", 333213214);
        System.out.println(Arrays.toString(phone.sendMessage(251234567, 291223344, 333213214)));

    }
}