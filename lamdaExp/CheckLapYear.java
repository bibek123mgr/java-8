interface New {
    boolean test(int n);
}

public class CheckLapYear {
    public static void main(String[] args) {
        New lapyear = (year) -> {
            if (((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)))
                return true;
            else
                return false;
        };
        if (lapyear.test(2020))
            System.out.println("Lap Year");
        else
            System.out.println("Non Lap Year");
    }
}
