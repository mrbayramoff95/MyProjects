package Java_lessons.homework.Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = {new Rectangle(10, 12),
                new Triangle(5, 11, 15),
                new Circle(10)};

        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }
}
