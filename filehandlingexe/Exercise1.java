public class Exercise1 {

    public static String concateString(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String String1 = "Hello, ";
        String String2 = "World!";
        String result = concateString(String1, String2);
        System.out.println(result);
    }
}
