package Java_lessons.lessons14.Task1;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}
