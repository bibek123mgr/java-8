@FunctionalInterface
interface InnerTest3 {

    int operation(int a, int b);
}

public class Test3 {
    public static void main(String[] args) {
        InnerTest3 add = (a, b) -> a + b;
        InnerTest3 mutiply = (a, b) -> a * b;
        System.out.println(add.operation(2, 3));
        System.out.println(mutiply.operation(4, 5));
    }
}
