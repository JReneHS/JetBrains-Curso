package Clases;

/* Este tipo puede representar todos los caracteres en todos los idiomas, así como algunos símbolos especiales y de computadora. Corresponde al formato Unicode. Unicode es una metodología de codificación por computadora que asigna un número único para cada carácter. No importa en qué idioma o plataforma de computadora se encuentre. Esto es importante en un mundo global en red y para sistemas informáticos que deben admitir varios idiomas y caracteres especiales. Unicode realmente unifica todos estos en un solo estándar.

También se puede crear un carácter utilizando su código hex en la tabla Unicode. El código es '\ u'
El tipo char tiene un valor mínimo codificado como '\u0000' y el valor máximo codificado como '\uffff'.

Cualquier variable char puede considerarse como un valor entero sin signo en el rango de 0 a 65535 */

/* Recuperando caracteres posteriores

Hay dos operadores para sumar (+) y restar (-) números enteros para obtener el carácter siguiente y anterior de acuerdo con el orden Unicode. 
    char ch = 'b';
    ch += 1; // 'c'
    ch -= 2; // 'a'

También es posible sumar y restar un carácter a otro:
    char ch = 'b';
    ch += 'a';
    ch -= 'b';
    System.out.println(ch); // prints 'a' without quotes

En realidad, estas operaciones manipulan con códigos de caracteres, 'b' tiene el siguiente código después de 'a'.
Es posible utilizar operadores de incremento (++) y decremento (--) en formas de prefijo y sufijo.
*/

/* Secuencias de Escape o de Control

Hay algunos caracteres especiales que comienzan con barra invertida \ que se conocen como secuencias de escape o de control. No tienen los símbolos correspondientes y no se pueden encontrar en un teclado. Para representar tales caracteres usamos un par de símbolos regulares. En un programa, este par se considerará exactamente como un carácter con el código apropiado:

    '\n' is the newline character;
    '\t' is the tab character;
    '\r' is the carriage return character;
    '\\' is the backslash character itself;
    '\'' is the single quote mark;
    '\"' is the double quote mark.

*/

public class C03_Characters {
    public static void main(String[] args) {
        
    }
}