package Problemas;

import java.util.Scanner;

/* There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2. You need to determine which box can be put inside another box. You can rotate both boxes as you want.

Input contains two lines.
The first line contains numbers X1, Y1, Z1, the second line contains numbers X2, Y2, Z2. All numbers are integers and greater than 0.

If the sizes of the boxes are equal, output "Box 1 = Box 2".

If the first box can be put inside the second box, output "Box 1 < Box 2".

If the second box can be put inside the first box, output "Box 1 > Box 2".

If none of the boxes can be put inside the other box, output "Incomparable". */

public class P20_Boxes {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        inData(box1);
        inData(box2);
        int area1 = box1[0] * box1[1] * box1[2];
        int area2 = box2[0] * box2[1] * box2[2];
        bubbleSort(box1);
        bubbleSort(box2);
        if (area1 == area2 && is1BigThan2(box1, box2)) {
            System.out.println("Box 1 = Box 2");
        } else if (area1 > area2 && is1BigThan2(box1, box2)) {
            System.out.println("Box 1 > Box 2");
        } else if (area1 < area2 && is1BigThan2(box2, box1)) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }

    public static void inData(int[] array) {
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void bubbleSort(int[] array) {
        int counter;
        int aux;
        for (int i = 1; i < 3; i++) {
            counter = 0;
            for (int j = 0; j < 3 - i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    counter++;
                }
            }
            if (counter == 0) {
                break;
            }
        }
    }

    public static boolean is1BigThan2(int[] arr1, int[] arr2) {
        for (int i = 0; i < 3; i++) {
            if (arr1[i] < arr2[i]) {
                return false;
            }
        }
        return true;
    }
}