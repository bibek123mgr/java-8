package excerces.java;

public class Exercise3 {
    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        System.out.println(sum);
    }
}
