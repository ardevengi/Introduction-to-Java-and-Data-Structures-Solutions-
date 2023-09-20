package CH7;

public class SortCharacters7_34 {
    public static void main(String[] args) {
        String s = "cba";
        char charArr[] = BSort(s);
        for (int i = 0; i < charArr.length; i++)
            System.out.print(charArr[i]);
    }

    public static char[] BSort(String str) {
        char charArr[] = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr.length - 1; j++) {
                if (charArr[j] > charArr[j + 1]) {
                    char temp = charArr[j];
                    charArr[j] = charArr[j + 1];
                    charArr[j + 1] = temp;
                }
            }
        }
        return charArr;
    }
}
