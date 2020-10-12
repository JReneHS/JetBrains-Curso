package Clases;

import java.util.Scanner;

/*
WHILE
El bucle while consta de un bloque de código y una condición (una expresión booleana). Si la condición es verdadera, se ejecuta el código dentro del bloque. Este código se repite hasta que la condición se vuelve falsa. Dado que este bucle verifica la condición antes de que se ejecute el bloque, la estructura de control también se conoce como bucle de prueba previa. Puede pensar en el ciclo while como una declaración condicional repetitiva.

El cuerpo de un bucle puede contener cualquier declaración de Java correcta, incluidas declaraciones condicionales e incluso otros bucles, estos últimos se denominan bucles anidados.

También es posible escribir un bucle infinito si la condición es invariablemente verdadera:

DO_WHILE
En el ciclo do-while, el cuerpo se ejecuta primero, mientras que la condición se prueba después. Si la condición es verdadera, las declaraciones dentro del bloque se ejecutan nuevamente. Esto se repite hasta que la condición se vuelve falsa. Debido a que los bucles do-while verifican la condición después de que se ejecuta el bloque, la estructura de control a menudo también se conoce como bucle posterior a la prueba. En contraste con el ciclo while, que prueba la condición antes de que se ejecute el código dentro del bloque, el ciclo do-while es un ciclo de condición de salida. Entonces, el código dentro del bloque siempre se ejecuta al menos una vez.


Reading a sequence with an unknown length
El bucle while también se puede utilizar para leer una secuencia de caracteres de una longitud arbitraria. Para eso, podemos invocar el método hasNext () de Scanner dentro de la condición. El método devuelve verdadero si el siguiente elemento existe y falso en caso contrario.

Aquí hay un código que calcula la suma de todos los elementos de la secuencia proporcionada:

*/

public class C07_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter);
            letter++;
        }
        int sum = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }
        System.out.println(sum);
        scanner.close();
    }
}