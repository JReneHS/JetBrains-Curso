package Problemas;

import java.util.Scanner;

/* Write a program that reads an array of ints and outputs the number of "triples" in the array.

A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single integer value: the number of "triples". */

public class P16_Triples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int triples = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 2; i < length; i++) {
            if (array[i] == array[i - 1] + 1 && array[i - 1] == array[i - 2] + 1) {
                triples++;
            }
        }
        System.out.println(triples);
    }
}