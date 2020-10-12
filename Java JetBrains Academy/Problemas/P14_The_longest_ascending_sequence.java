package Problemas;

import java.util.Scanner;

/* Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces. */

public class P14_The_longest_ascending_sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int counter = 1;
        int maxCounter = 1;
        for (int i = 1; i < length; i++) {
            if (numbers[i] >= numbers[i - 1]) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(maxCounter);
        scanner.close();
    }
}