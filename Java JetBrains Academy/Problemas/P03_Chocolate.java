package Problemas;

import java.util.Scanner;

/* Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width. Each segment is 1x1 and unbreakable. Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line: vertical or horizontal.

Input data format
The program gets an input of three integers: N, M, K.

Output data format
The program must output one of the two words: YES or NO. */

public class P03_Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lentN = scanner.nextInt();
        int widthM = scanner.nextInt();
        int segmentsK = scanner.nextInt();
        int token = 0;
        for (int i = 0; i <= lentN; i++) {
            if (widthM * i == segmentsK) {
                token++;
                break;
            }
        }
        for (int i = 0; i <= widthM; i++) {
            if (lentN * i == segmentsK) {
                token++;
                break;
            }
        }
        if (token > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}