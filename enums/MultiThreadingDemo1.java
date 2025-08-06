public class MultiThreadingDemo1 {
    public static void main(String[] args) {
        PrintXThreadDemo t1 = new PrintXThreadDemo(1);
        PrintXThreadDemo t2 = new PrintXThreadDemo(2);

        t1.start();
        t2.start();

    }
}
