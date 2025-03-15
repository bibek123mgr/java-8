public class CheckString {
    public static boolean isStringOnlyAlphabet(String str) {
        return ((str != null) && (!str.equals("") && (str.chars().allMatch(Character::isLetter))));
    }

    public static void main(String[] args) {
        String str1 = "GeeksforGeeks";
        System.out.println("Input: " + str1);

        // Calling over above string: GeeksforGeeks
        System.out.println("Output: "
                + isStringOnlyAlphabet(str1));

    }
}
