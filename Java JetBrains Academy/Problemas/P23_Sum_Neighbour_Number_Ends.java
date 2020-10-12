package Problemas;
import java.util.Scanner;

/* 
Sum of neighbors

Write a program, that takes the rectangular matrix from a sequence of lines as an input. The last line should contain the word end, indicating the end of the input.

The program should output the matrix of the same size, where each element in the position (i, j) is equal to the sum of the elements from the first matrix on the positions of their neighbors: (i-1, j)(i+1, j)(i, j-1), (i, j+1). Boundary elements have neighbors on the opposite side of the matrix.

In the case of one row or column, the element itself can be its neighbor
 */

public class P23_Sum_Neighbour_Number_Ends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] preNumbers = new String[100];
        String[][] strNumbers = new String[100][];
        int lines = 0;
        do {
            preNumbers[lines] = scanner.nextLine();
            strNumbers[lines] = preNumbers[lines].split(" ");
        } while (!preNumbers[lines++].equals("end"));
        scanner.close();
        lines--;
        int columns = strNumbers[0].length;
        int[][] arrayNumbers = new int[lines][columns];
        int[][] newArrayNumbers = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                arrayNumbers[i][j] = Integer.parseInt(strNumbers[i][j]);
                newArrayNumbers[i][j] = 0;
            }
        }
        int x1;
        int y1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0) {
                    x1 = lines - 1;
                } else {
                    x1 = i - 1;
                }
                if (j == 0) {
                    y1 = columns - 1;
                } else {
                    y1 = j - 1;
                }
                newArrayNumbers[i][j] = arrayNumbers[x1][j % columns] + 
                                        arrayNumbers[(i + 1) % lines][j % columns] +
                                        arrayNumbers[i % lines][y1] +
                                        arrayNumbers[i % lines][(j + 1) % columns];
                System.out.print(newArrayNumbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}