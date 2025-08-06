public class PrintXThreadDemo extends Thread {

    private int threadNumber;

    PrintXThreadDemo(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%s) Thread-%s,Hello from thread - %s", i, threadNumber, threadNumber);
            System.out.println();
        }
    }
}
