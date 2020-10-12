package Problemas;

import java.util.Scanner;

/* Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:

If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result. */

public class P07_Collatz_Congeture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aux = scanner.nextInt();

        scanner.close();
        System.out.print(aux);
        while (aux != 1) {
            if (aux % 2 == 0) {
                aux /= 2;
            } else {
                aux = aux * 3 + 1;
            }
            System.out.println(" " + aux);
        }
    }
}