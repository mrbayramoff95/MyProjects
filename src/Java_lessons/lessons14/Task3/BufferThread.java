package Java_lessons.lessons14.Task3;

public class BufferThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
        Buffer.add();
    }
}
