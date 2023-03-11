package lesson8.Homework.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Игорь Иванович", 38, "Руководитель кампании");
        Worker worker = new Worker("Сергей Алексеевич", 31, 1500);
        Accountant accountant = new Accountant("Галина Ивановна", 46, "Бухгалтер");

        director.sayHello();
        director.printPosition();

        worker.sayHello();
        worker.printPosition();

        accountant.sayHello();
        accountant.printPosition();
    }

}
