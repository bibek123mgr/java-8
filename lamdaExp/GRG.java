
interface Function {

    int func(int n);
}

public class GRG {
    public static void main(String[] args) {
        int number = 10;
        Function mylamda = (n) -> {
            int value = number + n;
            return value;
        };
        System.out.println(mylamda.func(20));
    }
}
