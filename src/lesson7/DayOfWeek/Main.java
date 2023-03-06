package lesson7.DayOfWeek;
public class Main
{
    public static void main(String[] args)
    {
        DayOfWeek day = DayOfWeek.MONDAY;

        if (day == DayOfWeek.MONDAY)
        {
            System.out.println("Понедельник - первый тяжёлый день недели. ");
            System.out.println("Вторник - второй день недели. ");
            System.out.println("Среда - третий день недели. ");
            System.out.println("Четверг - четвёртый день недели. ");
            System.out.println("Пятница - пятый день недели. ");
            System.out.println("Суббота - наконец-то выходной ");
            System.out.println("Воскресенье - выходной. ");
        }
    }
}