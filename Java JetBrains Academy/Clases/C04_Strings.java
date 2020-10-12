package Clases;

/* La cadena es un tipo de referencia que consta de caracteres. Es uno de los tipos más utilizados en Java. A continuación se muestra un ejemplo de una cadena: "Hola, Java". Esta cadena es una secuencia de 11 caracteres, incluido un espacio.

Este tipo tiene algunas características:

tipo inmutable: es imposible cambiar un carácter en una cadena;
tiene métodos para obtener caracteres individuales y extraer subcadenas;
se puede acceder a los caracteres individuales por índices, el primer carácter tiene el índice 0, el último, la longitud de la cadena - 1;
tipo no primitivo. 

Una cadena puede representar una secuencia de caracteres larga (texto). Una cadena puede tener uno o cero caracteres hasta n caracteres.

Una cadena puede ser nula (null). Significa ningún valor asignado.

Otra forma de crear una variable de String es usando la palabra clave new.
*/

public class C04_Strings {
    public static void main(String[] args) {
        String simpleString = "It is a simple string"; // a simple string
        System.out.println(simpleString); // it prints "It is a simple string"

        String anotherString = "This is\na multiple\nstring"; // a string with escape sequences
        System.out.println(anotherString); // it prints the result in several lines

        String emptyString = "";
        System.out.println(emptyString);

        String s = "s"; // a string consisting of one character
        System.out.println(s);

        String nullString = null; // it is null
        System.out.println(nullString);

        String str = new String("my-string"); // it creates an object and assigns it to the variable
        System.out.println(str);

/* Obtenga la longitud y los caracteres de una cadena */

/* Cualquier cadena tiene dos métodos útiles:

    length() devuelve el número de caracteres de la cadena;
    charAt(int index) devuelve un carácter por su índice; 
*/
        String ses = "Hi, all";
        int len = ses.length(); // the len is 7
        char theFifthChar = ses.charAt(4); // 'a' has the index 4
        char theLastChar = ses.charAt(s.length() - 1); // 'l' has the index 6
        System.out.println(theFifthChar + " " + theLastChar + " " + len);

/* Puede obtener fácilmente un carácter de una cadena por el índice, pero no puede cambiar los caracteres porque las cadenas son inmutables en Java. */

/* La biblioteca estándar de Java proporciona muchos métodos útiles para procesar cadenas:

    isEmpty() devuelve verdadero si la cadena está vacía; de lo contrario, es falso;
    toUpperCase() devuelve una nueva cadena en mayúsculas;
    toLowerCase() devuelve una nueva cadena en minúsculas;
    startsWith(prefijo) devuelve verdadero si la cadena comienza con el prefijo de cadena dado, en caso contrario, falso;
    endsWith(sufijo) devuelve verdadero si la cadena termina con el sufijo de cadena dado, de lo contrario, falso.
    contains(...) devuelve verdadero si la cadena contiene la cadena o el carácter dado;
    substring(beginIndex, endIndex) devuelve una subcadena de la cadena en el rango: beginIndex, endIndex - 1;
    replace(old, new) devuelve una nueva cadena obtenida al reemplazar todas las apariciones de old con new que pueden ser caracteres o cadenas.
    trim() devuelve una copia de la cadena obtenida al omitir los espacios en blanco iniciales y finales. Tenga en cuenta que el espacio en blanco incluye no solo el carácter de espacio, sino principalmente todo lo que parece vacío: tabulación, retorno de carro, carácter de nueva línea, etc. */


/* Excepciones al procesar cadenas */
/* 
Cuando se trabaja con cadenas, puede haber varias excepciones.

    1. NullPointerException. Si una cadena es nula y llama a un método de la cadena, arroja NullPointerException.
    2. StringIndexOutOfBoundsException. Si intenta acceder a un carácter no existente mediante un índice, se produce esta excepción. (ES decir salirse del rango)

*/

/* Concatenating strings */
/* 
Se pueden concatenar dos cadenas mediante el operador "+" o el método concat. Ambos enfoques conducen a los mismos resultados.

Cuando concatenamos dos cadenas, se crea una nueva cadena (porque las cadenas son inmutables).

Importante: en el caso general str1 + str2 no es lo mismo que str2 + str1 porque la concatenación no es una operación conmutativa.
*/
        String firstName = "John";
        String lastName = "Smith";
        // concatenation using the "+" operator
        String fullName1 = firstName + " " + lastName; // "John Smith"
        // concatenation using the concat method 
        String fullName2 = firstName.concat(" ").concat(lastName); // "John Smith"
        System.out.println(fullName1 + fullName2);
/* Agregar valores a una cadena (Appending values to a string) */
/* 
Es posible agregar valores de diferentes tipos a una cadena. El valor se convertirá automáticamente en una cadena. Vea un ejemplo a continuación:
*/
        String str2 = "str" + 10 + false; // the result is "str10false"
        String shortString = "str";
        int number = 100;

        String result1 = shortString + number + 50; // the result is "str10050"
        String result2 = number + 50 + shortString; // what is the result2?
        System.out.println(str2 + result1 + result2);

/* ¿Cómo comparar cadenas correctamente? */
/* 
Dado que String es un tipo de referencia, no debe comparar cadenas con los operadores == o !=. En este caso, solo se compararán las direcciones, pero no los valores reales.

String tiene dos métodos convenientes para comparar la equivalencia del contenido real de una cadena con el contenido de otra cadena: equals(otro) y equalsIgnoreCase(otro). Vea un ejemplo a continuación:
*/
        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second)); // false, the strings have different values
        System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

        System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases

        /* Cuando imprime y empieza con String, lo demas lo interpreta como string */
        System.out.println(1 + 1 + "2" + 2); /* 222 */
        System.out.println(2 + 2 + "2"); /* 42 */
        System.out.println("2" + 2 + 2); /* 222 */
        System.out.println("2" + 2 + 1 + 1); /* 2211 */
    }
}

/* 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input.charAt(0) == 'J' || input.charAt(0) ==  'j');
    }
}
En este ejemplo es BUENA PRAXIS usar .charAt(0) que usar startsWith(prefix) ya que solo es un caracter
*/

/* Dato Interesante de Operadores Logicos
AND -> &&
OR -> ||
XOR -> ^ (AltGr + {)
Algo interesante, que el && y || los operadores no evalúan el segundo argumento si no es necesario. Cuando el primer argumento del operador && se evalúa como falso, el valor general debe ser falso; y cuando el primer argumento del || operador se evalúa como verdadero, el valor general debe ser verdadero. Entonces:

falso && ... -> falso, ya que no es necesario saber cuál es el lado derecho;
verdadero || ... -> cierto, ya que no es necesario saber cuál es el lado derecho.
Este comportamiento se conoce como evaluación de cortocircuito (no lo confunda con un cortocircuito eléctrico). Reduce el tiempo de cálculo, pero también se puede utilizar para evitar algunos errores en los programas.
*/