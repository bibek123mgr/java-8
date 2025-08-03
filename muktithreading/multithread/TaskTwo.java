package multithread;

public class TaskTwo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d \t *", i);
        }
        System.out.println("task two completed");
    }
}