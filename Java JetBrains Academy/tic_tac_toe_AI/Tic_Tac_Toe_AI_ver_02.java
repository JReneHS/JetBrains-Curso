package tic_tac_toe_AI;

import java.util.Random;
import java.util.Scanner;

public class Tic_Tac_Toe_AI_ver_02 {
    public static String[][] table = new String[3][3];
    public static int k = 9;
    public static int x = 0;
    public static int o = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static String readLine;
    public static String[] line;

    public static void main(String[] args) {
        ini();
        printChest();
        do {
            move();
            printChest();
            if (winCheck()) {
                break;
            }
            cpuMove();
            printChest();
            if (winCheck()) {
                break;
            }
        } while (true);
    }

    static void cpuMove() {
        boolean token = true;
        Random random = new Random();
        int f;
        int c;
        System.out.println("Making move level \"easy\"");
        do {
            f = random.nextInt(3);
            c = random.nextInt(3);
            if (table[f][c].equals(" ")){
                table[f][c] = "O";
                token = false;
            }
        } while (token);
    }

    static void printChest() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    static int countXO(String xo) {
        int o = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j].equals(xo)) {
                    o++;
                }
            }
        }
        return o;
    }

    static void ini() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = " ";
            }
        }
    }

    static void move() {
        boolean token = true;
        int f;
        int c;
        char ff;
        char cc;
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
                        table[fd][cd] = "X";
                        token = false;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                }
            } else {
                System.out.println("You should enter numbers!");
            }
        } while (token);
    }

    static boolean winCheck() {
        x = countXO("X");
        o = countXO("O");
        k = 9 - x - o;
        for (int i = 0; i < 3; i++) {
            if (table[i][0].equals(table[i][1]) && table[i][0].equals(table[i][2])) {
                if (table[i][0].equals("X")) {
                    System.out.println("X wins");
                    return true;
                } else if (table[i][0].equals("O")) {
                    System.out.println("O wins");
                    return true;
                }
            } else if (table[0][i].equals(table[1][i]) && table[0][i].equals(table[2][i])) {
                if (table[0][i].equals("X")) {
                    System.out.println("X wins");
                    return true;
                } else if (table[0][i].equals("O")) {
                    System.out.println("O wins");
                    return true;
                }
            }
        }
        if (table[0][0].equals(table[2][2]) && table[0][0].equals(table[1][1])) {
            if (table[0][0].equals("X")) {
                System.out.println("X wins");
                return true;
            } else if (table[0][0].equals("O")) {
                System.out.println("O wins");
                return true;
            }
        } else if (table[2][0].equals(table[1][1]) && table[2][0].equals(table[0][2])) {
            if (table[2][0].equals("X")) {
                System.out.println("X wins");
                return true;
            } else if (table[2][0].equals("O")) {
                System.out.println("O wins");
                return true;
            }
        }
        if (k == 0) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }
}
