import multithread.*;
import multithread.TaskThree;
import multithread.TaskTwo;
import runnableclass.PrintTask;

public class MultiThreadingExampleOne {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        // for (int i = 1; i < 100000; i++) {
        // System.out.printf("%d \t *", i);
        // }
        // System.out.println();

        // for (int i = 1; i < 100000; i++) {
        // System.out.printf("%d \t *", i);
        // }
        // System.out.println();

        // for (int i = 1; i < 100000; i++) {
        // System.out.printf("%d \t *", i);
        // }
        // System.out.println();

        // for (int i = 1; i < 100000; i++) {
        // System.out.printf("%d \t *", i);
        // }
        // System.out.println();

        // TaskOne taskOne = new TaskOne();
        // TaskTwo taskTwo = new TaskTwo();
        // TaskThree taskThree = new TaskThree();

        // taskOne.start();
        // taskTwo.start();
        // taskThree.start();

        // try {
        // taskOne.join();
        // taskTwo.join();
        // taskThree.join();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        PrintTask taskA = new PrintTask('A');
        PrintTask taskB = new PrintTask('B');
        PrintTask taskC = new PrintTask('C');
        PrintTask taskD = new PrintTask('D');

        Thread t1 = new Thread(taskA);
        Thread t2 = new Thread(taskB);
        Thread t3 = new Thread(taskC);
        Thread t4 = new Thread(taskD);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {

            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        long endTime = System.currentTimeMillis();
        System.out.printf("All tasks finished in %d ms%n", (endTime - startTime));

    }
}