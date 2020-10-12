package Clases;

/* Un método es una secuencia de declaraciones agrupadas para realizar una operación. En Java, un método siempre se encuentra dentro de una clase. La relación entre métodos y clases se aprenderá más. En este tema, todos los métodos se ubicarán en la misma clase que contiene el método principal.

La razón principal para escribir métodos es descomponer un programa en pequeñas subrutinas reutilizables. Estas subrutinas se pueden utilizar muchas veces en lugar de volver a escribir siempre el código. Un programa descompuesto tiene una estructura modular y es mucho más fácil de modificar y mantener que un programa que consta de un único método principal grande. Es una idea importante de la programación procedimental.

En este tema, aprenderá a definir nuevos métodos. Se supone que ya sabe cómo invocar métodos existentes. 


En el caso general, un método tiene los siguientes seis componentes:

    1)* un conjunto de modificadores (público, estático, etc.);
    2) un tipo de valor de retorno;
    3)* un nombre;
    4) una lista de parámetros (también conocidos como parámetros formales) entre paréntesis ();
    5) una lista de excepciones;
    6)* un cuerpo que contiene declaraciones para realizar la operación.

Tenga en cuenta que los componentes se enumeran aquí en el orden correcto para la declaración del método en Java. Digamos por ahora que algunos de estos componentes siempre son obligatorios (los marcados con *) y otros son opcionales. También se requiere un par de paréntesis (), así como {} para encerrar el cuerpo del método.

Ahora, nos centraremos en los componentes 2, 3, 4 y 6. Los modificadores se aprenderán en temas relacionados con la programación orientada a objetos.


*******Defining a simple method
La suma es un método típico escrito en Java. Devuelve la suma de dos de sus parámetros. Los parámetros están escritos entre paréntesis "(...)". Para devolver el resultado entero, se escribe la palabra clave return.

En el caso general, el valor de retorno y los parámetros pueden tener cualquier tipo, incluidos los tipos no primitivos.

Además, el método tiene dos modificadores: público y estático. Tenga en cuenta que hay un orden recomendado para los modificadores que puede encontrar en la Especificación del lenguaje Java. Aunque es técnicamente posible escribir público estático en su lugar, no seguir el orden sugerido reducirá la legibilidad de su código y se considerará una mala práctica. Todos nuestros ejemplos cumplen con las recomendaciones.


*******Signature
La combinación del nombre de un método y sus parámetros se llama firma (signature). No incluye el tipo de retorno, los modificadores ni los nombres de los parámetros.

La suma del método considerado tiene la siguiente firma suma (int, int).

A continuación, se muestran algunos ejemplos de otras firmas:

    suma (doble, doble)
    min (largo, largo, largo)
    getValue ()

Más adelante aprenderemos cuándo es útil el concepto de firma.


******Naming methods
Hay dos tipos de restricciones para el nombre de un método: el compilador (obligatorio) y la convención de nomenclatura (opcional, pero deseada).

El compilador de Java requiere que el nombre de un método pueda ser un identificador legal. Las reglas para los identificadores legales son las siguientes:

    * los identificadores distinguen entre mayúsculas y minúsculas;
    * un identificador puede incluir letras Unicode, dígitos y dos caracteres especiales ($, _);
    * un identificador no puede comenzar con un dígito;
    * los identificadores no deben ser una palabra clave.

Además, existe una convención de nomenclatura que restringe los posibles nombres de métodos. Es opcional pero deseado para los desarrolladores.

Según la convención, los nombres de los métodos deben ser un verbo en minúsculas o un nombre de varias palabras que comience con un verbo en minúsculas, seguido de adjetivos, sustantivos, etc. En los nombres de varias palabras, la primera letra de la segunda y las siguientes palabras debe estar en mayúscula. A continuación se muestran algunos ejemplos correctos:

    sum
    getValue
    calculateNumberOfOranges
    findUserByName
    printArray


Un método puede devolver un valor único o nada. Para declarar un método que no devuelve nada, debe escribir la palabra clave especial void como el tipo de valor de resultado.

Un método puede tomar uno o varios parámetros del mismo tipo o de tipos diferentes. Además, es posible declarar un método sin ningún parámetro, pero todavía se requieren "()".

Cuando llama a un método con un valor de tipo primitivo, se crea una copia del valor. Dentro de un método, puede procesar esta copia. Si lo cambia, el argumento pasado no cambia. (Paso por valor).

En el cuerpo de un método, puede escribir cualquier declaración, incluida la declaración condicional, los bucles, la invocación de métodos y la declaración de variables locales. Las variables declaradas son visibles solo en este método.

Si un método devuelve un valor, el cuerpo del método debe contener la palabra clave return. Además, un método puede tener múltiples retornos. Pero cada estado puede devolver solo un valor.



Si un método no devuelve un valor (tiene la palabra clave void), el cuerpo del método puede contener la palabra clave return sin devolver el valor. Permite finalizar el método antes de lo previsto, por ejemplo, según una condición.

*/

public class C09_Methods {
    public static void main(String[] args) {
        System.out.println(sum(20, 30));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

/**
The method has an int parameter
*/
    public static void method1(int a) {
        // do something
    }

/**
The method has long and double parameters
*/
    public static void method2(long a, double b) {
        // do something
    }

/**
The method has no parameters and returns a value
*/ 
    public static int method3() {
        return 3;
    }

/**
The method has an int parameter and returns an array of Strings
*/
    public static String[] createArray(int lengthOfArray) {
        return new String[lengthOfArray];
    }

/* El método divideBy2 toma dos números enteros y devuelve otro valor entero. Si el tiempo del parámetro especificado es menor o igual a cero, el resultado es el número dado; de lo contrario, el método realiza la división entera por dos en un ciclo. */
    public static int divideBy2(int number, int times) {
        if (times <= 0) {
            return number;
        }
            
        for (int i = 0; i < times; i++) {
            number /= 2;
        }
            
        return number;
    }

/* el siguiente método imprime sus argumentos si los números dados son positivos; de lo contrario, realiza la declaración de retorno. */
public static void returnNothingOrPrintNumbers(int a, int b) {
    if (a <= 0 || b <= 0) {
        return;
    }

    System.out.println(a + " " + b);
}
}