package Clases;

/* La sentencia break tiene dos usos:

termina el bucle actual de cualquier tipo (for, while, do-while);
termina un caso en la sentencia switch;
La sentencia break termina solo el bucle en el que se encuentra actualmente. Si este ciclo se realiza dentro de otro ciclo, el ciclo exterior no se detendrá.

Para detener el bucle exterior, nos gustaría declarar una variable booleana detenida y usarla como una bandera booleana especial.

Hay otra forma de detener el bucle externo: operador de interrupción etiquetado. Sin embargo, no es una buena práctica usarlo. Búscalo en Google si estás realmente interesado. 



Continue
Hace que un bucle omita la iteración actual y pase a la siguiente.

Esta declaración se puede utilizar dentro de cualquier tipo de bucle.

dentro del bucle for, continuar hace que el control se mueva inmediatamente a la instrucción de incremento / decremento;
dentro del ciclo while o do-while, el control se mueve inmediatamente a la condición.


La instrucción continue y la instrucción break solo afectan al bucle en el que se encuentran. La instrucción continue no puede omitir la iteración actual del bucle externo.



El resultado es el mismo que el anterior, pero el código se hizo más corto y más legible.

Es importante tener en cuenta que el uso generalizado de declaraciones de ramificación conduce a un código mal estructurado porque las condiciones en sus bucles no son realmente lo que necesita hacer. Por lo tanto, utilícelos sabiamente, solo cuando ayude a hacer que el código sea más corto y más fácil de entender para los humanos.
*/

public class C08_Branching_statements {
    public static void main(String[] args) {
        int n = 10;

/* El siguiente código imprime una escalera de números. */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }

/* En el siguiente ejemplo, se emite una secuencia de números. Se saltan los números impares. */
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        /* A menudo, podemos reescribir nuestro ciclo sin usar la instrucción continue. Aquí hay un ejemplo: */
        for (int i = 0; i < n; i++) { 
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
        }

    }
}