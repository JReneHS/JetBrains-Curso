package Problemas;

import java.util.Scanner;
/* Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b
(a < b) inclusively.

Note: it is possible to write this program more efficiently without any loops. */

public class P05_numbers_Divisible_by_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();
        if (num1 % num3 == 0) {
            System.out.println(num2 / num3 - num1 / num3 +1);
        } else {
            System.out.println(num2 / num3 - num1 / num3);
        }
    }
}