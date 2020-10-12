package Problemas;

import java.util.Scanner;

/* Escriba un programa que lea una matriz de cadenas en minúsculas y compruebe si la matriz está en orden alfabético o no.Hay algunas reglas para comparar un par de cadenas a y b:

Se comparan los primeros caracteres de las cadenas: a[0] y b[0]. Si a[0] viene antes que b[0] en el alfabeto, entonces a viene antes de b en términos de orden alfabético. 

Si los primeros caracteres son los mismos, se comparan los segundos caracteres, y así sucesivamente.Si se alcanza una posición en la que una cadena no tiene más caracteres para comparar mientras que la otra sí, entonces se considera que la cadena más corta ocupa el primer lugar en orden alfabético.

Finalmente, las cadenas idénticas están siempre en orden alfabético.

Puede utilizar el método compareTo de la clase String para comparar 2 cadenas. Si este objeto String precede alfabéticamente a la cadena de argumentos, el resultado es un entero negativo. El resultado es un entero positivo si este objeto String sigue alfabéticamente la cadena de argumentos. El resultado es cero si las cadenas son idénticas. ¡Esto es exactamente lo que necesita para comparar 2 cadenas en términos de orden alfabético! */

public class P15_Alphabetical_order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] array = words.split(" ");
        boolean token = true;
        scanner.close();
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                token = false;
                break;
            }
        }
        System.out.println(token);
    }
}