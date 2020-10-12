package Problemas;

import java.util.Scanner;

/* A right rotation is an operation that shifts each element of an array to the right. For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}. If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

Write a program, that performs a right rotation on an array by a given number.

Input format:
The first line is an array of numbers.
The second line is the number of rotations. */

public class P17_Rotations {
    public static void main(String[] args) {
/* Seccion de lectura de datos */
        Scanner scanner = new Scanner(System.in);
        String preNumbers = scanner.nextLine();
        int iterations = scanner.nextInt();
        scanner.close();
/* Conversion de Strings a Integers */
        String[] strNumbers = preNumbers.split(" ");
        int[] numbers = new int[strNumbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
/* Simplificacion de Iteraciones */
        if (iterations > numbers.length) {
            iterations = iterations % numbers.length;
        }
/* Iteraciones */
        for (int i = 0; i < iterations; i++) {
            rotation(numbers);
        }
/* Impresion del array */
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
/* Metodo(s) */
    public static void rotation(int[] rotation) {
        int aux = rotation[rotation.length - 1];
        System.arraycopy(rotation, 0, rotation, 1, rotation.length - 1);
        rotation[0] = aux;
    }
}