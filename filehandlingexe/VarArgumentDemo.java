public class VarArgumentDemo {

    public static void main(String[] args) {

        System.out.println(addTwo(2, 1));
        System.out.println(addMultiple(7, 3, 4, 32, 45, 5));
    }

    // without var arg
    public static int addTwo(int a, int b) {
        return a + b;
    }

    public static long addMultiple(int... num) {
        long sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
}