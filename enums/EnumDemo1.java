public class EnumDemo1 {
    public static void main(String[] args) {

        for (Days day : Days.values()) {
            System.out.println(day + ":" + day.getType());
        }
    }
}