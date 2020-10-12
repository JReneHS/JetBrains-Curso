package Problemas;

import java.util.Scanner;
/* 
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to). The input to the program is a positive integer n: the number of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
*/
public class P08_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int j = 1;
        int i = 0;
        int count = 0;
        boolean token = true;
        while (token) {
            while (i < j) {
                System.out.println(j + " ");
                i++;
                count++;
                if (count == num) {
                    token = false;
                    break;
                }
            }
            j++;
            i = 0;
        }
        scanner.close();
    }
}