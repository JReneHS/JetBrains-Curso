package Problemas;
import java.util.Scanner;

/* Maximum element in a matrix
Find the indexes of the initial appearance of the maximum element in a matrix.

Input data format

On the input, the program receives the size of matrix n and m, and then n lines having m integer numbers in each. n and m do not exceed 100.

Output data format

Output two numbers: the row index and the column index, in which the greatest item in the two-dimensional array (matrix) is located. If there are several such elements, output the one, which has the smaller row index; and if row indexes are the same, output the one having the smaller column index.


Sample Input:
3 4
0 3 2 4
2 3 5 5
5 1 2 3

Sample Output:
1 2
 */

public class P22_Max_Num_Array2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = scanner.nextInt();
        int nMax = 0;
        int mMax = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    array[i][j] = max;
                    continue;
                }
                array[i][j] = scanner.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                    nMax = i;
                    mMax = j;
                }
            }
        }
        scanner.close();
        System.out.println(nMax + " " + mMax);
    }

}
