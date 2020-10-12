package Clases;

/* La entrada estándar es un flujo de datos que ingresa a un programa. Es compatible con el sistema operativo. De forma predeterminada, la entrada estándar obtiene datos de la entrada del teclado, pero es posible redirigirlos a un archivo. En realidad, no todos los programas necesitan utilizar la entrada estándar. ¡Pero a menudo lo usaremos aquí para ayudarlo a dominar sus habilidades de programación! La forma típica de resolver problemas de programación es la siguiente: Leer datos de la entrada estándar (System.in); Procesar datos para obtener un resultado; Envíe el resultado a la salida estándar (System.out). Este tipo de desafíos de código se pueden probar fácilmente con diferentes formatos de datos de entrada y, por esta razón, los usaremos mucho. */

/* Para escanear datos se tiene que importar esta librería */
import java.util.Scanner;
public class C02_Scanning_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); /* Crear un objeto tipo Scanner */


        /* Se pueden hacer 2 metodos de lectura */
        System.out.println("Ingrese un numero:");
        String name = scanner.next(); /* Si solo vas a ingresar UN solo dato usa .next(); aunque la va a guardar como String, es decir devuelve un String*/
        System.out.println("Hello, " + name + "!");
        
        /* Si quieres guardar Mas de un dato, o una cadena de datos usa .nextLine() */
        /* Tenga en cuenta que en Java el espacio en blanco incluye no solo el carácter de espacio, sino principalmente todo lo que parece vacío cuando se imprime: tabulación, el carácter de nueva línea y otros caracteres que no se imprimen. */
        System.out.println("Ingrese una cadena de datos:");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.println(name);
        scanner.close(); /* Siempre cerrar el flujo de entrada cuando se deje de usar */


/* En este artículo, estamos tratando con espacios y caracteres de nueva línea: técnicamente, producimos un carácter correspondiente cuando presionamos Enter y comenzamos una nueva línea. El término "espacios en blanco" se utiliza para referirse a cualquiera de ellos. El término más correcto para referirse a lo que hemos llamado "palabra" es token: es un fragmento de texto rodeado por espacios en blanco. Podemos decir ahora que el método next () busca y devuelve el siguiente token, mientras que nextLine () lee todos los datos hasta el final de la línea actual.

Ahora puede leer una palabra completa e incluso una línea completa invocando estos dos métodos. Parinvocar a ambos correctamente, es importante conocer la diferencia entre ellos. *
*/

/* Reading a multiline input */

/* Leer la entrada de varias líneas puede resultar un poco complicado: debe tener en cuenta la posición de un cursor y el comportamiento de los métodos de lectura.

Investiguemos este proceso con un ejemplo:

    | Este es un sencillo

    entrada multilínea,

    que se esta leyendo

| es una posición de un cursor antes de leer la entrada.

Si invocamos el método next (), el programa leerá la entrada hasta el espacio en blanco:

    Esto | es un simple

    entrada multilínea,

    que se esta leyendo

Después de invocar el método nextLine (), el programa lee la línea completa comenzando desde el espacio en blanco. nextLine () coloca el cursor al comienzo de una nueva línea (si hay tal línea en su entrada):

    Este es un simple

    | entrada multilínea,

    que se esta leyendo

Luego, invoquemos el método next () dos veces. Puede ver que la posición del cursor está justo después de la palabra y antes del espacio en blanco:

    Este es un simple

    multilínea | entrada,

    que se esta leyendo

Ahora invocamos el método next () nuevamente. El programa genera la segunda palabra en la línea sin espacios en blanco. Ni siquiera importa cuántos espacios en blanco haya, porque el método next () omitirá los espacios en blanco hasta que encuentre el siguiente token.

Como puede ver, la posición del cursor todavía está en la línea actual justo antes de la nueva línea y después de la coma:

    Este es un simple

    entrada multilínea, |

    que se esta leyendo

Aquí hay algo complicado sobre el método nextLine () que también muestra una gran diferencia entre los métodos next () y nextLine (). Como ya sabe, el programa leerá la entrada desde la posición del cursor hasta la nueva línea (y nuevamente, si existe una línea de este tipo en su entrada). En este ejemplo, el cursor se ubica antes de la nueva línea: por lo tanto, el método nextLine () devolverá una línea vacía ("") y colocará el cursor al principio de una nueva línea.

    Este es un simple

    entrada multilínea,

    | que se está leyendo


En resumen, veamos el código como un todo y consideremos las variables que acabamos de leer:

    import java.util.Scanner;

    public class Main {

        public static void main (String [] args) {
            Escáner escáner = nuevo escáner (System.in);

            Cadena palabra1 = scanner.next (); // "Esta"
            String line1 = scanner.nextLine (); // "es un simple"
            Cadena palabra2 = scanner.next (); // "multilínea"
            Cadena palabra3 = scanner.next (); // "entrada",
            String line2 = scanner.nextLine (); // ""
            
        }
    }

*/
    }
}