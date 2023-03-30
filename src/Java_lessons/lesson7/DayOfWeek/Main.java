package Java_lessons.lesson7.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek[] days = DayOfWeek.values();

        for (DayOfWeek day : days) {
            System.out.println(day);
            if (day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY) {
                System.out.println("Выходной\n");
            } else {
                System.out.println("Будний день\n");
            }
        }
    }
}