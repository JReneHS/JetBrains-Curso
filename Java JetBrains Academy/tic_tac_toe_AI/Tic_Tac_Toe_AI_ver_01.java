package tic_tac_toe_AI;
import java.util.Scanner;

public class Tic_Tac_Toe_AI_ver_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] table = new String[3][3];
        System.out.print("Enter cells: ");
        String readLine = scanner.nextLine();
        String[] line = readLine.split("");
        int k = 0;
        int x = 0;
        int o = 0;
        int f;
        int c;
        char ff;
        char cc;
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                table[i][j] = line[k];
                System.out.print(table[i][j] + " ");
                k++;
                if (table[i][j].equals("O")) {
                    o++;
                } else if (table[i][j].equals("X")) {
                    x++;
                } else {
                    table[i][j] = " ";
                }
            }
            System.out.println("|");
        }
        System.out.println("---------");
        boolean token = true;
        do {
            System.out.print("Enter the coordinates: ");
            readLine = scanner.nextLine();
            line = readLine.split(" ");
            if (line.length > 1) {
                ff = line[0].charAt(0);
                cc = line[1].charAt(0);
                if (!Character.isDigit(ff) || !Character.isDigit(cc) ) {
                    System.out.println("You should enter numbers!");
                } else {
                    f = Integer.parseInt(String.valueOf(ff));
                    c = Integer.parseInt(String.valueOf(cc));
                    f--;
                    c--;
                    int fd = Math.abs(c - 2);
                    int cd = f;
                    if (f > 2 || c > 2) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else if (table[fd][cd].equals(" ")){
                        if (x > o) {
                            table[fd][cd] = "O";
                        } else {
                            table[fd][cd] = "X";
                        }
                        token = false;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                }
            } else {
                System.out.println("You should enter numbers!");
            }
        } while (token);
        x = 0;
        o = 0;
        k = 0;
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
                if (table[i][j].equals("O")) {
                    o++;
                } else if (table[i][j].equals("X")) {
                    x++;
                } else {
                    k++;
                }
            }
            System.out.println("|");
        }
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            if (table[i][0].equals(table[i][1]) && table[i][0].equals(table[i][2])) {
                if (table[i][0].equals("X")) {
                    System.out.println("X wins");
                    token = true;
                    break;
                } else if (table[i][0].equals("O")) {
                    System.out.println("O wins");
                    token = true;
                    break;
                }
            } else if (table[0][i].equals(table[1][i]) && table[0][i].equals(table[2][i])) {
                if (table[0][i].equals("X")) {
                    System.out.println("X wins");
                    token = true;
                    break;
                } else if (table[0][i].equals("O")) {
                    System.out.println("O wins");
                    token = true;
                    break;
                }
            }
        }
        if (!token) {
            if (table[0][0].equals(table[2][2]) && table[0][0].equals(table[1][1])) {
                if (table[0][0].equals("X")) {
                    System.out.println("X wins");
                    token = true;
                } else if (table[0][0].equals("O")) {
                    System.out.println("O wins");
                    token = true;
                }
            } else if (table[2][0].equals(table[1][1]) && table[2][0].equals(table[0][2])) {
                if (table[2][0].equals("X")) {
                    System.out.println("X wins");
                    token = true;
                } else if (table[2][0].equals("O")) {
                    System.out.println("O wins");
                    token = true;
                }
            }
        }
        if (!token) {
            if (k == 0) {
                System.out.println("Draw");
            } else {
                System.out.println("Game not finished");
            }
        }
        scanner.close();
    }
}

