package Problemas;
import java.util.Scanner;

/* 
Fill the matrix by numbers
Given the number n, not greater than 100, create the matrix of size n×n and fill it using the following rule. Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals should contain numbers 2; etc.

Note: the primary diagonal runs from the top left corner to the bottom right corner.


Sample Input:
5

Sample Output:
0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0
*/

public class P24_Fill_Matrix_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = Math.abs(j - i);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
