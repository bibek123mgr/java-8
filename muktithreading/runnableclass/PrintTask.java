package runnableclass;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++) {
            System.out.printf("%d : %c \t *", i, task);
        }
        System.out.printf("task %c completed", task);
    }

    private final char task;

    public PrintTask(char task) {
        this.task = task;
    }

}
