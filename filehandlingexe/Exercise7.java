import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Please Enter the Message your want:");
            String inputString = sc.next();

            Set<Character> uniquCharacters = new HashSet<>();

            for (char ch : inputString.toCharArray()) {
                uniquCharacters.add(ch);
            }

            System.out.printf("unique character is : %s\n", uniquCharacters);
        } catch (Exception e) {
            System.out.printf("Error occured:", e.getMessage());
        }

    }
}
