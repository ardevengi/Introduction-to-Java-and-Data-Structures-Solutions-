package CH6;

/**
 * HexToDec6_8
 */
public class HexToDec6_8 {

    public static void main(String[] args) {
        final String HEX = "B";
        int dec = NumberrConverstion(HEX.toUpperCase());
        System.out.println(dec);
    }

    public static int NumberrConverstion(String hex) {
        int dec = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            dec = dec * 16 + hexCharToDec(hexChar);
        }
        return dec;
    }

    public static int hexCharToDec(char hex) {
        if (hex >= 'A' && hex <= 'F') {
            return 10 + hex - 'A';
        }
        return hex - '0';
    }
}