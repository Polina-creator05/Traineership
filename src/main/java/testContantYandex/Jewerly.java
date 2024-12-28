package testContantYandex;

import java.util.Scanner;

public class Jewerly {
    public static void main(final String[] args) {
        final String JS = new Scanner(System.in).nextLine() + "\n" +
                new Scanner(System.in).nextLine();
        final String[] arrayJS = JS.split("\n");
        final String J = arrayJS[0];
        final String S = arrayJS[1];

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (J.charAt(j) == S.charAt(i)) {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}
