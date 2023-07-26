package Java_lessons.My_Practice;

import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        String[][] questions = {
                {"Что такое JDK?", "Java Development Kit"},
                {"Что такое JRE?", "Java Runtime Environment"},
                {"Что такое JVM?", "Java Virtual Machine"},
                {"Как называется основной класс в Java?", "Main"},
                {"Как объявляется переменная в Java?", "Тип_переменной название_переменной;"},
                {"Какой оператор используется для сравнения значений?", "=="},
                {"Какой оператор используется для логического И?", "&&"},
                {"Какой оператор используется для логического ИЛИ?", "||"},
                {"Что такое конструктор в Java?", "специальный метод для создания объектов"},
                {"Какой модификатор доступа используется для переменных и методов, доступных только внутри класса?", "private"},
                {"Что такое наследование в Java?", "процесс создания нового класса на основе существующего"},
                {"Какой ключевой слово используется для наследования в Java?", "extends"},
                {"Какие методы вызываются автоматически при создании объекта и при его удалении?", "конструктор и деструктор"},
                {"Что такое интерфейс в Java?", "абстрактный класс, который содержит только абстрактные методы и константы"},
                {"Какой оператор используется для создания нового объекта?", "new"}
        };

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос " + (i + 1) + ": " + questions[i][0]);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(questions[i][1])) {
                System.out.println("Правильно!");
                score++;
            } else {
                System.out.println("Неправильно. Правильный ответ: " + questions[i][1]);
            }
        }

        System.out.println("Вы ответили правильно на " + score + " из " + questions.length + " вопросов.");
    }
}
