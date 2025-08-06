public class ThreadStateDemo1 {
    public static void main(String[] args) throws InterruptedException {

        ThreadState t1 = new ThreadState();

        System.out.printf("from main class : %s", t1.getState());
        System.out.println();

        t1.start();
        t1.join();
        System.out.println();
        System.out.println();

        System.out.printf("from main class : %s", t1.getState());

    }
}
