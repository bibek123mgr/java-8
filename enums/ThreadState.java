public class ThreadState extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("Inside thread state : %s", Thread.currentThread().getState());
            System.out.println();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

}
