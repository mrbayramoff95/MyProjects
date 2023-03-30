package Java_lessons.lesson10;

// Считайте с клавиатуры три строки. А затем:
// 1. Выведите на экран третью строку в неизменном виде.
// 2. Выведите на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
// 3. Выведите на экран первую строку, предварительно преобразовав ее к нижнему регистру.
// ● для вывода результат используйте StringBuilder

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        System.out.print("Введите третью строку: ");
        String thirdString = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(thirdString).append("\n");
        sb.append(secondString.toUpperCase()).append("\n");
        sb.append(firstString.toLowerCase());

        System.out.println(sb.toString());
    }
}
// Как это работает:
// создаем объект Scanner, чтобы считать ввод пользователя с клавиатуры.
// Затем запрашиваем у пользователя ввод трех строк и сохраняем каждую строку в соответствующей переменной.
// создаем StringBuilder объект, который используется для построения и вывода результата.
// добавляем третью строку в StringBuilder в неизменном виде, используя метод append(),
// а также добавляем символ переноса строки (\n), чтобы каждая строка выводилась на отдельной строке.
// добавляем вторую строку в верхнем регистре, используя метод toUpperCase().
// добавляем первую строку в нижнем регистре, используя метод toLowerCase().
// выводим результат, вызывая метод toString() у объекта StringBuilder и используя метод println() для вывода каждой строки на отдельной строке.

