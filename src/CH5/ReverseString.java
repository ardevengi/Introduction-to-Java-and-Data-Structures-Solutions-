package CH5;

public class ReverseString {
    public static void main(String[] args) {
        final String STR = "abdo";
        String rev = "";
        for (int i = STR.length() - 1; i >= 0; i--) {
            rev += STR.charAt(i);
        }
        System.out.println(rev);
    }
}
