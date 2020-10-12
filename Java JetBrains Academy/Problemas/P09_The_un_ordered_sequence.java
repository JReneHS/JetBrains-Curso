package Problemas;

import java.util.Scanner;
/* Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false. Keep in mind, if a number has the same value as the following number, it does not break the order.

The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0). */

public class P09_The_un_ordered_sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        if (numA <= numB) {
            while (numA <= numB && numB != 0) {
                numA = numB;
                numB = scanner.nextInt();
            }
        } else {
            while (numB <= numA && numB != 0) {
                numA = numB;
                numB = scanner.nextInt();
            }
        }
        System.out.println(numB == 0);
        scanner.close();
    }
}