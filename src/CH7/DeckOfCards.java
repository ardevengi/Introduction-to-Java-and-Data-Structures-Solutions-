package CH7;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] arr1 = { "speads", "Hearts", "dimonds", "clubs" };
        String[] arr2 = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        int deck[] = new int[52];

        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        for (int i = 0; i < deck.length; i++) {
            int temp = deck[i];
            int index = (int) (Math.random() * deck.length);
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(arr2[deck[i] % 13] + " OF " + arr1[deck[i] / 13]);
        }
    }
}
