package Clases;

import java.util.Arrays;
import java.util.Scanner;

/* A menudo, es necesario realizar algún tipo de algoritmo en los elementos de una matriz. Por ejemplo: ordenarlos, encontrar el elemento máximo, imprimir solo números positivos, invertir el orden, calcular el promedio aritmético de números, etc.

Una forma conveniente de procesar una matriz es iterar sobre la matriz utilizando un bucle. La longitud de la propiedad de una matriz puede ayudarnos a evitar ArrayIndexOutOfBoundsException.

Usando un bucle podemos leer todos los elementos de una matriz desde la entrada estándar.


Usando for-each
Desde Java 5, existe una forma especial del bucle for llamado for-each. Se utiliza para iterar a través de cada elemento de una matriz, cadena o colección (los aprenderemos en las próximas lecciones) sin índices.

Así es como se ve:


for (type var : array) { 
    //statements using var
}


Se puede leer como: para cada elemento var de tipo tipo en la matriz de matriz haga {algunas declaraciones en el cuerpo}.

Consideremos los componentes con más detalle. type especifica el tipo de variable que almacenará un elemento de la matriz en cada iteración. Por lo general, ese tipo es igual al tipo de la matriz. var es el nombre de esa variable. Puede elegir el nombre que desee aquí, pero recuerde ceñirse a las convenciones de nomenclatura de variables. En la primera iteración, almacena el primer elemento de la matriz, en la segunda iteración almacena el segundo elemento de la matriz y así sucesivamente.

El bucle for-each tiene algunas limitaciones. En primer lugar, no puede usarlo si desea modificar una matriz, porque la variable que usamos para las iteraciones no almacena el elemento de la matriz en sí, solo su copia. Tampoco es posible obtener un elemento por su índice ya que no tenemos seguimiento de ellos. Finalmente, como se desprende del nombre, no podemos movernos a través de una matriz con el paso más de uno: iteramos sobre todos y cada uno de los elementos, así que lo hacemos uno por uno.

Como puede ver, la ausencia de índices hace que el código sea más legible. El bucle for-each también le permite evitar ArrayIndexOutOfBoundsException. Es por eso que se usa comúnmente para iterar sobre una matriz.
*/

public class C12_Array_Loops {
    public static void main(String[] args) {
/* Ejemplo 1. Llenado de una matriz con los cuadrados de índices de sus elementos.  */
        int n = 10; // the size of an array
        int[] squares = new int[n]; // creating an array with the specified size

        System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        /* iterating over the array */
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // set the value by the element index 
        }

        System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
/* En este código, se crea una matriz con el tamaño 10 y llena de ceros. Luego, el valor de cada elemento de la matriz se establece en el cuadrado del índice del elemento. Luego, el programa convierte la matriz a la representación de cadena que enumera todos los elementos entre corchetes y la imprime en la salida estándar. */

/* Ejemplo 2. Comprobación del orden de los elementos.

El siguiente programa comprueba si la matriz dada está ordenada de forma ascendente e imprime "OK", de lo contrario imprime "BROKEN". */
        int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

        boolean broken = false; // suppose the array is well-ordered

        /* iterating over the array */
        for (int i = 1; i < numbers.length; i++) {
            
            if (numbers[i] < numbers[i - 1]) { // if the order is broken
                broken = true; // write a result
                break;         // terminate the loop
            }
        }

        if (broken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("OK");
        }

/* 
Por ejemplo, la entrada consta de dos líneas. La primera línea contiene la longitud de una matriz, la segunda línea contiene todos los elementos de la matriz.

5
101 102 504 302 881

*/
        Scanner scanner = new Scanner(System.in);
        
        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length
                
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        
        System.out.println(Arrays.toString(array)); // output the array
        scanner.close();
/* The program outputs:
        [101, 102, 504, 302, 881] 
*/

        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        int counter = 0;
        for (char ch : characters) {
            if (ch == 'a') {
                counter++;
            }
        }

        System.out.println(counter); // it outputs "3"

/* Lo mismo que podemos hacer con for-loop: */
        counter = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'a') {
                counter++;
            }
        }

        System.out.println(counter); // it outputs "3"
    }
}