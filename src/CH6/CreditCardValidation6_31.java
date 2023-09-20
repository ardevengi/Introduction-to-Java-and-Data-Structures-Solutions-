package CH6;

public class CreditCardValidation6_31 {
    public static void main(String[] args) {
        final long VCARD = 4388576018410707L;
        final long INVCARD = 4388576018402626L;
        long card = VCARD;
        if (cardValidation(card)) {
            System.out.println(card + " is VALID");
        } else
            System.out.println(card + " is Not VALID");
    }

    public static boolean cardValidation(long card) {
        int even = sumOfSingleEvenNumbers(card);
        int odd = sumOfSingleOddNumbers(card);
        int sum = even + odd;
        if (sum % 10 == 0)
            return true;

        return false;
    }

    public static int sumOfSingleEvenNumbers(long card) {
        String temp = Long.toString(card);
        int sum = 0;
        for (int i = 0; i < temp.length(); i += 2) {
            int even = Character.getNumericValue(temp.charAt(i)) * 2;
            if (even < 9) {
                sum += even;
            } else {
                int s = 0;
                while (even != 0) {
                    s += even % 10;
                    even /= 10;
                }
                sum += s;
            }
        }
        return sum;
    }

    public static int sumOfSingleOddNumbers(long card) {
        String temp = Long.toString(card);
        int sum = 0;
        for (int i = 1; i < temp.length(); i += 2) {
            int even = Character.getNumericValue(temp.charAt(i));
            sum += even;
        }
        return sum;
    }

}
