/* Una matriz de matrices
Algunas estructuras, como matrices y tablas, se modelan convenientemente mediante matrices bidimensionales. Java ofrece la posibilidad de procesar matrices de dos o más dimensiones.

Para crear una matriz multidimensional, debemos utilizar una matriz como elemento de otra matriz. En este caso, creamos una matriz de matrices.

Los bucles anidados se utilizan a menudo para iterar a través de matrices multidimensionales. */

/* Importante, todas las matrices anidadas pueden tener una longitud diferente. */

/* La forma clásica de hacerlo es usar tres bucles for : un bucle externo y dos anidados. */

/* También es posible utilizar for-each loop y métodos de la clase Arrayspara llenar e imprimir matrices multidimensionales. */



package Clases;

import java.util.Arrays;

public class C13_N_Dimension_Array {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][];
        twoDimArray[0] = new int[] { 1, 2, 3, 4 }; // the length is 4
        twoDimArray[1] = new int[] { 5, 7, 3};     // the length is 3
        twoDimArray[2] = new int[] { 8 };          // the length is 1

        // let's output the array
        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }


        int[][][] cubic = new int[3][4][5]; // an three-dimensional array (cube)    
        int current = 1; // it stores a value to fill elements
        for (int i = 0; i < 3; i++) { // iterating through each 2D array ("table" or "matrix")
            for (int j = 0; j < 4; j++) { // iterating through each 1D array ("vector") array of a "matrix"
                for (int k = 0; k < 5; k++) { // iterating through each element of a vector
                    cubic[i][j][k] = current; // assign a value to an element
                }
            }
            current++; // get the next value to the next "matrix"
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        current = 1;
        for (int[][] dim2Array : cubic) {     // for each 2-dim array
            for (int[] vector : dim2Array) {  // for each 1-dim array (vector) of 2-dim array
                Arrays.fill(vector, current); // fill the vector
            }
        current++; // the next current
        }

        // this code prints all 2-dimensional arrays
        for (int[][] dim2Array : cubic) {
            for (int[] vector : dim2Array) {
                System.out.println(Arrays.toString(vector));
            }
            System.out.println();
        }
    }
}
