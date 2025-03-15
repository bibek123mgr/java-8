@FunctionalInterface
interface ZeroParameter {
    void display();
}

public class Geeks {
    public static void main(String[] args) {
        // Corrected lambda expression without the extra semicolon
        ZeroParameter zeroParameter = () -> System.out.println("This is a lambda expression");
        
        zeroParameter.display();  // Calls the display method
    }
}
