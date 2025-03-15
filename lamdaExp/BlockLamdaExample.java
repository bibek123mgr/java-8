interface If1 {

    boolean fun(int n);

}

public class BlockLamdaExample {
    public static void main(String[] args) {

        If1 isEven = (n) -> (n % 2) == 0;
        if (isEven.fun(21))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
