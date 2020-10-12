package Problemas;

import java.util.Scanner;
/* Here is the method named getNumberOfMaxParam that takes three integer numbers and returns the position of the first maximum in the order of the method parameters.

The method should return number 1, 2 or 3 respectively. */

public class P11_Method_Compare {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        return a >= b ? a >= c ? 1 : 3 : b >= c ? 2 : 3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        scanner.close();
        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}