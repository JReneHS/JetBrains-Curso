package Problemas;

import java.util.Scanner;
/* The roots of a cubic equation
Given the numbers a, b, c, d. 
Output in ascending order all the integers between 0 and 1000 which are the roots of the equation ax^3+bx^2+cx+d=0
If the specified interval does not contain the roots of the equation, do not output anything.
Remember, that cubic equation always has 3 roots. Keep it in mind in order to optimize the code. */
public class P04_Roots {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        final long c = scanner.nextLong();
        final long d = scanner.nextLong();
        scanner.close();
        int count = 0;
        for (long x = 0; x <= 1000 && count < 4; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
                count++;
            }
        }
    }
}