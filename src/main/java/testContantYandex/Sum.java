package testContantYandex;

import java.util.Scanner;

public class Sum {
    public static void main(final String[] args) {

        final String AB = new Scanner(System.in).nextLine();
        final  String [] arrayAB= AB.split(" ");
        final int A = Integer.parseInt(arrayAB[0]);
        final int B = Integer.parseInt(arrayAB[1]);
        System.out.println(A+B);

    }

}
