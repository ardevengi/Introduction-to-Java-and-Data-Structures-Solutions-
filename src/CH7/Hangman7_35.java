package CH7;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman7_35 {
    public static void main(String[] args) {

        play();
    }

    public static void play() {
        String allWords[] = { "abc", "xyz", "ijk" };
        String w = allWords[(int) (Math.random() * 3)];
        Scanner iScanner = new Scanner(System.in);
        char[] word = w.toCharArray();
        char[] asWord = new char[word.length];
        int count = 0;
        char c;
        for (int i = 0; i < word.length; i++) {
            asWord[i] = '*';
        }

        do {
            boolean found = false;
            System.out.print("Enter a letter in word ");
            for (int i = 0; i < word.length; i++) {
                System.out.print(asWord[i]);
            }
            System.out.print(" >> ");

            String tmp = iScanner.next();
            c = tmp.charAt(0);

            for (int i = 0; i < word.length; i++) {
                if (word[i] == c) {
                    asWord[i] = c;
                    found = true;
                }
            }
            if (found == false) {
                count++;
            }

        } while (!Arrays.equals(asWord, word));
        System.out.print("good job you have got it right : ");
        for (char x : asWord)
            System.out.print(x);
        System.out.println();
        System.out.println("you have missed : " + count + "times");
        System.out.println("Play again y/n : ");

        String tmp = iScanner.next();
        c = tmp.charAt(0);

        if (c == 'y')
            play();
        else
            return;

    }

}
